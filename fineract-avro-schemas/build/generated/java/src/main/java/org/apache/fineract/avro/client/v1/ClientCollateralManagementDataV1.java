/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

package org.apache.fineract.avro.client.v1;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ClientCollateralManagementDataV1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord, org.apache.fineract.avro.generator.ByteBufferSerializable {
  private static final long serialVersionUID = 830975394665684091L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ClientCollateralManagementDataV1\",\"namespace\":\"org.apache.fineract.avro.client.v1\",\"fields\":[{\"name\":\"quantity\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"pctToBase\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"unitPrice\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"total\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"totalCollateral\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<ClientCollateralManagementDataV1> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ClientCollateralManagementDataV1> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ClientCollateralManagementDataV1> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ClientCollateralManagementDataV1> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ClientCollateralManagementDataV1> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ClientCollateralManagementDataV1 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  @Override
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ClientCollateralManagementDataV1 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ClientCollateralManagementDataV1 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ClientCollateralManagementDataV1 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.math.BigDecimal quantity;
  private java.lang.Long id;
  private java.math.BigDecimal pctToBase;
  private java.math.BigDecimal unitPrice;
  private java.math.BigDecimal total;
  private java.math.BigDecimal totalCollateral;
  private java.lang.String name;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ClientCollateralManagementDataV1() {}

  /**
   * All-args constructor.
   * @param quantity The new value for quantity
   * @param id The new value for id
   * @param pctToBase The new value for pctToBase
   * @param unitPrice The new value for unitPrice
   * @param total The new value for total
   * @param totalCollateral The new value for totalCollateral
   * @param name The new value for name
   */
  public ClientCollateralManagementDataV1(java.math.BigDecimal quantity, java.lang.Long id, java.math.BigDecimal pctToBase, java.math.BigDecimal unitPrice, java.math.BigDecimal total, java.math.BigDecimal totalCollateral, java.lang.String name) {
    this.quantity = quantity;
    this.id = id;
    this.pctToBase = pctToBase;
    this.unitPrice = unitPrice;
    this.total = total;
    this.totalCollateral = totalCollateral;
    this.name = name;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return quantity;
    case 1: return id;
    case 2: return pctToBase;
    case 3: return unitPrice;
    case 4: return total;
    case 5: return totalCollateral;
    case 6: return name;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: quantity = (java.math.BigDecimal)value$; break;
    case 1: id = (java.lang.Long)value$; break;
    case 2: pctToBase = (java.math.BigDecimal)value$; break;
    case 3: unitPrice = (java.math.BigDecimal)value$; break;
    case 4: total = (java.math.BigDecimal)value$; break;
    case 5: totalCollateral = (java.math.BigDecimal)value$; break;
    case 6: name = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public java.math.BigDecimal getQuantity() {
    return quantity;
  }


  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(java.math.BigDecimal value) {
    this.quantity = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'pctToBase' field.
   * @return The value of the 'pctToBase' field.
   */
  public java.math.BigDecimal getPctToBase() {
    return pctToBase;
  }


  /**
   * Sets the value of the 'pctToBase' field.
   * @param value the value to set.
   */
  public void setPctToBase(java.math.BigDecimal value) {
    this.pctToBase = value;
  }

  /**
   * Gets the value of the 'unitPrice' field.
   * @return The value of the 'unitPrice' field.
   */
  public java.math.BigDecimal getUnitPrice() {
    return unitPrice;
  }


  /**
   * Sets the value of the 'unitPrice' field.
   * @param value the value to set.
   */
  public void setUnitPrice(java.math.BigDecimal value) {
    this.unitPrice = value;
  }

  /**
   * Gets the value of the 'total' field.
   * @return The value of the 'total' field.
   */
  public java.math.BigDecimal getTotal() {
    return total;
  }


  /**
   * Sets the value of the 'total' field.
   * @param value the value to set.
   */
  public void setTotal(java.math.BigDecimal value) {
    this.total = value;
  }

  /**
   * Gets the value of the 'totalCollateral' field.
   * @return The value of the 'totalCollateral' field.
   */
  public java.math.BigDecimal getTotalCollateral() {
    return totalCollateral;
  }


  /**
   * Sets the value of the 'totalCollateral' field.
   * @param value the value to set.
   */
  public void setTotalCollateral(java.math.BigDecimal value) {
    this.totalCollateral = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Creates a new ClientCollateralManagementDataV1 RecordBuilder.
   * @return A new ClientCollateralManagementDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder newBuilder() {
    return new org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder();
  }

  /**
   * Creates a new ClientCollateralManagementDataV1 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ClientCollateralManagementDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder newBuilder(org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder other) {
    if (other == null) {
      return new org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder(other);
    }
  }

  /**
   * Creates a new ClientCollateralManagementDataV1 RecordBuilder by copying an existing ClientCollateralManagementDataV1 instance.
   * @param other The existing instance to copy.
   * @return A new ClientCollateralManagementDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder newBuilder(org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1 other) {
    if (other == null) {
      return new org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder(other);
    }
  }

  /**
   * RecordBuilder for ClientCollateralManagementDataV1 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ClientCollateralManagementDataV1>
    implements org.apache.avro.data.RecordBuilder<ClientCollateralManagementDataV1> {

    private java.math.BigDecimal quantity;
    private java.lang.Long id;
    private java.math.BigDecimal pctToBase;
    private java.math.BigDecimal unitPrice;
    private java.math.BigDecimal total;
    private java.math.BigDecimal totalCollateral;
    private java.lang.String name;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.quantity)) {
        this.quantity = data().deepCopy(fields()[0].schema(), other.quantity);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.pctToBase)) {
        this.pctToBase = data().deepCopy(fields()[2].schema(), other.pctToBase);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.unitPrice)) {
        this.unitPrice = data().deepCopy(fields()[3].schema(), other.unitPrice);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.total)) {
        this.total = data().deepCopy(fields()[4].schema(), other.total);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.totalCollateral)) {
        this.totalCollateral = data().deepCopy(fields()[5].schema(), other.totalCollateral);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.name)) {
        this.name = data().deepCopy(fields()[6].schema(), other.name);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing ClientCollateralManagementDataV1 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1 other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.quantity)) {
        this.quantity = data().deepCopy(fields()[0].schema(), other.quantity);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pctToBase)) {
        this.pctToBase = data().deepCopy(fields()[2].schema(), other.pctToBase);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.unitPrice)) {
        this.unitPrice = data().deepCopy(fields()[3].schema(), other.unitPrice);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.total)) {
        this.total = data().deepCopy(fields()[4].schema(), other.total);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.totalCollateral)) {
        this.totalCollateral = data().deepCopy(fields()[5].schema(), other.totalCollateral);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.name)) {
        this.name = data().deepCopy(fields()[6].schema(), other.name);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public java.math.BigDecimal getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder setQuantity(java.math.BigDecimal value) {
      validate(fields()[0], value);
      this.quantity = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder clearQuantity() {
      quantity = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder setId(java.lang.Long value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'pctToBase' field.
      * @return The value.
      */
    public java.math.BigDecimal getPctToBase() {
      return pctToBase;
    }


    /**
      * Sets the value of the 'pctToBase' field.
      * @param value The value of 'pctToBase'.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder setPctToBase(java.math.BigDecimal value) {
      validate(fields()[2], value);
      this.pctToBase = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'pctToBase' field has been set.
      * @return True if the 'pctToBase' field has been set, false otherwise.
      */
    public boolean hasPctToBase() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'pctToBase' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder clearPctToBase() {
      pctToBase = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'unitPrice' field.
      * @return The value.
      */
    public java.math.BigDecimal getUnitPrice() {
      return unitPrice;
    }


    /**
      * Sets the value of the 'unitPrice' field.
      * @param value The value of 'unitPrice'.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder setUnitPrice(java.math.BigDecimal value) {
      validate(fields()[3], value);
      this.unitPrice = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'unitPrice' field has been set.
      * @return True if the 'unitPrice' field has been set, false otherwise.
      */
    public boolean hasUnitPrice() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'unitPrice' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder clearUnitPrice() {
      unitPrice = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'total' field.
      * @return The value.
      */
    public java.math.BigDecimal getTotal() {
      return total;
    }


    /**
      * Sets the value of the 'total' field.
      * @param value The value of 'total'.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder setTotal(java.math.BigDecimal value) {
      validate(fields()[4], value);
      this.total = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'total' field has been set.
      * @return True if the 'total' field has been set, false otherwise.
      */
    public boolean hasTotal() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'total' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder clearTotal() {
      total = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalCollateral' field.
      * @return The value.
      */
    public java.math.BigDecimal getTotalCollateral() {
      return totalCollateral;
    }


    /**
      * Sets the value of the 'totalCollateral' field.
      * @param value The value of 'totalCollateral'.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder setTotalCollateral(java.math.BigDecimal value) {
      validate(fields()[5], value);
      this.totalCollateral = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'totalCollateral' field has been set.
      * @return True if the 'totalCollateral' field has been set, false otherwise.
      */
    public boolean hasTotalCollateral() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'totalCollateral' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder clearTotalCollateral() {
      totalCollateral = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder setName(java.lang.String value) {
      validate(fields()[6], value);
      this.name = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1.Builder clearName() {
      name = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ClientCollateralManagementDataV1 build() {
      try {
        ClientCollateralManagementDataV1 record = new ClientCollateralManagementDataV1();
        record.quantity = fieldSetFlags()[0] ? this.quantity : (java.math.BigDecimal) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.Long) defaultValue(fields()[1]);
        record.pctToBase = fieldSetFlags()[2] ? this.pctToBase : (java.math.BigDecimal) defaultValue(fields()[2]);
        record.unitPrice = fieldSetFlags()[3] ? this.unitPrice : (java.math.BigDecimal) defaultValue(fields()[3]);
        record.total = fieldSetFlags()[4] ? this.total : (java.math.BigDecimal) defaultValue(fields()[4]);
        record.totalCollateral = fieldSetFlags()[5] ? this.totalCollateral : (java.math.BigDecimal) defaultValue(fields()[5]);
        record.name = fieldSetFlags()[6] ? this.name : (java.lang.String) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ClientCollateralManagementDataV1>
    WRITER$ = (org.apache.avro.io.DatumWriter<ClientCollateralManagementDataV1>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ClientCollateralManagementDataV1>
    READER$ = (org.apache.avro.io.DatumReader<ClientCollateralManagementDataV1>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










