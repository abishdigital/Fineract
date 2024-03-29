/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

package org.apache.fineract.avro.savings.v1;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class SavingsAccountChargesPaidByDataV1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord, org.apache.fineract.avro.generator.ByteBufferSerializable {
  private static final long serialVersionUID = 8788481447151495380L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SavingsAccountChargesPaidByDataV1\",\"namespace\":\"org.apache.fineract.avro.savings.v1\",\"fields\":[{\"name\":\"chargeId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"amount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"savingsAccountChargeData\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"SavingsAccountChargeDataV1\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"chargeId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"accountId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"chargeTimeType\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EnumOptionDataV1\",\"namespace\":\"org.apache.fineract.avro.generic.v1\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"dueDate\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"feeOnMonthDay\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"feeInterval\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"chargeCalculationType\",\"type\":[\"null\",\"org.apache.fineract.avro.generic.v1.EnumOptionDataV1\"],\"default\":null},{\"name\":\"percentage\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"amountPercentageAppliedTo\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"currency\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CurrencyDataV1\",\"namespace\":\"org.apache.fineract.avro.generic.v1\",\"fields\":[{\"name\":\"code\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"decimalPlaces\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"inMultiplesOf\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"displaySymbol\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"nameCode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"displayLabel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"amount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"amountPaid\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"amountWaived\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"amountWrittenOff\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"amountOutstanding\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"amountOrPercentage\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"penalty\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isActive\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isFreeWithdrawal\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"freeWithdrawalChargeFrequency\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"restartFrequency\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"restartFrequencyEnum\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"inactivationDate\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"chargeData\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ChargeDataV1\",\"namespace\":\"org.apache.fineract.avro.portfolio.v1\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"active\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"penalty\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"freeWithdrawal\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"freeWithdrawalChargeFrequency\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"restartFrequency\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"restartFrequencyEnum\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"isPaymentType\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"paymentTypeOptions\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"PaymentTypeDataV1\",\"namespace\":\"org.apache.fineract.avro.payment.v1\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isCashPayment\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"position\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"codeName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isSystemDefined\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"currency\",\"type\":[\"null\",\"org.apache.fineract.avro.generic.v1.CurrencyDataV1\"],\"default\":null},{\"name\":\"amount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"chargeTimeType\",\"type\":[\"null\",\"org.apache.fineract.avro.generic.v1.EnumOptionDataV1\"],\"default\":null},{\"name\":\"chargeAppliesTo\",\"type\":[\"null\",\"org.apache.fineract.avro.generic.v1.EnumOptionDataV1\"],\"default\":null},{\"name\":\"chargeCalculationType\",\"type\":[\"null\",\"org.apache.fineract.avro.generic.v1.EnumOptionDataV1\"],\"default\":null},{\"name\":\"chargePaymentMode\",\"type\":[\"null\",\"org.apache.fineract.avro.generic.v1.EnumOptionDataV1\"],\"default\":null},{\"name\":\"feeOnMonthDay\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"feeInterval\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"minCap\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"maxCap\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"feeFrequency\",\"type\":[\"null\",\"org.apache.fineract.avro.generic.v1.EnumOptionDataV1\"],\"default\":null},{\"name\":\"incomeOrLiabilityAccount\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GLAccountDataV1\",\"namespace\":\"org.apache.fineract.avro.gl.v1\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"parentId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"glCode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"disabled\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"manualEntriesAllowed\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"org.apache.fineract.avro.generic.v1.EnumOptionDataV1\"],\"default\":null},{\"name\":\"usage\",\"type\":[\"null\",\"org.apache.fineract.avro.generic.v1.EnumOptionDataV1\"],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"nameDecorated\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"tagId\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CodeValueDataV1\",\"namespace\":\"org.apache.fineract.avro.generic.v1\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"position\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"active\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"mandatory\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"organizationRunningBalance\",\"type\":[\"null\",\"long\"],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<SavingsAccountChargesPaidByDataV1> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SavingsAccountChargesPaidByDataV1> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SavingsAccountChargesPaidByDataV1> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SavingsAccountChargesPaidByDataV1> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SavingsAccountChargesPaidByDataV1> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SavingsAccountChargesPaidByDataV1 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  @Override
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SavingsAccountChargesPaidByDataV1 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SavingsAccountChargesPaidByDataV1 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SavingsAccountChargesPaidByDataV1 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.Long chargeId;
  private java.math.BigDecimal amount;
  private org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1 savingsAccountChargeData;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SavingsAccountChargesPaidByDataV1() {}

  /**
   * All-args constructor.
   * @param chargeId The new value for chargeId
   * @param amount The new value for amount
   * @param savingsAccountChargeData The new value for savingsAccountChargeData
   */
  public SavingsAccountChargesPaidByDataV1(java.lang.Long chargeId, java.math.BigDecimal amount, org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1 savingsAccountChargeData) {
    this.chargeId = chargeId;
    this.amount = amount;
    this.savingsAccountChargeData = savingsAccountChargeData;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return chargeId;
    case 1: return amount;
    case 2: return savingsAccountChargeData;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: chargeId = (java.lang.Long)value$; break;
    case 1: amount = (java.math.BigDecimal)value$; break;
    case 2: savingsAccountChargeData = (org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'chargeId' field.
   * @return The value of the 'chargeId' field.
   */
  public java.lang.Long getChargeId() {
    return chargeId;
  }


  /**
   * Sets the value of the 'chargeId' field.
   * @param value the value to set.
   */
  public void setChargeId(java.lang.Long value) {
    this.chargeId = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public java.math.BigDecimal getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.math.BigDecimal value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'savingsAccountChargeData' field.
   * @return The value of the 'savingsAccountChargeData' field.
   */
  public org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1 getSavingsAccountChargeData() {
    return savingsAccountChargeData;
  }


  /**
   * Sets the value of the 'savingsAccountChargeData' field.
   * @param value the value to set.
   */
  public void setSavingsAccountChargeData(org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1 value) {
    this.savingsAccountChargeData = value;
  }

  /**
   * Creates a new SavingsAccountChargesPaidByDataV1 RecordBuilder.
   * @return A new SavingsAccountChargesPaidByDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder newBuilder() {
    return new org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder();
  }

  /**
   * Creates a new SavingsAccountChargesPaidByDataV1 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SavingsAccountChargesPaidByDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder newBuilder(org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder other) {
    if (other == null) {
      return new org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder(other);
    }
  }

  /**
   * Creates a new SavingsAccountChargesPaidByDataV1 RecordBuilder by copying an existing SavingsAccountChargesPaidByDataV1 instance.
   * @param other The existing instance to copy.
   * @return A new SavingsAccountChargesPaidByDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder newBuilder(org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1 other) {
    if (other == null) {
      return new org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder(other);
    }
  }

  /**
   * RecordBuilder for SavingsAccountChargesPaidByDataV1 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SavingsAccountChargesPaidByDataV1>
    implements org.apache.avro.data.RecordBuilder<SavingsAccountChargesPaidByDataV1> {

    private java.lang.Long chargeId;
    private java.math.BigDecimal amount;
    private org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1 savingsAccountChargeData;
    private org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1.Builder savingsAccountChargeDataBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.chargeId)) {
        this.chargeId = data().deepCopy(fields()[0].schema(), other.chargeId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.amount)) {
        this.amount = data().deepCopy(fields()[1].schema(), other.amount);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.savingsAccountChargeData)) {
        this.savingsAccountChargeData = data().deepCopy(fields()[2].schema(), other.savingsAccountChargeData);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasSavingsAccountChargeDataBuilder()) {
        this.savingsAccountChargeDataBuilder = org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1.newBuilder(other.getSavingsAccountChargeDataBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing SavingsAccountChargesPaidByDataV1 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1 other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.chargeId)) {
        this.chargeId = data().deepCopy(fields()[0].schema(), other.chargeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.amount)) {
        this.amount = data().deepCopy(fields()[1].schema(), other.amount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.savingsAccountChargeData)) {
        this.savingsAccountChargeData = data().deepCopy(fields()[2].schema(), other.savingsAccountChargeData);
        fieldSetFlags()[2] = true;
      }
      this.savingsAccountChargeDataBuilder = null;
    }

    /**
      * Gets the value of the 'chargeId' field.
      * @return The value.
      */
    public java.lang.Long getChargeId() {
      return chargeId;
    }


    /**
      * Sets the value of the 'chargeId' field.
      * @param value The value of 'chargeId'.
      * @return This builder.
      */
    public org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder setChargeId(java.lang.Long value) {
      validate(fields()[0], value);
      this.chargeId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'chargeId' field has been set.
      * @return True if the 'chargeId' field has been set, false otherwise.
      */
    public boolean hasChargeId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'chargeId' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder clearChargeId() {
      chargeId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public java.math.BigDecimal getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder setAmount(java.math.BigDecimal value) {
      validate(fields()[1], value);
      this.amount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder clearAmount() {
      amount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'savingsAccountChargeData' field.
      * @return The value.
      */
    public org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1 getSavingsAccountChargeData() {
      return savingsAccountChargeData;
    }


    /**
      * Sets the value of the 'savingsAccountChargeData' field.
      * @param value The value of 'savingsAccountChargeData'.
      * @return This builder.
      */
    public org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder setSavingsAccountChargeData(org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1 value) {
      validate(fields()[2], value);
      this.savingsAccountChargeDataBuilder = null;
      this.savingsAccountChargeData = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'savingsAccountChargeData' field has been set.
      * @return True if the 'savingsAccountChargeData' field has been set, false otherwise.
      */
    public boolean hasSavingsAccountChargeData() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'savingsAccountChargeData' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1.Builder getSavingsAccountChargeDataBuilder() {
      if (savingsAccountChargeDataBuilder == null) {
        if (hasSavingsAccountChargeData()) {
          setSavingsAccountChargeDataBuilder(org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1.newBuilder(savingsAccountChargeData));
        } else {
          setSavingsAccountChargeDataBuilder(org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1.newBuilder());
        }
      }
      return savingsAccountChargeDataBuilder;
    }

    /**
     * Sets the Builder instance for the 'savingsAccountChargeData' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder setSavingsAccountChargeDataBuilder(org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1.Builder value) {
      clearSavingsAccountChargeData();
      savingsAccountChargeDataBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'savingsAccountChargeData' field has an active Builder instance
     * @return True if the 'savingsAccountChargeData' field has an active Builder instance
     */
    public boolean hasSavingsAccountChargeDataBuilder() {
      return savingsAccountChargeDataBuilder != null;
    }

    /**
      * Clears the value of the 'savingsAccountChargeData' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1.Builder clearSavingsAccountChargeData() {
      savingsAccountChargeData = null;
      savingsAccountChargeDataBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SavingsAccountChargesPaidByDataV1 build() {
      try {
        SavingsAccountChargesPaidByDataV1 record = new SavingsAccountChargesPaidByDataV1();
        record.chargeId = fieldSetFlags()[0] ? this.chargeId : (java.lang.Long) defaultValue(fields()[0]);
        record.amount = fieldSetFlags()[1] ? this.amount : (java.math.BigDecimal) defaultValue(fields()[1]);
        if (savingsAccountChargeDataBuilder != null) {
          try {
            record.savingsAccountChargeData = this.savingsAccountChargeDataBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("savingsAccountChargeData"));
            throw e;
          }
        } else {
          record.savingsAccountChargeData = fieldSetFlags()[2] ? this.savingsAccountChargeData : (org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1) defaultValue(fields()[2]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SavingsAccountChargesPaidByDataV1>
    WRITER$ = (org.apache.avro.io.DatumWriter<SavingsAccountChargesPaidByDataV1>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SavingsAccountChargesPaidByDataV1>
    READER$ = (org.apache.avro.io.DatumReader<SavingsAccountChargesPaidByDataV1>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










