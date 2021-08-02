/*
 * Copyright 2021 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ibm.watson.modelmesh;

import com.google.common.collect.ImmutableMap;
import com.ibm.watson.modelmesh.api.ModelInfo;
import com.ibm.watson.modelmesh.api.ModelMeshGrpc;
import com.ibm.watson.modelmesh.api.ModelMeshGrpc.ModelMeshBlockingStub;
import com.ibm.watson.modelmesh.api.RegisterModelRequest;
import com.ibm.watson.modelmesh.api.UnregisterModelRequest;
import com.ibm.watson.modelmesh.example.api.ExamplePredictorGrpc;
import com.ibm.watson.modelmesh.example.api.ExamplePredictorGrpc.ExamplePredictorBlockingStub;
import com.ibm.watson.modelmesh.example.api.Predictor.PredictRequest;
import com.ibm.watson.modelmesh.example.api.Predictor.PredictResponse;
import io.grpc.ManagedChannel;
import io.grpc.Status;
import io.grpc.Status.Code;
import io.grpc.netty.NettyChannelBuilder;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 */
public class ModelMeshIdInjectTest extends AbstractModelMeshClusterTest {

    @Override
    protected int replicaCount() {
        return 1;
    }

    @Override
    protected Map<String, String> extraRuntimeEnvVars() {
        return ImmutableMap.of("RS_METHOD_INFOS", "mmesh.ExamplePredictor/predict=1");
    }

    @Test
    public void idInjectionTest() throws Exception {

        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        try {
            ModelMeshBlockingStub manageModels = ModelMeshGrpc.newBlockingStub(channel);
            ExamplePredictorBlockingStub useModels = ExamplePredictorGrpc.newBlockingStub(channel);

            // add a model
            String modelId = "myModel";
            manageModels.registerModel(RegisterModelRequest.newBuilder()
                    .setModelId(modelId).setModelInfo(ModelInfo.newBuilder().setType("ExampleType").build())
                    .setLoadNow(true).build());
            PredictRequest req = PredictRequest.newBuilder()
                    .setText("predict me!").setModelName("should be overridden").build();
            PredictResponse response = forModel(useModels, modelId).predict(req);
            assertEquals("classification for predict me! by model myModel",
                    response.getResults(0).getCategory());

            try {
                useModels.predict(req);
                fail("Request with no model id should fail");
            } catch (Exception e) {
                System.out.println(e);
                assertEquals(Code.INVALID_ARGUMENT, Status.fromThrowable(e).getCode());
            }

            // verify that the model id was injected as the model name
            // (which is reflected back as the second "category" in the result)
            assertEquals(modelId, response.getResults(1).getCategory());
            try {
                forModel(useModels, modelId).multiPredict(req);
                fail("Attempt to call restricted method should have failed");
            } catch (Exception e) {
                System.out.println(e);
                assertEquals(Status.Code.UNIMPLEMENTED, Status.fromThrowable(e).getCode());
            }

            // delete
            manageModels.unregisterModel(UnregisterModelRequest.newBuilder()
                    .setModelId(modelId).build());
        } finally {
            channel.shutdown();
        }
    }
}
