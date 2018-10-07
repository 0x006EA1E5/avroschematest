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

import java.util.Map;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EmbeddedMap extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4660618526696836502L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EmbeddedMap\",\"namespace\":\"me.geales.avro\",\"fields\":[{\"name\":\"map\",\"type\":{\"type\":\"map\",\"values\":[\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",\"EmbeddedMap\",{\"type\":\"record\",\"name\":\"EmbeddedList\",\"fields\":[{\"name\":\"list\",\"type\":{\"type\":\"array\",\"items\":[\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",\"EmbeddedMap\",\"EmbeddedList\"]}}]}]}}]}");
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
  public static Map<CharSequence, Object> fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b).getMap();
  }

  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Object> map;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EmbeddedMap() {}

  /**
   * All-args constructor.
   * @param map The new value for map
   */
  public EmbeddedMap(java.util.Map<java.lang.CharSequence,java.lang.Object> map) {
    this.map = map;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return map;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: map = (java.util.Map<java.lang.CharSequence,java.lang.Object>)value$; break;
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

    @Override
    @SuppressWarnings("unchecked")
    public EmbeddedMap build() {
      try {
        EmbeddedMap record = new EmbeddedMap();
        record.map = fieldSetFlags()[0] ? this.map : (java.util.Map<java.lang.CharSequence,java.lang.Object>) defaultValue(fields()[0]);
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