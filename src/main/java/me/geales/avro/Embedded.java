/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package me.geales.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Embedded extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4509396436082203816L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Embedded\",\"namespace\":\"me.geales.avro\",\"fields\":[{\"name\":\"header\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"HeaderRecord\",\"fields\":[{\"name\":\"appID\",\"type\":\"string\"}]}]},{\"name\":\"myMap\",\"type\":{\"type\":\"map\",\"values\":[\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",\"Embedded\",{\"type\":\"map\",\"values\":[\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",\"Embedded\"]},{\"type\":\"array\",\"items\":[\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",\"Embedded\"]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Embedded> ENCODER =
      new BinaryMessageEncoder<Embedded>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Embedded> DECODER =
      new BinaryMessageDecoder<Embedded>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Embedded> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Embedded> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Embedded>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Embedded to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Embedded from a ByteBuffer. */
  public static Embedded fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public me.geales.avro.HeaderRecord header;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Object> myMap;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Embedded() {}

  /**
   * All-args constructor.
   * @param header The new value for header
   * @param myMap The new value for myMap
   */
  public Embedded(me.geales.avro.HeaderRecord header, java.util.Map<java.lang.CharSequence,java.lang.Object> myMap) {
    this.header = header;
    this.myMap = myMap;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return header;
    case 1: return myMap;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: header = (me.geales.avro.HeaderRecord)value$; break;
    case 1: myMap = (java.util.Map<java.lang.CharSequence,java.lang.Object>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'header' field.
   * @return The value of the 'header' field.
   */
  public me.geales.avro.HeaderRecord getHeader() {
    return header;
  }

  /**
   * Sets the value of the 'header' field.
   * @param value the value to set.
   */
  public void setHeader(me.geales.avro.HeaderRecord value) {
    this.header = value;
  }

  /**
   * Gets the value of the 'myMap' field.
   * @return The value of the 'myMap' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Object> getMyMap() {
    return myMap;
  }

  /**
   * Sets the value of the 'myMap' field.
   * @param value the value to set.
   */
  public void setMyMap(java.util.Map<java.lang.CharSequence,java.lang.Object> value) {
    this.myMap = value;
  }

  /**
   * Creates a new Embedded RecordBuilder.
   * @return A new Embedded RecordBuilder
   */
  public static me.geales.avro.Embedded.Builder newBuilder() {
    return new me.geales.avro.Embedded.Builder();
  }

  /**
   * Creates a new Embedded RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Embedded RecordBuilder
   */
  public static me.geales.avro.Embedded.Builder newBuilder(me.geales.avro.Embedded.Builder other) {
    return new me.geales.avro.Embedded.Builder(other);
  }

  /**
   * Creates a new Embedded RecordBuilder by copying an existing Embedded instance.
   * @param other The existing instance to copy.
   * @return A new Embedded RecordBuilder
   */
  public static me.geales.avro.Embedded.Builder newBuilder(me.geales.avro.Embedded other) {
    return new me.geales.avro.Embedded.Builder(other);
  }

  /**
   * RecordBuilder for Embedded instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Embedded>
    implements org.apache.avro.data.RecordBuilder<Embedded> {

    private me.geales.avro.HeaderRecord header;
    private me.geales.avro.HeaderRecord.Builder headerBuilder;
    private java.util.Map<java.lang.CharSequence,java.lang.Object> myMap;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(me.geales.avro.Embedded.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.header)) {
        this.header = data().deepCopy(fields()[0].schema(), other.header);
        fieldSetFlags()[0] = true;
      }
      if (other.hasHeaderBuilder()) {
        this.headerBuilder = me.geales.avro.HeaderRecord.newBuilder(other.getHeaderBuilder());
      }
      if (isValidValue(fields()[1], other.myMap)) {
        this.myMap = data().deepCopy(fields()[1].schema(), other.myMap);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Embedded instance
     * @param other The existing instance to copy.
     */
    private Builder(me.geales.avro.Embedded other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.header)) {
        this.header = data().deepCopy(fields()[0].schema(), other.header);
        fieldSetFlags()[0] = true;
      }
      this.headerBuilder = null;
      if (isValidValue(fields()[1], other.myMap)) {
        this.myMap = data().deepCopy(fields()[1].schema(), other.myMap);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'header' field.
      * @return The value.
      */
    public me.geales.avro.HeaderRecord getHeader() {
      return header;
    }

    /**
      * Sets the value of the 'header' field.
      * @param value The value of 'header'.
      * @return This builder.
      */
    public me.geales.avro.Embedded.Builder setHeader(me.geales.avro.HeaderRecord value) {
      validate(fields()[0], value);
      this.headerBuilder = null;
      this.header = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'header' field has been set.
      * @return True if the 'header' field has been set, false otherwise.
      */
    public boolean hasHeader() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'header' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public me.geales.avro.HeaderRecord.Builder getHeaderBuilder() {
      if (headerBuilder == null) {
        if (hasHeader()) {
          setHeaderBuilder(me.geales.avro.HeaderRecord.newBuilder(header));
        } else {
          setHeaderBuilder(me.geales.avro.HeaderRecord.newBuilder());
        }
      }
      return headerBuilder;
    }

    /**
     * Sets the Builder instance for the 'header' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public me.geales.avro.Embedded.Builder setHeaderBuilder(me.geales.avro.HeaderRecord.Builder value) {
      clearHeader();
      headerBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'header' field has an active Builder instance
     * @return True if the 'header' field has an active Builder instance
     */
    public boolean hasHeaderBuilder() {
      return headerBuilder != null;
    }

    /**
      * Clears the value of the 'header' field.
      * @return This builder.
      */
    public me.geales.avro.Embedded.Builder clearHeader() {
      header = null;
      headerBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'myMap' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.Object> getMyMap() {
      return myMap;
    }

    /**
      * Sets the value of the 'myMap' field.
      * @param value The value of 'myMap'.
      * @return This builder.
      */
    public me.geales.avro.Embedded.Builder setMyMap(java.util.Map<java.lang.CharSequence,java.lang.Object> value) {
      validate(fields()[1], value);
      this.myMap = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'myMap' field has been set.
      * @return True if the 'myMap' field has been set, false otherwise.
      */
    public boolean hasMyMap() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'myMap' field.
      * @return This builder.
      */
    public me.geales.avro.Embedded.Builder clearMyMap() {
      myMap = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Embedded build() {
      try {
        Embedded record = new Embedded();
        if (headerBuilder != null) {
          record.header = this.headerBuilder.build();
        } else {
          record.header = fieldSetFlags()[0] ? this.header : (me.geales.avro.HeaderRecord) defaultValue(fields()[0]);
        }
        record.myMap = fieldSetFlags()[1] ? this.myMap : (java.util.Map<java.lang.CharSequence,java.lang.Object>) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Embedded>
    WRITER$ = (org.apache.avro.io.DatumWriter<Embedded>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Embedded>
    READER$ = (org.apache.avro.io.DatumReader<Embedded>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}