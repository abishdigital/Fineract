/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

package org.apache.fineract.avro.loan.v1;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RepaymentDueDataV1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord, org.apache.fineract.avro.generator.ByteBufferSerializable {
  private static final long serialVersionUID = 8429912621099174616L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RepaymentDueDataV1\",\"namespace\":\"org.apache.fineract.avro.loan.v1\",\"fields\":[{\"name\":\"installmentNumber\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"installmentDueDate\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"principalAmountDue\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"interestAmountDue\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"feeChargeAmountDue\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"penaltyChargeAmountDue\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"totalAmountDue\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<RepaymentDueDataV1> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RepaymentDueDataV1> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RepaymentDueDataV1> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RepaymentDueDataV1> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RepaymentDueDataV1> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RepaymentDueDataV1 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  @Override
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RepaymentDueDataV1 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RepaymentDueDataV1 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RepaymentDueDataV1 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.Integer installmentNumber;
  private java.lang.String installmentDueDate;
  private java.math.BigDecimal principalAmountDue;
  private java.math.BigDecimal interestAmountDue;
  private java.math.BigDecimal feeChargeAmountDue;
  private java.math.BigDecimal penaltyChargeAmountDue;
  private java.math.BigDecimal totalAmountDue;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RepaymentDueDataV1() {}

  /**
   * All-args constructor.
   * @param installmentNumber The new value for installmentNumber
   * @param installmentDueDate The new value for installmentDueDate
   * @param principalAmountDue The new value for principalAmountDue
   * @param interestAmountDue The new value for interestAmountDue
   * @param feeChargeAmountDue The new value for feeChargeAmountDue
   * @param penaltyChargeAmountDue The new value for penaltyChargeAmountDue
   * @param totalAmountDue The new value for totalAmountDue
   */
  public RepaymentDueDataV1(java.lang.Integer installmentNumber, java.lang.String installmentDueDate, java.math.BigDecimal principalAmountDue, java.math.BigDecimal interestAmountDue, java.math.BigDecimal feeChargeAmountDue, java.math.BigDecimal penaltyChargeAmountDue, java.math.BigDecimal totalAmountDue) {
    this.installmentNumber = installmentNumber;
    this.installmentDueDate = installmentDueDate;
    this.principalAmountDue = principalAmountDue;
    this.interestAmountDue = interestAmountDue;
    this.feeChargeAmountDue = feeChargeAmountDue;
    this.penaltyChargeAmountDue = penaltyChargeAmountDue;
    this.totalAmountDue = totalAmountDue;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return installmentNumber;
    case 1: return installmentDueDate;
    case 2: return principalAmountDue;
    case 3: return interestAmountDue;
    case 4: return feeChargeAmountDue;
    case 5: return penaltyChargeAmountDue;
    case 6: return totalAmountDue;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: installmentNumber = (java.lang.Integer)value$; break;
    case 1: installmentDueDate = value$ != null ? value$.toString() : null; break;
    case 2: principalAmountDue = (java.math.BigDecimal)value$; break;
    case 3: interestAmountDue = (java.math.BigDecimal)value$; break;
    case 4: feeChargeAmountDue = (java.math.BigDecimal)value$; break;
    case 5: penaltyChargeAmountDue = (java.math.BigDecimal)value$; break;
    case 6: totalAmountDue = (java.math.BigDecimal)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'installmentNumber' field.
   * @return The value of the 'installmentNumber' field.
   */
  public java.lang.Integer getInstallmentNumber() {
    return installmentNumber;
  }


  /**
   * Sets the value of the 'installmentNumber' field.
   * @param value the value to set.
   */
  public void setInstallmentNumber(java.lang.Integer value) {
    this.installmentNumber = value;
  }

  /**
   * Gets the value of the 'installmentDueDate' field.
   * @return The value of the 'installmentDueDate' field.
   */
  public java.lang.String getInstallmentDueDate() {
    return installmentDueDate;
  }


  /**
   * Sets the value of the 'installmentDueDate' field.
   * @param value the value to set.
   */
  public void setInstallmentDueDate(java.lang.String value) {
    this.installmentDueDate = value;
  }

  /**
   * Gets the value of the 'principalAmountDue' field.
   * @return The value of the 'principalAmountDue' field.
   */
  public java.math.BigDecimal getPrincipalAmountDue() {
    return principalAmountDue;
  }


  /**
   * Sets the value of the 'principalAmountDue' field.
   * @param value the value to set.
   */
  public void setPrincipalAmountDue(java.math.BigDecimal value) {
    this.principalAmountDue = value;
  }

  /**
   * Gets the value of the 'interestAmountDue' field.
   * @return The value of the 'interestAmountDue' field.
   */
  public java.math.BigDecimal getInterestAmountDue() {
    return interestAmountDue;
  }


  /**
   * Sets the value of the 'interestAmountDue' field.
   * @param value the value to set.
   */
  public void setInterestAmountDue(java.math.BigDecimal value) {
    this.interestAmountDue = value;
  }

  /**
   * Gets the value of the 'feeChargeAmountDue' field.
   * @return The value of the 'feeChargeAmountDue' field.
   */
  public java.math.BigDecimal getFeeChargeAmountDue() {
    return feeChargeAmountDue;
  }


  /**
   * Sets the value of the 'feeChargeAmountDue' field.
   * @param value the value to set.
   */
  public void setFeeChargeAmountDue(java.math.BigDecimal value) {
    this.feeChargeAmountDue = value;
  }

  /**
   * Gets the value of the 'penaltyChargeAmountDue' field.
   * @return The value of the 'penaltyChargeAmountDue' field.
   */
  public java.math.BigDecimal getPenaltyChargeAmountDue() {
    return penaltyChargeAmountDue;
  }


  /**
   * Sets the value of the 'penaltyChargeAmountDue' field.
   * @param value the value to set.
   */
  public void setPenaltyChargeAmountDue(java.math.BigDecimal value) {
    this.penaltyChargeAmountDue = value;
  }

  /**
   * Gets the value of the 'totalAmountDue' field.
   * @return The value of the 'totalAmountDue' field.
   */
  public java.math.BigDecimal getTotalAmountDue() {
    return totalAmountDue;
  }


  /**
   * Sets the value of the 'totalAmountDue' field.
   * @param value the value to set.
   */
  public void setTotalAmountDue(java.math.BigDecimal value) {
    this.totalAmountDue = value;
  }

  /**
   * Creates a new RepaymentDueDataV1 RecordBuilder.
   * @return A new RepaymentDueDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder newBuilder() {
    return new org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder();
  }

  /**
   * Creates a new RepaymentDueDataV1 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RepaymentDueDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder newBuilder(org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder other) {
    if (other == null) {
      return new org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder(other);
    }
  }

  /**
   * Creates a new RepaymentDueDataV1 RecordBuilder by copying an existing RepaymentDueDataV1 instance.
   * @param other The existing instance to copy.
   * @return A new RepaymentDueDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder newBuilder(org.apache.fineract.avro.loan.v1.RepaymentDueDataV1 other) {
    if (other == null) {
      return new org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder(other);
    }
  }

  /**
   * RecordBuilder for RepaymentDueDataV1 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RepaymentDueDataV1>
    implements org.apache.avro.data.RecordBuilder<RepaymentDueDataV1> {

    private java.lang.Integer installmentNumber;
    private java.lang.String installmentDueDate;
    private java.math.BigDecimal principalAmountDue;
    private java.math.BigDecimal interestAmountDue;
    private java.math.BigDecimal feeChargeAmountDue;
    private java.math.BigDecimal penaltyChargeAmountDue;
    private java.math.BigDecimal totalAmountDue;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.installmentNumber)) {
        this.installmentNumber = data().deepCopy(fields()[0].schema(), other.installmentNumber);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.installmentDueDate)) {
        this.installmentDueDate = data().deepCopy(fields()[1].schema(), other.installmentDueDate);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.principalAmountDue)) {
        this.principalAmountDue = data().deepCopy(fields()[2].schema(), other.principalAmountDue);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.interestAmountDue)) {
        this.interestAmountDue = data().deepCopy(fields()[3].schema(), other.interestAmountDue);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.feeChargeAmountDue)) {
        this.feeChargeAmountDue = data().deepCopy(fields()[4].schema(), other.feeChargeAmountDue);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.penaltyChargeAmountDue)) {
        this.penaltyChargeAmountDue = data().deepCopy(fields()[5].schema(), other.penaltyChargeAmountDue);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.totalAmountDue)) {
        this.totalAmountDue = data().deepCopy(fields()[6].schema(), other.totalAmountDue);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing RepaymentDueDataV1 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.fineract.avro.loan.v1.RepaymentDueDataV1 other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.installmentNumber)) {
        this.installmentNumber = data().deepCopy(fields()[0].schema(), other.installmentNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.installmentDueDate)) {
        this.installmentDueDate = data().deepCopy(fields()[1].schema(), other.installmentDueDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.principalAmountDue)) {
        this.principalAmountDue = data().deepCopy(fields()[2].schema(), other.principalAmountDue);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.interestAmountDue)) {
        this.interestAmountDue = data().deepCopy(fields()[3].schema(), other.interestAmountDue);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.feeChargeAmountDue)) {
        this.feeChargeAmountDue = data().deepCopy(fields()[4].schema(), other.feeChargeAmountDue);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.penaltyChargeAmountDue)) {
        this.penaltyChargeAmountDue = data().deepCopy(fields()[5].schema(), other.penaltyChargeAmountDue);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.totalAmountDue)) {
        this.totalAmountDue = data().deepCopy(fields()[6].schema(), other.totalAmountDue);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'installmentNumber' field.
      * @return The value.
      */
    public java.lang.Integer getInstallmentNumber() {
      return installmentNumber;
    }


    /**
      * Sets the value of the 'installmentNumber' field.
      * @param value The value of 'installmentNumber'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder setInstallmentNumber(java.lang.Integer value) {
      validate(fields()[0], value);
      this.installmentNumber = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'installmentNumber' field has been set.
      * @return True if the 'installmentNumber' field has been set, false otherwise.
      */
    public boolean hasInstallmentNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'installmentNumber' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder clearInstallmentNumber() {
      installmentNumber = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'installmentDueDate' field.
      * @return The value.
      */
    public java.lang.String getInstallmentDueDate() {
      return installmentDueDate;
    }


    /**
      * Sets the value of the 'installmentDueDate' field.
      * @param value The value of 'installmentDueDate'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder setInstallmentDueDate(java.lang.String value) {
      validate(fields()[1], value);
      this.installmentDueDate = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'installmentDueDate' field has been set.
      * @return True if the 'installmentDueDate' field has been set, false otherwise.
      */
    public boolean hasInstallmentDueDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'installmentDueDate' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder clearInstallmentDueDate() {
      installmentDueDate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'principalAmountDue' field.
      * @return The value.
      */
    public java.math.BigDecimal getPrincipalAmountDue() {
      return principalAmountDue;
    }


    /**
      * Sets the value of the 'principalAmountDue' field.
      * @param value The value of 'principalAmountDue'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder setPrincipalAmountDue(java.math.BigDecimal value) {
      validate(fields()[2], value);
      this.principalAmountDue = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'principalAmountDue' field has been set.
      * @return True if the 'principalAmountDue' field has been set, false otherwise.
      */
    public boolean hasPrincipalAmountDue() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'principalAmountDue' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder clearPrincipalAmountDue() {
      principalAmountDue = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'interestAmountDue' field.
      * @return The value.
      */
    public java.math.BigDecimal getInterestAmountDue() {
      return interestAmountDue;
    }


    /**
      * Sets the value of the 'interestAmountDue' field.
      * @param value The value of 'interestAmountDue'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder setInterestAmountDue(java.math.BigDecimal value) {
      validate(fields()[3], value);
      this.interestAmountDue = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'interestAmountDue' field has been set.
      * @return True if the 'interestAmountDue' field has been set, false otherwise.
      */
    public boolean hasInterestAmountDue() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'interestAmountDue' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder clearInterestAmountDue() {
      interestAmountDue = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'feeChargeAmountDue' field.
      * @return The value.
      */
    public java.math.BigDecimal getFeeChargeAmountDue() {
      return feeChargeAmountDue;
    }


    /**
      * Sets the value of the 'feeChargeAmountDue' field.
      * @param value The value of 'feeChargeAmountDue'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder setFeeChargeAmountDue(java.math.BigDecimal value) {
      validate(fields()[4], value);
      this.feeChargeAmountDue = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'feeChargeAmountDue' field has been set.
      * @return True if the 'feeChargeAmountDue' field has been set, false otherwise.
      */
    public boolean hasFeeChargeAmountDue() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'feeChargeAmountDue' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder clearFeeChargeAmountDue() {
      feeChargeAmountDue = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'penaltyChargeAmountDue' field.
      * @return The value.
      */
    public java.math.BigDecimal getPenaltyChargeAmountDue() {
      return penaltyChargeAmountDue;
    }


    /**
      * Sets the value of the 'penaltyChargeAmountDue' field.
      * @param value The value of 'penaltyChargeAmountDue'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder setPenaltyChargeAmountDue(java.math.BigDecimal value) {
      validate(fields()[5], value);
      this.penaltyChargeAmountDue = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'penaltyChargeAmountDue' field has been set.
      * @return True if the 'penaltyChargeAmountDue' field has been set, false otherwise.
      */
    public boolean hasPenaltyChargeAmountDue() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'penaltyChargeAmountDue' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder clearPenaltyChargeAmountDue() {
      penaltyChargeAmountDue = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalAmountDue' field.
      * @return The value.
      */
    public java.math.BigDecimal getTotalAmountDue() {
      return totalAmountDue;
    }


    /**
      * Sets the value of the 'totalAmountDue' field.
      * @param value The value of 'totalAmountDue'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder setTotalAmountDue(java.math.BigDecimal value) {
      validate(fields()[6], value);
      this.totalAmountDue = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'totalAmountDue' field has been set.
      * @return True if the 'totalAmountDue' field has been set, false otherwise.
      */
    public boolean hasTotalAmountDue() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'totalAmountDue' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentDueDataV1.Builder clearTotalAmountDue() {
      totalAmountDue = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RepaymentDueDataV1 build() {
      try {
        RepaymentDueDataV1 record = new RepaymentDueDataV1();
        record.installmentNumber = fieldSetFlags()[0] ? this.installmentNumber : (java.lang.Integer) defaultValue(fields()[0]);
        record.installmentDueDate = fieldSetFlags()[1] ? this.installmentDueDate : (java.lang.String) defaultValue(fields()[1]);
        record.principalAmountDue = fieldSetFlags()[2] ? this.principalAmountDue : (java.math.BigDecimal) defaultValue(fields()[2]);
        record.interestAmountDue = fieldSetFlags()[3] ? this.interestAmountDue : (java.math.BigDecimal) defaultValue(fields()[3]);
        record.feeChargeAmountDue = fieldSetFlags()[4] ? this.feeChargeAmountDue : (java.math.BigDecimal) defaultValue(fields()[4]);
        record.penaltyChargeAmountDue = fieldSetFlags()[5] ? this.penaltyChargeAmountDue : (java.math.BigDecimal) defaultValue(fields()[5]);
        record.totalAmountDue = fieldSetFlags()[6] ? this.totalAmountDue : (java.math.BigDecimal) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RepaymentDueDataV1>
    WRITER$ = (org.apache.avro.io.DatumWriter<RepaymentDueDataV1>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RepaymentDueDataV1>
    READER$ = (org.apache.avro.io.DatumReader<RepaymentDueDataV1>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










