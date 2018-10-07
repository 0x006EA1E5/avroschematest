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
public class EmbeddedMap extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 907971120510099664L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EmbeddedMap\",\"namespace\":\"me.geales.avro\",\"fields\":[{\"name\":\"map\",\"type\":{\"type\":\"map\",\"values\":[\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",\"EmbeddedMap\",{\"type\":\"record\",\"name\":\"EmbeddedList\",\"fields\":[{\"name\":\"list\",\"type\":{\"type\":\"array\",\"items\":[\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",\"EmbeddedMap\",\"EmbeddedList\"]}},{\"name\":\"containsEmbeddedMap\",\"type\":\"boolean\"},{\"name\":\"containsEmbeddedList\",\"type\":\"boolean\"}]}]}},{\"name\":\"containsEmbeddedMap\",\"type\":\"boolean\"},{\"name\":\"containsEmbeddedList\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EmbeddedMap> ENCODER =
      new BinaryMessageEncoder<EmbeddedMap>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EmbeddedMap> DECODER =
      new BinaryMessageDecoder<EmbeddedMap>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<EmbeddedMap> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<EmbeddedMap> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<EmbeddedMap>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this EmbeddedMap to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a EmbeddedMap from a ByteBuffer. */
  public static EmbeddedMap fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Object> map;
  @Deprecated public boolean containsEmbeddedMap;
  @Deprecated public boolean containsEmbeddedList;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EmbeddedMap() {}

  /**
   * All-args constructor.
   * @param map The new value for map
   * @param containsEmbeddedMap The new value for containsEmbeddedMap
   * @param containsEmbeddedList The new value for containsEmbeddedList
   */
  public EmbeddedMap(java.util.Map<java.lang.CharSequence,java.lang.Object> map, java.lang.Boolean containsEmbeddedMap, java.lang.Boolean containsEmbeddedList) {
    this.map = map;
    this.containsEmbeddedMap = containsEmbeddedMap;
    this.containsEmbeddedList = containsEmbeddedList;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return map;
    case 1: return containsEmbeddedMap;
    case 2: return containsEmbeddedList;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: map = (java.util.Map<java.lang.CharSequence,java.lang.Object>)value$; break;
    case 1: containsEmbeddedMap = (java.lang.Boolean)value$; break;
    case 2: containsEmbeddedList = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'map' field.
   * @return The value of the 'map' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Object> getMap() {
    return map;
  }

  /**
   * Sets the value of the 'map' field.
   * @param value the value to set.
   */
  public void setMap(java.util.Map<java.lang.CharSequence,java.lang.Object> value) {
    this.map = value;
  }

  /**
   * Gets the value of the 'containsEmbeddedMap' field.
   * @return The value of the 'containsEmbeddedMap' field.
   */
  public java.lang.Boolean getContainsEmbeddedMap() {
    return containsEmbeddedMap;
  }

  /**
   * Sets the value of the 'containsEmbeddedMap' field.
   * @param value the value to set.
   */
  public void setContainsEmbeddedMap(java.lang.Boolean value) {
    this.containsEmbeddedMap = value;
  }

  /**
   * Gets the value of the 'containsEmbeddedList' field.
   * @return The value of the 'containsEmbeddedList' field.
   */
  public java.lang.Boolean getContainsEmbeddedList() {
    return containsEmbeddedList;
  }

  /**
   * Sets the value of the 'containsEmbeddedList' field.
   * @param value the value to set.
   */
  public void setContainsEmbeddedList(java.lang.Boolean value) {
    this.containsEmbeddedList = value;
  }

  /**
   * Creates a new EmbeddedMap RecordBuilder.
   * @return A new EmbeddedMap RecordBuilder
   */
  public static me.geales.avro.EmbeddedMap.Builder newBuilder() {
    return new me.geales.avro.EmbeddedMap.Builder();
  }

  /**
   * Creates a new EmbeddedMap RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EmbeddedMap RecordBuilder
   */
  public static me.geales.avro.EmbeddedMap.Builder newBuilder(me.geales.avro.EmbeddedMap.Builder other) {
    return new me.geales.avro.EmbeddedMap.Builder(other);
  }

  /**
   * Creates a new EmbeddedMap RecordBuilder by copying an existing EmbeddedMap instance.
   * @param other The existing instance to copy.
   * @return A new EmbeddedMap RecordBuilder
   */
  public static me.geales.avro.EmbeddedMap.Builder newBuilder(me.geales.avro.EmbeddedMap other) {
    return new me.geales.avro.EmbeddedMap.Builder(other);
  }

  /**
   * RecordBuilder for EmbeddedMap instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EmbeddedMap>
    implements org.apache.avro.data.RecordBuilder<EmbeddedMap> {

    private java.util.Map<java.lang.CharSequence,java.lang.Object> map;
    private boolean containsEmbeddedMap;
    private boolean containsEmbeddedList;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(me.geales.avro.EmbeddedMap.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.map)) {
        this.map = data().deepCopy(fields()[0].schema(), other.map);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.containsEmbeddedMap)) {
        this.containsEmbeddedMap = data().deepCopy(fields()[1].schema(), other.containsEmbeddedMap);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.containsEmbeddedList)) {
        this.containsEmbeddedList = data().deepCopy(fields()[2].schema(), other.containsEmbeddedList);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing EmbeddedMap instance
     * @param other The existing instance to copy.
     */
    private Builder(me.geales.avro.EmbeddedMap other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.map)) {
        this.map = data().deepCopy(fields()[0].schema(), other.map);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.containsEmbeddedMap)) {
        this.containsEmbeddedMap = data().deepCopy(fields()[1].schema(), other.containsEmbeddedMap);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.containsEmbeddedList)) {
        this.containsEmbeddedList = data().deepCopy(fields()[2].schema(), other.containsEmbeddedList);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'map' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.Object> getMap() {
      return map;
    }

    /**
      * Sets the value of the 'map' field.
      * @param value The value of 'map'.
      * @return This builder.
      */
    public me.geales.avro.EmbeddedMap.Builder setMap(java.util.Map<java.lang.CharSequence,java.lang.Object> value) {
      validate(fields()[0], value);
      this.map = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'map' field has been set.
      * @return True if the 'map' field has been set, false otherwise.
      */
    public boolean hasMap() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'map' field.
      * @return This builder.
      */
    public me.geales.avro.EmbeddedMap.Builder clearMap() {
      map = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'containsEmbeddedMap' field.
      * @return The value.
      */
    public java.lang.Boolean getContainsEmbeddedMap() {
      return containsEmbeddedMap;
    }

    /**
      * Sets the value of the 'containsEmbeddedMap' field.
      * @param value The value of 'containsEmbeddedMap'.
      * @return This builder.
      */
    public me.geales.avro.EmbeddedMap.Builder setContainsEmbeddedMap(boolean value) {
      validate(fields()[1], value);
      this.containsEmbeddedMap = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'containsEmbeddedMap' field has been set.
      * @return True if the 'containsEmbeddedMap' field has been set, false otherwise.
      */
    public boolean hasContainsEmbeddedMap() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'containsEmbeddedMap' field.
      * @return This builder.
      */
    public me.geales.avro.EmbeddedMap.Builder clearContainsEmbeddedMap() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'containsEmbeddedList' field.
      * @return The value.
      */
    public java.lang.Boolean getContainsEmbeddedList() {
      return containsEmbeddedList;
    }

    /**
      * Sets the value of the 'containsEmbeddedList' field.
      * @param value The value of 'containsEmbeddedList'.
      * @return This builder.
      */
    public me.geales.avro.EmbeddedMap.Builder setContainsEmbeddedList(boolean value) {
      validate(fields()[2], value);
      this.containsEmbeddedList = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'containsEmbeddedList' field has been set.
      * @return True if the 'containsEmbeddedList' field has been set, false otherwise.
      */
    public boolean hasContainsEmbeddedList() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'containsEmbeddedList' field.
      * @return This builder.
      */
    public me.geales.avro.EmbeddedMap.Builder clearContainsEmbeddedList() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EmbeddedMap build() {
      try {
        EmbeddedMap record = new EmbeddedMap();
        record.map = fieldSetFlags()[0] ? this.map : (java.util.Map<java.lang.CharSequence,java.lang.Object>) defaultValue(fields()[0]);
        record.containsEmbeddedMap = fieldSetFlags()[1] ? this.containsEmbeddedMap : (java.lang.Boolean) defaultValue(fields()[1]);
        record.containsEmbeddedList = fieldSetFlags()[2] ? this.containsEmbeddedList : (java.lang.Boolean) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EmbeddedMap>
    WRITER$ = (org.apache.avro.io.DatumWriter<EmbeddedMap>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EmbeddedMap>
    READER$ = (org.apache.avro.io.DatumReader<EmbeddedMap>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
