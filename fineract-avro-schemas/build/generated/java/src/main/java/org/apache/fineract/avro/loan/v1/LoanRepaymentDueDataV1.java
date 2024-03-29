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
public class LoanRepaymentDueDataV1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord, org.apache.fineract.avro.generator.ByteBufferSerializable {
  private static final long serialVersionUID = 380730393004617663L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LoanRepaymentDueDataV1\",\"namespace\":\"org.apache.fineract.avro.loan.v1\",\"fields\":[{\"name\":\"loanId\",\"type\":[\"long\"]},{\"name\":\"loanAccountNo\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"loanExternalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"currency\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CurrencyDataV1\",\"namespace\":\"org.apache.fineract.avro.generic.v1\",\"fields\":[{\"name\":\"code\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"decimalPlaces\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"inMultiplesOf\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"displaySymbol\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"nameCode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"displayLabel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"installment\",\"type\":[{\"type\":\"record\",\"name\":\"RepaymentDueDataV1\",\"fields\":[{\"name\":\"installmentNumber\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"installmentDueDate\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"principalAmountDue\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"interestAmountDue\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"feeChargeAmountDue\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"penaltyChargeAmountDue\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"totalAmountDue\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null}]}]},{\"name\":\"pastDueAmount\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"RepaymentPastDueDataV1\",\"fields\":[{\"name\":\"totalAmount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"principalAmount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"interestAmount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"feeAmount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"penaltyAmount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<LoanRepaymentDueDataV1> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LoanRepaymentDueDataV1> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<LoanRepaymentDueDataV1> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<LoanRepaymentDueDataV1> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<LoanRepaymentDueDataV1> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this LoanRepaymentDueDataV1 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  @Override
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a LoanRepaymentDueDataV1 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a LoanRepaymentDueDataV1 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static LoanRepaymentDueDataV1 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.Object loanId;
  private java.lang.Object loanAccountNo;
  private java.lang.String loanExternalId;
  private org.apache.fineract.avro.generic.v1.CurrencyDataV1 currency;
  private java.lang.Object installment;
  private org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1 pastDueAmount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LoanRepaymentDueDataV1() {}

  /**
   * All-args constructor.
   * @param loanId The new value for loanId
   * @param loanAccountNo The new value for loanAccountNo
   * @param loanExternalId The new value for loanExternalId
   * @param currency The new value for currency
   * @param installment The new value for installment
   * @param pastDueAmount The new value for pastDueAmount
   */
  public LoanRepaymentDueDataV1(java.lang.Object loanId, java.lang.Object loanAccountNo, java.lang.String loanExternalId, org.apache.fineract.avro.generic.v1.CurrencyDataV1 currency, java.lang.Object installment, org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1 pastDueAmount) {
    this.loanId = loanId;
    this.loanAccountNo = loanAccountNo;
    this.loanExternalId = loanExternalId;
    this.currency = currency;
    this.installment = installment;
    this.pastDueAmount = pastDueAmount;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return loanId;
    case 1: return loanAccountNo;
    case 2: return loanExternalId;
    case 3: return currency;
    case 4: return installment;
    case 5: return pastDueAmount;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: loanId = value$; break;
    case 1: loanAccountNo = value$; break;
    case 2: loanExternalId = value$ != null ? value$.toString() : null; break;
    case 3: currency = (org.apache.fineract.avro.generic.v1.CurrencyDataV1)value$; break;
    case 4: installment = value$; break;
    case 5: pastDueAmount = (org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'loanId' field.
   * @return The value of the 'loanId' field.
   */
  public java.lang.Object getLoanId() {
    return loanId;
  }


  /**
   * Sets the value of the 'loanId' field.
   * @param value the value to set.
   */
  public void setLoanId(java.lang.Object value) {
    this.loanId = value;
  }

  /**
   * Gets the value of the 'loanAccountNo' field.
   * @return The value of the 'loanAccountNo' field.
   */
  public java.lang.Object getLoanAccountNo() {
    return loanAccountNo;
  }


  /**
   * Sets the value of the 'loanAccountNo' field.
   * @param value the value to set.
   */
  public void setLoanAccountNo(java.lang.Object value) {
    this.loanAccountNo = value;
  }

  /**
   * Gets the value of the 'loanExternalId' field.
   * @return The value of the 'loanExternalId' field.
   */
  public java.lang.String getLoanExternalId() {
    return loanExternalId;
  }


  /**
   * Sets the value of the 'loanExternalId' field.
   * @param value the value to set.
   */
  public void setLoanExternalId(java.lang.String value) {
    this.loanExternalId = value;
  }

  /**
   * Gets the value of the 'currency' field.
   * @return The value of the 'currency' field.
   */
  public org.apache.fineract.avro.generic.v1.CurrencyDataV1 getCurrency() {
    return currency;
  }


  /**
   * Sets the value of the 'currency' field.
   * @param value the value to set.
   */
  public void setCurrency(org.apache.fineract.avro.generic.v1.CurrencyDataV1 value) {
    this.currency = value;
  }

  /**
   * Gets the value of the 'installment' field.
   * @return The value of the 'installment' field.
   */
  public java.lang.Object getInstallment() {
    return installment;
  }


  /**
   * Sets the value of the 'installment' field.
   * @param value the value to set.
   */
  public void setInstallment(java.lang.Object value) {
    this.installment = value;
  }

  /**
   * Gets the value of the 'pastDueAmount' field.
   * @return The value of the 'pastDueAmount' field.
   */
  public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1 getPastDueAmount() {
    return pastDueAmount;
  }


  /**
   * Sets the value of the 'pastDueAmount' field.
   * @param value the value to set.
   */
  public void setPastDueAmount(org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1 value) {
    this.pastDueAmount = value;
  }

  /**
   * Creates a new LoanRepaymentDueDataV1 RecordBuilder.
   * @return A new LoanRepaymentDueDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder newBuilder() {
    return new org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder();
  }

  /**
   * Creates a new LoanRepaymentDueDataV1 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LoanRepaymentDueDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder newBuilder(org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder other) {
    if (other == null) {
      return new org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder(other);
    }
  }

  /**
   * Creates a new LoanRepaymentDueDataV1 RecordBuilder by copying an existing LoanRepaymentDueDataV1 instance.
   * @param other The existing instance to copy.
   * @return A new LoanRepaymentDueDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder newBuilder(org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1 other) {
    if (other == null) {
      return new org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder(other);
    }
  }

  /**
   * RecordBuilder for LoanRepaymentDueDataV1 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LoanRepaymentDueDataV1>
    implements org.apache.avro.data.RecordBuilder<LoanRepaymentDueDataV1> {

    private java.lang.Object loanId;
    private java.lang.Object loanAccountNo;
    private java.lang.String loanExternalId;
    private org.apache.fineract.avro.generic.v1.CurrencyDataV1 currency;
    private org.apache.fineract.avro.generic.v1.CurrencyDataV1.Builder currencyBuilder;
    private java.lang.Object installment;
    private org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1 pastDueAmount;
    private org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder pastDueAmountBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.loanId)) {
        this.loanId = data().deepCopy(fields()[0].schema(), other.loanId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.loanAccountNo)) {
        this.loanAccountNo = data().deepCopy(fields()[1].schema(), other.loanAccountNo);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.loanExternalId)) {
        this.loanExternalId = data().deepCopy(fields()[2].schema(), other.loanExternalId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.currency)) {
        this.currency = data().deepCopy(fields()[3].schema(), other.currency);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasCurrencyBuilder()) {
        this.currencyBuilder = org.apache.fineract.avro.generic.v1.CurrencyDataV1.newBuilder(other.getCurrencyBuilder());
      }
      if (isValidValue(fields()[4], other.installment)) {
        this.installment = data().deepCopy(fields()[4].schema(), other.installment);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.pastDueAmount)) {
        this.pastDueAmount = data().deepCopy(fields()[5].schema(), other.pastDueAmount);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasPastDueAmountBuilder()) {
        this.pastDueAmountBuilder = org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.newBuilder(other.getPastDueAmountBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing LoanRepaymentDueDataV1 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1 other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.loanId)) {
        this.loanId = data().deepCopy(fields()[0].schema(), other.loanId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.loanAccountNo)) {
        this.loanAccountNo = data().deepCopy(fields()[1].schema(), other.loanAccountNo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.loanExternalId)) {
        this.loanExternalId = data().deepCopy(fields()[2].schema(), other.loanExternalId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.currency)) {
        this.currency = data().deepCopy(fields()[3].schema(), other.currency);
        fieldSetFlags()[3] = true;
      }
      this.currencyBuilder = null;
      if (isValidValue(fields()[4], other.installment)) {
        this.installment = data().deepCopy(fields()[4].schema(), other.installment);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pastDueAmount)) {
        this.pastDueAmount = data().deepCopy(fields()[5].schema(), other.pastDueAmount);
        fieldSetFlags()[5] = true;
      }
      this.pastDueAmountBuilder = null;
    }

    /**
      * Gets the value of the 'loanId' field.
      * @return The value.
      */
    public java.lang.Object getLoanId() {
      return loanId;
    }


    /**
      * Sets the value of the 'loanId' field.
      * @param value The value of 'loanId'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder setLoanId(java.lang.Object value) {
      validate(fields()[0], value);
      this.loanId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'loanId' field has been set.
      * @return True if the 'loanId' field has been set, false otherwise.
      */
    public boolean hasLoanId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'loanId' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder clearLoanId() {
      loanId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'loanAccountNo' field.
      * @return The value.
      */
    public java.lang.Object getLoanAccountNo() {
      return loanAccountNo;
    }


    /**
      * Sets the value of the 'loanAccountNo' field.
      * @param value The value of 'loanAccountNo'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder setLoanAccountNo(java.lang.Object value) {
      validate(fields()[1], value);
      this.loanAccountNo = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'loanAccountNo' field has been set.
      * @return True if the 'loanAccountNo' field has been set, false otherwise.
      */
    public boolean hasLoanAccountNo() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'loanAccountNo' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder clearLoanAccountNo() {
      loanAccountNo = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'loanExternalId' field.
      * @return The value.
      */
    public java.lang.String getLoanExternalId() {
      return loanExternalId;
    }


    /**
      * Sets the value of the 'loanExternalId' field.
      * @param value The value of 'loanExternalId'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder setLoanExternalId(java.lang.String value) {
      validate(fields()[2], value);
      this.loanExternalId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'loanExternalId' field has been set.
      * @return True if the 'loanExternalId' field has been set, false otherwise.
      */
    public boolean hasLoanExternalId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'loanExternalId' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder clearLoanExternalId() {
      loanExternalId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'currency' field.
      * @return The value.
      */
    public org.apache.fineract.avro.generic.v1.CurrencyDataV1 getCurrency() {
      return currency;
    }


    /**
      * Sets the value of the 'currency' field.
      * @param value The value of 'currency'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder setCurrency(org.apache.fineract.avro.generic.v1.CurrencyDataV1 value) {
      validate(fields()[3], value);
      this.currencyBuilder = null;
      this.currency = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'currency' field has been set.
      * @return True if the 'currency' field has been set, false otherwise.
      */
    public boolean hasCurrency() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'currency' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.fineract.avro.generic.v1.CurrencyDataV1.Builder getCurrencyBuilder() {
      if (currencyBuilder == null) {
        if (hasCurrency()) {
          setCurrencyBuilder(org.apache.fineract.avro.generic.v1.CurrencyDataV1.newBuilder(currency));
        } else {
          setCurrencyBuilder(org.apache.fineract.avro.generic.v1.CurrencyDataV1.newBuilder());
        }
      }
      return currencyBuilder;
    }

    /**
     * Sets the Builder instance for the 'currency' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder setCurrencyBuilder(org.apache.fineract.avro.generic.v1.CurrencyDataV1.Builder value) {
      clearCurrency();
      currencyBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'currency' field has an active Builder instance
     * @return True if the 'currency' field has an active Builder instance
     */
    public boolean hasCurrencyBuilder() {
      return currencyBuilder != null;
    }

    /**
      * Clears the value of the 'currency' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder clearCurrency() {
      currency = null;
      currencyBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'installment' field.
      * @return The value.
      */
    public java.lang.Object getInstallment() {
      return installment;
    }


    /**
      * Sets the value of the 'installment' field.
      * @param value The value of 'installment'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder setInstallment(java.lang.Object value) {
      validate(fields()[4], value);
      this.installment = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'installment' field has been set.
      * @return True if the 'installment' field has been set, false otherwise.
      */
    public boolean hasInstallment() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'installment' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder clearInstallment() {
      installment = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'pastDueAmount' field.
      * @return The value.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1 getPastDueAmount() {
      return pastDueAmount;
    }


    /**
      * Sets the value of the 'pastDueAmount' field.
      * @param value The value of 'pastDueAmount'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder setPastDueAmount(org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1 value) {
      validate(fields()[5], value);
      this.pastDueAmountBuilder = null;
      this.pastDueAmount = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'pastDueAmount' field has been set.
      * @return True if the 'pastDueAmount' field has been set, false otherwise.
      */
    public boolean hasPastDueAmount() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'pastDueAmount' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder getPastDueAmountBuilder() {
      if (pastDueAmountBuilder == null) {
        if (hasPastDueAmount()) {
          setPastDueAmountBuilder(org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.newBuilder(pastDueAmount));
        } else {
          setPastDueAmountBuilder(org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.newBuilder());
        }
      }
      return pastDueAmountBuilder;
    }

    /**
     * Sets the Builder instance for the 'pastDueAmount' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder setPastDueAmountBuilder(org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder value) {
      clearPastDueAmount();
      pastDueAmountBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'pastDueAmount' field has an active Builder instance
     * @return True if the 'pastDueAmount' field has an active Builder instance
     */
    public boolean hasPastDueAmountBuilder() {
      return pastDueAmountBuilder != null;
    }

    /**
      * Clears the value of the 'pastDueAmount' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.LoanRepaymentDueDataV1.Builder clearPastDueAmount() {
      pastDueAmount = null;
      pastDueAmountBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LoanRepaymentDueDataV1 build() {
      try {
        LoanRepaymentDueDataV1 record = new LoanRepaymentDueDataV1();
        record.loanId = fieldSetFlags()[0] ? this.loanId :  defaultValue(fields()[0]);
        record.loanAccountNo = fieldSetFlags()[1] ? this.loanAccountNo :  defaultValue(fields()[1]);
        record.loanExternalId = fieldSetFlags()[2] ? this.loanExternalId : (java.lang.String) defaultValue(fields()[2]);
        if (currencyBuilder != null) {
          try {
            record.currency = this.currencyBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("currency"));
            throw e;
          }
        } else {
          record.currency = fieldSetFlags()[3] ? this.currency : (org.apache.fineract.avro.generic.v1.CurrencyDataV1) defaultValue(fields()[3]);
        }
        record.installment = fieldSetFlags()[4] ? this.installment :  defaultValue(fields()[4]);
        if (pastDueAmountBuilder != null) {
          try {
            record.pastDueAmount = this.pastDueAmountBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("pastDueAmount"));
            throw e;
          }
        } else {
          record.pastDueAmount = fieldSetFlags()[5] ? this.pastDueAmount : (org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1) defaultValue(fields()[5]);
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
  private static final org.apache.avro.io.DatumWriter<LoanRepaymentDueDataV1>
    WRITER$ = (org.apache.avro.io.DatumWriter<LoanRepaymentDueDataV1>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LoanRepaymentDueDataV1>
    READER$ = (org.apache.avro.io.DatumReader<LoanRepaymentDueDataV1>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










