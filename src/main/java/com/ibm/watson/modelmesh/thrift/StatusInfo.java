/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ibm.watson.modelmesh.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)")
public class StatusInfo implements org.apache.thrift.TBase<StatusInfo, StatusInfo._Fields>, java.io.Serializable, Cloneable, Comparable<StatusInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StatusInfo");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_MESSAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessages", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StatusInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StatusInfoTupleSchemeFactory();

  /**
   * 
   * @see Status
   */
  public @org.apache.thrift.annotation.Nullable Status status; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> errorMessages; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see Status
     */
    STATUS((short)1, "status"),
    ERROR_MESSAGES((short)2, "errorMessages");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // ERROR_MESSAGES
          return ERROR_MESSAGES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Status.class)));
    tmpMap.put(_Fields.ERROR_MESSAGES, new org.apache.thrift.meta_data.FieldMetaData("errorMessages", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StatusInfo.class, metaDataMap);
  }

  public StatusInfo() {
  }

  public StatusInfo(
    Status status,
    java.util.List<java.lang.String> errorMessages)
  {
    this();
    this.status = status;
    this.errorMessages = errorMessages;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StatusInfo(StatusInfo other) {
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetErrorMessages()) {
      java.util.List<java.lang.String> __this__errorMessages = new java.util.ArrayList<java.lang.String>(other.errorMessages);
      this.errorMessages = __this__errorMessages;
    }
  }

  public StatusInfo deepCopy() {
    return new StatusInfo(this);
  }

  @Override
  public void clear() {
    this.status = null;
    if (this.errorMessages != null) {
      this.errorMessages.clear();
    }
  }

  /**
   * 
   * @see Status
   */
  @org.apache.thrift.annotation.Nullable
  public Status getStatus() {
    return this.status;
  }

  /**
   * 
   * @see Status
   */
  public StatusInfo setStatus(@org.apache.thrift.annotation.Nullable Status status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getErrorMessagesSize() {
    return (this.errorMessages == null) ? 0 : this.errorMessages.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getErrorMessagesIterator() {
    return (this.errorMessages == null) ? null : this.errorMessages.iterator();
  }

  public void addToErrorMessages(java.lang.String elem) {
    if (this.errorMessages == null) {
      this.errorMessages = new java.util.ArrayList<java.lang.String>();
    }
    this.errorMessages.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getErrorMessages() {
    return this.errorMessages;
  }

  public StatusInfo setErrorMessages(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public void unsetErrorMessages() {
    this.errorMessages = null;
  }

  /** Returns true if field errorMessages is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMessages() {
    return this.errorMessages != null;
  }

  public void setErrorMessagesIsSet(boolean value) {
    if (!value) {
      this.errorMessages = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Status)value);
      }
      break;

    case ERROR_MESSAGES:
      if (value == null) {
        unsetErrorMessages();
      } else {
        setErrorMessages((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case ERROR_MESSAGES:
      return getErrorMessages();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case ERROR_MESSAGES:
      return isSetErrorMessages();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof StatusInfo)
      return this.equals((StatusInfo)that);
    return false;
  }

  public boolean equals(StatusInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_errorMessages = true && this.isSetErrorMessages();
    boolean that_present_errorMessages = true && that.isSetErrorMessages();
    if (this_present_errorMessages || that_present_errorMessages) {
      if (!(this_present_errorMessages && that_present_errorMessages))
        return false;
      if (!this.errorMessages.equals(that.errorMessages))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    hashCode = hashCode * 8191 + ((isSetErrorMessages()) ? 131071 : 524287);
    if (isSetErrorMessages())
      hashCode = hashCode * 8191 + errorMessages.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(StatusInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetErrorMessages(), other.isSetErrorMessages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMessages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorMessages, other.errorMessages);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("StatusInfo(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorMessages:");
    if (this.errorMessages == null) {
      sb.append("null");
    } else {
      sb.append(this.errorMessages);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StatusInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StatusInfoStandardScheme getScheme() {
      return new StatusInfoStandardScheme();
    }
  }

  private static class StatusInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<StatusInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StatusInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.ibm.watson.modelmesh.thrift.Status.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_MESSAGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                if (struct.errorMessages == null) {
                  struct.errorMessages = new java.util.ArrayList<java.lang.String>(_list0.size);
                }
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1 = null;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.errorMessages.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setErrorMessagesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StatusInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.errorMessages != null) {
        oprot.writeFieldBegin(ERROR_MESSAGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.errorMessages.size()));
          for (java.lang.String _iter3 : struct.errorMessages)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StatusInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StatusInfoTupleScheme getScheme() {
      return new StatusInfoTupleScheme();
    }
  }

  private static class StatusInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<StatusInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StatusInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.status.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetErrorMessages()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetErrorMessages()) {
        {
          oprot.writeI32(struct.errorMessages.size());
          for (java.lang.String _iter4 : struct.errorMessages)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StatusInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = com.ibm.watson.modelmesh.thrift.Status.findByValue(iprot.readI32());
      struct.setStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          if (struct.errorMessages == null) {
            struct.errorMessages = new java.util.ArrayList<java.lang.String>(_list5.size);
          }
          @org.apache.thrift.annotation.Nullable java.lang.String _elem6 = null;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.errorMessages.add(_elem6);
          }
        }
        struct.setErrorMessagesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

