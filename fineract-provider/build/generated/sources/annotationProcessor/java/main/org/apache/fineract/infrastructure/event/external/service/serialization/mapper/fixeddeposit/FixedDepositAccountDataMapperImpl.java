package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.fixeddeposit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.apache.fineract.accounting.glaccount.data.GLAccountData;
import org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1;
import org.apache.fineract.avro.client.v1.ClientDataV1;
import org.apache.fineract.avro.client.v1.ClientTimelineDataV1;
import org.apache.fineract.avro.fixeddeposit.v1.FixedDepositAccountDataV1;
import org.apache.fineract.avro.generic.v1.CalendarDataV1;
import org.apache.fineract.avro.generic.v1.CodeValueDataV1;
import org.apache.fineract.avro.generic.v1.CurrencyDataV1;
import org.apache.fineract.avro.generic.v1.EnumOptionDataV1;
import org.apache.fineract.avro.gl.v1.GLAccountDataV1;
import org.apache.fineract.avro.group.v1.GroupGeneralDataV1;
import org.apache.fineract.avro.group.v1.GroupRoleDataV1;
import org.apache.fineract.avro.office.v1.OfficeDataV1;
import org.apache.fineract.avro.payment.v1.PaymentDetailDataV1;
import org.apache.fineract.avro.payment.v1.PaymentTypeDataV1;
import org.apache.fineract.avro.portfolio.v1.ChargeDataV1;
import org.apache.fineract.avro.portfolio.v1.PortfolioAccountDataV1;
import org.apache.fineract.avro.savings.v1.AccountTransferDataV1;
import org.apache.fineract.avro.savings.v1.SavingsAccountApplicationTimelineDataV1;
import org.apache.fineract.avro.savings.v1.SavingsAccountChargeDataV1;
import org.apache.fineract.avro.savings.v1.SavingsAccountChargesPaidByDataV1;
import org.apache.fineract.avro.savings.v1.SavingsAccountStatusEnumDataV1;
import org.apache.fineract.avro.savings.v1.SavingsAccountSummaryDataV1;
import org.apache.fineract.avro.savings.v1.SavingsAccountTransactionDataV1;
import org.apache.fineract.avro.savings.v1.SavingsAccountTransactionEnumDataV1;
import org.apache.fineract.infrastructure.codes.data.CodeValueData;
import org.apache.fineract.infrastructure.core.data.EnumOptionData;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroDateTimeMapper;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroMonthDayMapper;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.ExternalIdMapper;
import org.apache.fineract.organisation.monetary.data.CurrencyData;
import org.apache.fineract.organisation.office.data.OfficeData;
import org.apache.fineract.portfolio.account.data.AccountTransferData;
import org.apache.fineract.portfolio.account.data.PortfolioAccountData;
import org.apache.fineract.portfolio.calendar.data.CalendarData;
import org.apache.fineract.portfolio.charge.data.ChargeData;
import org.apache.fineract.portfolio.client.data.ClientCollateralManagementData;
import org.apache.fineract.portfolio.client.data.ClientData;
import org.apache.fineract.portfolio.client.data.ClientTimelineData;
import org.apache.fineract.portfolio.group.data.GroupGeneralData;
import org.apache.fineract.portfolio.group.data.GroupRoleData;
import org.apache.fineract.portfolio.paymentdetail.data.PaymentDetailData;
import org.apache.fineract.portfolio.paymenttype.data.PaymentTypeData;
import org.apache.fineract.portfolio.savings.data.FixedDepositAccountData;
import org.apache.fineract.portfolio.savings.data.SavingsAccountApplicationTimelineData;
import org.apache.fineract.portfolio.savings.data.SavingsAccountChargeData;
import org.apache.fineract.portfolio.savings.data.SavingsAccountStatusEnumData;
import org.apache.fineract.portfolio.savings.data.SavingsAccountSummaryData;
import org.apache.fineract.portfolio.savings.data.SavingsAccountTransactionData;
import org.apache.fineract.portfolio.savings.data.SavingsAccountTransactionEnumData;
import org.apache.fineract.portfolio.savings.domain.SavingsAccountChargesPaidByData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-27T12:43:30+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.10 (Azul Systems, Inc.)"
)
@Component
public class FixedDepositAccountDataMapperImpl implements FixedDepositAccountDataMapper {

    private final AvroDateTimeMapper avroDateTimeMapper;
    private final AvroMonthDayMapper avroMonthDayMapper;
    private final ExternalIdMapper externalIdMapper;

    @Autowired
    public FixedDepositAccountDataMapperImpl(AvroDateTimeMapper avroDateTimeMapper, AvroMonthDayMapper avroMonthDayMapper, ExternalIdMapper externalIdMapper) {

        this.avroDateTimeMapper = avroDateTimeMapper;
        this.avroMonthDayMapper = avroMonthDayMapper;
        this.externalIdMapper = externalIdMapper;
    }

    @Override
    public FixedDepositAccountDataV1 map(FixedDepositAccountData source) {
        if ( source == null ) {
            return null;
        }

        FixedDepositAccountDataV1 fixedDepositAccountDataV1 = new FixedDepositAccountDataV1();

        if ( source.getId() != null ) {
            fixedDepositAccountDataV1.setId( source.getId().intValue() );
        }
        fixedDepositAccountDataV1.setAccountNo( source.getAccountNo() );
        fixedDepositAccountDataV1.setExternalId( source.getExternalId() );
        if ( source.getGroupId() != null ) {
            fixedDepositAccountDataV1.setGroupId( source.getGroupId().intValue() );
        }
        fixedDepositAccountDataV1.setGroupName( source.getGroupName() );
        if ( source.getClientId() != null ) {
            fixedDepositAccountDataV1.setClientId( source.getClientId().intValue() );
        }
        fixedDepositAccountDataV1.setClientName( source.getClientName() );
        if ( source.getDepositProductId() != null ) {
            fixedDepositAccountDataV1.setDepositProductId( source.getDepositProductId().intValue() );
        }
        fixedDepositAccountDataV1.setDepositProductName( source.getDepositProductName() );
        if ( source.getFieldOfficerId() != null ) {
            fixedDepositAccountDataV1.setFieldOfficerId( source.getFieldOfficerId().intValue() );
        }
        fixedDepositAccountDataV1.setFieldOfficerName( source.getFieldOfficerName() );
        fixedDepositAccountDataV1.setStatus( savingsAccountStatusEnumDataToSavingsAccountStatusEnumDataV1( source.getStatus() ) );
        fixedDepositAccountDataV1.setTimeline( savingsAccountApplicationTimelineDataToSavingsAccountApplicationTimelineDataV1( source.getTimeline() ) );
        fixedDepositAccountDataV1.setCurrency( currencyDataToCurrencyDataV1( source.getCurrency() ) );
        fixedDepositAccountDataV1.setNominalAnnualInterestRate( source.getNominalAnnualInterestRate() );
        fixedDepositAccountDataV1.setInterestCompoundingPeriodType( enumOptionDataToEnumOptionDataV1( source.getInterestCompoundingPeriodType() ) );
        fixedDepositAccountDataV1.setInterestPostingPeriodType( enumOptionDataToEnumOptionDataV1( source.getInterestPostingPeriodType() ) );
        fixedDepositAccountDataV1.setInterestCalculationType( enumOptionDataToEnumOptionDataV1( source.getInterestCalculationType() ) );
        fixedDepositAccountDataV1.setInterestCalculationDaysInYearType( enumOptionDataToEnumOptionDataV1( source.getInterestCalculationDaysInYearType() ) );
        fixedDepositAccountDataV1.setMinRequiredOpeningBalance( source.getMinRequiredOpeningBalance() );
        fixedDepositAccountDataV1.setLockinPeriodFrequency( source.getLockinPeriodFrequency() );
        fixedDepositAccountDataV1.setLockinPeriodFrequencyType( enumOptionDataToEnumOptionDataV1( source.getLockinPeriodFrequencyType() ) );
        fixedDepositAccountDataV1.setWithdrawalFeeForTransfers( source.isWithdrawalFeeForTransfers() );
        fixedDepositAccountDataV1.setDepositType( enumOptionDataToEnumOptionDataV1( source.getDepositType() ) );
        fixedDepositAccountDataV1.setMinBalanceForInterestCalculation( source.getMinBalanceForInterestCalculation() );
        fixedDepositAccountDataV1.setWithHoldTax( source.isWithHoldTax() );
        fixedDepositAccountDataV1.setSummary( savingsAccountSummaryDataToSavingsAccountSummaryDataV1( source.getSummary() ) );
        fixedDepositAccountDataV1.setTransactions( savingsAccountTransactionDataCollectionToSavingsAccountTransactionDataV1List( source.getTransactions() ) );
        fixedDepositAccountDataV1.setCharges( savingsAccountChargeDataCollectionToSavingsAccountChargeDataV1List( source.getCharges() ) );
        fixedDepositAccountDataV1.setPreClosurePenalApplicable( source.isPreClosurePenalApplicable() );
        fixedDepositAccountDataV1.setPreClosurePenalInterest( source.getPreClosurePenalInterest() );
        fixedDepositAccountDataV1.setPreClosurePenalInterestOnType( enumOptionDataToEnumOptionDataV1( source.getPreClosurePenalInterestOnType() ) );
        fixedDepositAccountDataV1.setMinDepositTerm( source.getMinDepositTerm() );
        fixedDepositAccountDataV1.setMaxDepositTerm( source.getMaxDepositTerm() );
        fixedDepositAccountDataV1.setMinDepositTermType( enumOptionDataToEnumOptionDataV1( source.getMinDepositTermType() ) );
        fixedDepositAccountDataV1.setMaxDepositTermType( enumOptionDataToEnumOptionDataV1( source.getMaxDepositTermType() ) );
        fixedDepositAccountDataV1.setInMultiplesOfDepositTerm( source.getInMultiplesOfDepositTerm() );
        fixedDepositAccountDataV1.setInMultiplesOfDepositTermType( enumOptionDataToEnumOptionDataV1( source.getInMultiplesOfDepositTermType() ) );
        if ( source.getDepositAmount() != null ) {
            fixedDepositAccountDataV1.setDepositAmount( source.getDepositAmount().floatValue() );
        }
        if ( source.getMaturityAmount() != null ) {
            fixedDepositAccountDataV1.setMaturityAmount( source.getMaturityAmount().floatValue() );
        }
        fixedDepositAccountDataV1.setMaturityDate( avroDateTimeMapper.mapLocalDate( source.getMaturityDate() ) );
        fixedDepositAccountDataV1.setDepositPeriod( source.getDepositPeriod() );
        fixedDepositAccountDataV1.setDepositPeriodFrequency( enumOptionDataToEnumOptionDataV1( source.getDepositPeriodFrequency() ) );
        fixedDepositAccountDataV1.setActivationCharge( source.getActivationCharge() );
        fixedDepositAccountDataV1.setTransferToSavingsId( source.getTransferToSavingsId() );
        fixedDepositAccountDataV1.setOnAccountClosure( enumOptionDataToEnumOptionDataV1( source.getOnAccountClosure() ) );
        fixedDepositAccountDataV1.setLinkedAccount( portfolioAccountDataToPortfolioAccountDataV1( source.getLinkedAccount() ) );
        fixedDepositAccountDataV1.setTransferInterestToSavings( source.getTransferInterestToSavings() );
        fixedDepositAccountDataV1.setTransferToSavingsAccount( portfolioAccountDataToPortfolioAccountDataV1( source.getTransferToSavingsAccount() ) );

        return fixedDepositAccountDataV1;
    }

    protected SavingsAccountStatusEnumDataV1 savingsAccountStatusEnumDataToSavingsAccountStatusEnumDataV1(SavingsAccountStatusEnumData savingsAccountStatusEnumData) {
        if ( savingsAccountStatusEnumData == null ) {
            return null;
        }

        SavingsAccountStatusEnumDataV1 savingsAccountStatusEnumDataV1 = new SavingsAccountStatusEnumDataV1();

        if ( savingsAccountStatusEnumData.getId() != null ) {
            savingsAccountStatusEnumDataV1.setId( savingsAccountStatusEnumData.getId().intValue() );
        }
        savingsAccountStatusEnumDataV1.setCode( savingsAccountStatusEnumData.getCode() );
        savingsAccountStatusEnumDataV1.setValue( savingsAccountStatusEnumData.getValue() );
        savingsAccountStatusEnumDataV1.setSubmittedAndPendingApproval( savingsAccountStatusEnumData.isSubmittedAndPendingApproval() );
        savingsAccountStatusEnumDataV1.setApproved( savingsAccountStatusEnumData.isApproved() );
        savingsAccountStatusEnumDataV1.setRejected( savingsAccountStatusEnumData.isRejected() );
        savingsAccountStatusEnumDataV1.setWithdrawnByApplicant( savingsAccountStatusEnumData.isWithdrawnByApplicant() );
        savingsAccountStatusEnumDataV1.setActive( savingsAccountStatusEnumData.isActive() );
        savingsAccountStatusEnumDataV1.setClosed( savingsAccountStatusEnumData.isClosed() );
        savingsAccountStatusEnumDataV1.setPrematureClosed( savingsAccountStatusEnumData.isPrematureClosed() );
        savingsAccountStatusEnumDataV1.setTransferInProgress( savingsAccountStatusEnumData.isTransferInProgress() );
        savingsAccountStatusEnumDataV1.setTransferOnHold( savingsAccountStatusEnumData.isTransferOnHold() );
        savingsAccountStatusEnumDataV1.setMatured( savingsAccountStatusEnumData.isMatured() );

        return savingsAccountStatusEnumDataV1;
    }

    protected SavingsAccountApplicationTimelineDataV1 savingsAccountApplicationTimelineDataToSavingsAccountApplicationTimelineDataV1(SavingsAccountApplicationTimelineData savingsAccountApplicationTimelineData) {
        if ( savingsAccountApplicationTimelineData == null ) {
            return null;
        }

        SavingsAccountApplicationTimelineDataV1 savingsAccountApplicationTimelineDataV1 = new SavingsAccountApplicationTimelineDataV1();

        savingsAccountApplicationTimelineDataV1.setSubmittedOnDate( avroDateTimeMapper.mapLocalDate( savingsAccountApplicationTimelineData.getSubmittedOnDate() ) );
        savingsAccountApplicationTimelineDataV1.setSubmittedByUsername( savingsAccountApplicationTimelineData.getSubmittedByUsername() );
        savingsAccountApplicationTimelineDataV1.setSubmittedByFirstname( savingsAccountApplicationTimelineData.getSubmittedByFirstname() );
        savingsAccountApplicationTimelineDataV1.setSubmittedByLastname( savingsAccountApplicationTimelineData.getSubmittedByLastname() );
        savingsAccountApplicationTimelineDataV1.setRejectedOnDate( avroDateTimeMapper.mapLocalDate( savingsAccountApplicationTimelineData.getRejectedOnDate() ) );
        savingsAccountApplicationTimelineDataV1.setRejectedByUsername( savingsAccountApplicationTimelineData.getRejectedByUsername() );
        savingsAccountApplicationTimelineDataV1.setRejectedByFirstname( savingsAccountApplicationTimelineData.getRejectedByFirstname() );
        savingsAccountApplicationTimelineDataV1.setRejectedByLastname( savingsAccountApplicationTimelineData.getRejectedByLastname() );
        savingsAccountApplicationTimelineDataV1.setWithdrawnOnDate( avroDateTimeMapper.mapLocalDate( savingsAccountApplicationTimelineData.getWithdrawnOnDate() ) );
        savingsAccountApplicationTimelineDataV1.setWithdrawnByUsername( savingsAccountApplicationTimelineData.getWithdrawnByUsername() );
        savingsAccountApplicationTimelineDataV1.setWithdrawnByFirstname( savingsAccountApplicationTimelineData.getWithdrawnByFirstname() );
        savingsAccountApplicationTimelineDataV1.setWithdrawnByLastname( savingsAccountApplicationTimelineData.getWithdrawnByLastname() );
        savingsAccountApplicationTimelineDataV1.setApprovedOnDate( avroDateTimeMapper.mapLocalDate( savingsAccountApplicationTimelineData.getApprovedOnDate() ) );
        savingsAccountApplicationTimelineDataV1.setApprovedByUsername( savingsAccountApplicationTimelineData.getApprovedByUsername() );
        savingsAccountApplicationTimelineDataV1.setApprovedByFirstname( savingsAccountApplicationTimelineData.getApprovedByFirstname() );
        savingsAccountApplicationTimelineDataV1.setApprovedByLastname( savingsAccountApplicationTimelineData.getApprovedByLastname() );
        savingsAccountApplicationTimelineDataV1.setActivatedOnDate( avroDateTimeMapper.mapLocalDate( savingsAccountApplicationTimelineData.getActivatedOnDate() ) );
        savingsAccountApplicationTimelineDataV1.setActivatedByUsername( savingsAccountApplicationTimelineData.getActivatedByUsername() );
        savingsAccountApplicationTimelineDataV1.setActivatedByFirstname( savingsAccountApplicationTimelineData.getActivatedByFirstname() );
        savingsAccountApplicationTimelineDataV1.setActivatedByLastname( savingsAccountApplicationTimelineData.getActivatedByLastname() );
        savingsAccountApplicationTimelineDataV1.setClosedOnDate( avroDateTimeMapper.mapLocalDate( savingsAccountApplicationTimelineData.getClosedOnDate() ) );
        savingsAccountApplicationTimelineDataV1.setClosedByUsername( savingsAccountApplicationTimelineData.getClosedByUsername() );
        savingsAccountApplicationTimelineDataV1.setClosedByFirstname( savingsAccountApplicationTimelineData.getClosedByFirstname() );
        savingsAccountApplicationTimelineDataV1.setClosedByLastname( savingsAccountApplicationTimelineData.getClosedByLastname() );

        return savingsAccountApplicationTimelineDataV1;
    }

    protected CurrencyDataV1 currencyDataToCurrencyDataV1(CurrencyData currencyData) {
        if ( currencyData == null ) {
            return null;
        }

        CurrencyDataV1 currencyDataV1 = new CurrencyDataV1();

        currencyDataV1.setCode( currencyData.getCode() );
        currencyDataV1.setName( currencyData.getName() );
        currencyDataV1.setDecimalPlaces( currencyData.getDecimalPlaces() );
        currencyDataV1.setInMultiplesOf( currencyData.getInMultiplesOf() );
        currencyDataV1.setDisplaySymbol( currencyData.getDisplaySymbol() );
        currencyDataV1.setNameCode( currencyData.getNameCode() );
        currencyDataV1.setDisplayLabel( currencyData.getDisplayLabel() );

        return currencyDataV1;
    }

    protected EnumOptionDataV1 enumOptionDataToEnumOptionDataV1(EnumOptionData enumOptionData) {
        if ( enumOptionData == null ) {
            return null;
        }

        EnumOptionDataV1 enumOptionDataV1 = new EnumOptionDataV1();

        if ( enumOptionData.getId() != null ) {
            enumOptionDataV1.setId( enumOptionData.getId().intValue() );
        }
        enumOptionDataV1.setCode( enumOptionData.getCode() );
        enumOptionDataV1.setValue( enumOptionData.getValue() );

        return enumOptionDataV1;
    }

    protected SavingsAccountSummaryDataV1 savingsAccountSummaryDataToSavingsAccountSummaryDataV1(SavingsAccountSummaryData savingsAccountSummaryData) {
        if ( savingsAccountSummaryData == null ) {
            return null;
        }

        SavingsAccountSummaryDataV1 savingsAccountSummaryDataV1 = new SavingsAccountSummaryDataV1();

        savingsAccountSummaryDataV1.setCurrency( currencyDataToCurrencyDataV1( savingsAccountSummaryData.getCurrency() ) );
        savingsAccountSummaryDataV1.setTotalDeposits( savingsAccountSummaryData.getTotalDeposits() );
        savingsAccountSummaryDataV1.setTotalWithdrawals( savingsAccountSummaryData.getTotalWithdrawals() );
        savingsAccountSummaryDataV1.setTotalWithdrawalFees( savingsAccountSummaryData.getTotalWithdrawalFees() );
        savingsAccountSummaryDataV1.setTotalAnnualFees( savingsAccountSummaryData.getTotalAnnualFees() );
        savingsAccountSummaryDataV1.setTotalInterestEarned( savingsAccountSummaryData.getTotalInterestEarned() );
        savingsAccountSummaryDataV1.setTotalInterestPosted( savingsAccountSummaryData.getTotalInterestPosted() );
        savingsAccountSummaryDataV1.setAccountBalance( savingsAccountSummaryData.getAccountBalance() );
        savingsAccountSummaryDataV1.setTotalFeeCharge( savingsAccountSummaryData.getTotalFeeCharge() );
        savingsAccountSummaryDataV1.setTotalPenaltyCharge( savingsAccountSummaryData.getTotalPenaltyCharge() );
        savingsAccountSummaryDataV1.setTotalOverdraftInterestDerived( savingsAccountSummaryData.getTotalOverdraftInterestDerived() );
        savingsAccountSummaryDataV1.setTotalWithholdTax( savingsAccountSummaryData.getTotalWithholdTax() );
        savingsAccountSummaryDataV1.setInterestNotPosted( savingsAccountSummaryData.getInterestNotPosted() );
        savingsAccountSummaryDataV1.setLastInterestCalculationDate( avroDateTimeMapper.mapLocalDate( savingsAccountSummaryData.getLastInterestCalculationDate() ) );
        savingsAccountSummaryDataV1.setAvailableBalance( savingsAccountSummaryData.getAvailableBalance() );
        savingsAccountSummaryDataV1.setInterestPostedTillDate( avroDateTimeMapper.mapLocalDate( savingsAccountSummaryData.getInterestPostedTillDate() ) );
        savingsAccountSummaryDataV1.setPrevInterestPostedTillDate( avroDateTimeMapper.mapLocalDate( savingsAccountSummaryData.getPrevInterestPostedTillDate() ) );

        return savingsAccountSummaryDataV1;
    }

    protected SavingsAccountTransactionEnumDataV1 savingsAccountTransactionEnumDataToSavingsAccountTransactionEnumDataV1(SavingsAccountTransactionEnumData savingsAccountTransactionEnumData) {
        if ( savingsAccountTransactionEnumData == null ) {
            return null;
        }

        SavingsAccountTransactionEnumDataV1 savingsAccountTransactionEnumDataV1 = new SavingsAccountTransactionEnumDataV1();

        savingsAccountTransactionEnumDataV1.setId( savingsAccountTransactionEnumData.getId() );
        savingsAccountTransactionEnumDataV1.setCode( savingsAccountTransactionEnumData.getCode() );
        savingsAccountTransactionEnumDataV1.setValue( savingsAccountTransactionEnumData.getValue() );
        savingsAccountTransactionEnumDataV1.setDeposit( savingsAccountTransactionEnumData.isDeposit() );
        savingsAccountTransactionEnumDataV1.setDividendPayout( savingsAccountTransactionEnumData.isDividendPayout() );
        savingsAccountTransactionEnumDataV1.setWithdrawal( savingsAccountTransactionEnumData.isWithdrawal() );
        savingsAccountTransactionEnumDataV1.setInterestPosting( savingsAccountTransactionEnumData.isInterestPosting() );
        savingsAccountTransactionEnumDataV1.setFeeDeduction( savingsAccountTransactionEnumData.isFeeDeduction() );
        savingsAccountTransactionEnumDataV1.setInitiateTransfer( savingsAccountTransactionEnumData.isInitiateTransfer() );
        savingsAccountTransactionEnumDataV1.setApproveTransfer( savingsAccountTransactionEnumData.isApproveTransfer() );
        savingsAccountTransactionEnumDataV1.setWithdrawTransfer( savingsAccountTransactionEnumData.isWithdrawTransfer() );
        savingsAccountTransactionEnumDataV1.setRejectTransfer( savingsAccountTransactionEnumData.isRejectTransfer() );
        savingsAccountTransactionEnumDataV1.setOverdraftInterest( savingsAccountTransactionEnumData.isOverdraftInterest() );
        savingsAccountTransactionEnumDataV1.setWrittenoff( savingsAccountTransactionEnumData.isWrittenoff() );
        savingsAccountTransactionEnumDataV1.setOverdraftFee( savingsAccountTransactionEnumData.isOverdraftFee() );
        savingsAccountTransactionEnumDataV1.setWithholdTax( savingsAccountTransactionEnumData.isWithholdTax() );
        savingsAccountTransactionEnumDataV1.setEscheat( savingsAccountTransactionEnumData.isEscheat() );
        savingsAccountTransactionEnumDataV1.setAmountHold( savingsAccountTransactionEnumData.isAmountHold() );
        savingsAccountTransactionEnumDataV1.setAmountRelease( savingsAccountTransactionEnumData.isAmountRelease() );

        return savingsAccountTransactionEnumDataV1;
    }

    protected PaymentTypeDataV1 paymentTypeDataToPaymentTypeDataV1(PaymentTypeData paymentTypeData) {
        if ( paymentTypeData == null ) {
            return null;
        }

        PaymentTypeDataV1 paymentTypeDataV1 = new PaymentTypeDataV1();

        paymentTypeDataV1.setId( paymentTypeData.getId() );
        paymentTypeDataV1.setName( paymentTypeData.getName() );
        paymentTypeDataV1.setDescription( paymentTypeData.getDescription() );
        paymentTypeDataV1.setIsCashPayment( paymentTypeData.getIsCashPayment() );
        if ( paymentTypeData.getPosition() != null ) {
            paymentTypeDataV1.setPosition( paymentTypeData.getPosition().longValue() );
        }
        paymentTypeDataV1.setCodeName( paymentTypeData.getCodeName() );
        paymentTypeDataV1.setIsSystemDefined( paymentTypeData.getIsSystemDefined() );

        return paymentTypeDataV1;
    }

    protected PaymentDetailDataV1 paymentDetailDataToPaymentDetailDataV1(PaymentDetailData paymentDetailData) {
        if ( paymentDetailData == null ) {
            return null;
        }

        PaymentDetailDataV1 paymentDetailDataV1 = new PaymentDetailDataV1();

        paymentDetailDataV1.setId( paymentDetailData.getId() );
        paymentDetailDataV1.setPaymentType( paymentTypeDataToPaymentTypeDataV1( paymentDetailData.getPaymentType() ) );
        paymentDetailDataV1.setAccountNumber( paymentDetailData.getAccountNumber() );
        paymentDetailDataV1.setCheckNumber( paymentDetailData.getCheckNumber() );
        paymentDetailDataV1.setRoutingCode( paymentDetailData.getRoutingCode() );
        paymentDetailDataV1.setReceiptNumber( paymentDetailData.getReceiptNumber() );
        paymentDetailDataV1.setBankNumber( paymentDetailData.getBankNumber() );

        return paymentDetailDataV1;
    }

    protected List<OfficeDataV1> officeDataCollectionToOfficeDataV1List(Collection<OfficeData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<OfficeDataV1> list = new ArrayList<OfficeDataV1>( collection.size() );
        for ( OfficeData officeData : collection ) {
            list.add( officeDataToOfficeDataV1( officeData ) );
        }

        return list;
    }

    protected OfficeDataV1 officeDataToOfficeDataV1(OfficeData officeData) {
        if ( officeData == null ) {
            return null;
        }

        OfficeDataV1 officeDataV1 = new OfficeDataV1();

        officeDataV1.setId( officeData.getId() );
        officeDataV1.setName( officeData.getName() );
        officeDataV1.setNameDecorated( officeData.getNameDecorated() );
        officeDataV1.setExternalId( externalIdMapper.mapExternalId( officeData.getExternalId() ) );
        officeDataV1.setOpeningDate( avroDateTimeMapper.mapLocalDate( officeData.getOpeningDate() ) );
        officeDataV1.setHierarchy( officeData.getHierarchy() );
        officeDataV1.setParentId( officeData.getParentId() );
        officeDataV1.setParentName( officeData.getParentName() );
        officeDataV1.setAllowedParents( officeDataCollectionToOfficeDataV1List( officeData.getAllowedParents() ) );

        return officeDataV1;
    }

    protected CodeValueDataV1 codeValueDataToCodeValueDataV1(CodeValueData codeValueData) {
        if ( codeValueData == null ) {
            return null;
        }

        CodeValueDataV1 codeValueDataV1 = new CodeValueDataV1();

        codeValueDataV1.setId( codeValueData.getId() );
        codeValueDataV1.setName( codeValueData.getName() );
        codeValueDataV1.setPosition( codeValueData.getPosition() );
        codeValueDataV1.setDescription( codeValueData.getDescription() );
        codeValueDataV1.setActive( codeValueData.isActive() );
        codeValueDataV1.setMandatory( codeValueData.isMandatory() );

        return codeValueDataV1;
    }

    protected ClientTimelineDataV1 clientTimelineDataToClientTimelineDataV1(ClientTimelineData clientTimelineData) {
        if ( clientTimelineData == null ) {
            return null;
        }

        ClientTimelineDataV1 clientTimelineDataV1 = new ClientTimelineDataV1();

        clientTimelineDataV1.setSubmittedOnDate( avroDateTimeMapper.mapLocalDate( clientTimelineData.getSubmittedOnDate() ) );
        clientTimelineDataV1.setSubmittedByUsername( clientTimelineData.getSubmittedByUsername() );
        clientTimelineDataV1.setSubmittedByFirstname( clientTimelineData.getSubmittedByFirstname() );
        clientTimelineDataV1.setSubmittedByLastname( clientTimelineData.getSubmittedByLastname() );
        clientTimelineDataV1.setActivatedOnDate( avroDateTimeMapper.mapLocalDate( clientTimelineData.getActivatedOnDate() ) );
        clientTimelineDataV1.setActivatedByUsername( clientTimelineData.getActivatedByUsername() );
        clientTimelineDataV1.setActivatedByFirstname( clientTimelineData.getActivatedByFirstname() );
        clientTimelineDataV1.setActivatedByLastname( clientTimelineData.getActivatedByLastname() );
        clientTimelineDataV1.setClosedOnDate( avroDateTimeMapper.mapLocalDate( clientTimelineData.getClosedOnDate() ) );
        clientTimelineDataV1.setClosedByUsername( clientTimelineData.getClosedByUsername() );
        clientTimelineDataV1.setClosedByFirstname( clientTimelineData.getClosedByFirstname() );
        clientTimelineDataV1.setClosedByLastname( clientTimelineData.getClosedByLastname() );

        return clientTimelineDataV1;
    }

    protected ClientCollateralManagementDataV1 clientCollateralManagementDataToClientCollateralManagementDataV1(ClientCollateralManagementData clientCollateralManagementData) {
        if ( clientCollateralManagementData == null ) {
            return null;
        }

        ClientCollateralManagementDataV1 clientCollateralManagementDataV1 = new ClientCollateralManagementDataV1();

        clientCollateralManagementDataV1.setQuantity( clientCollateralManagementData.getQuantity() );
        clientCollateralManagementDataV1.setId( clientCollateralManagementData.getId() );
        clientCollateralManagementDataV1.setPctToBase( clientCollateralManagementData.getPctToBase() );
        clientCollateralManagementDataV1.setUnitPrice( clientCollateralManagementData.getUnitPrice() );
        clientCollateralManagementDataV1.setTotal( clientCollateralManagementData.getTotal() );
        clientCollateralManagementDataV1.setTotalCollateral( clientCollateralManagementData.getTotalCollateral() );
        clientCollateralManagementDataV1.setName( clientCollateralManagementData.getName() );

        return clientCollateralManagementDataV1;
    }

    protected List<ClientCollateralManagementDataV1> clientCollateralManagementDataSetToClientCollateralManagementDataV1List(Set<ClientCollateralManagementData> set) {
        if ( set == null ) {
            return null;
        }

        List<ClientCollateralManagementDataV1> list = new ArrayList<ClientCollateralManagementDataV1>( set.size() );
        for ( ClientCollateralManagementData clientCollateralManagementData : set ) {
            list.add( clientCollateralManagementDataToClientCollateralManagementDataV1( clientCollateralManagementData ) );
        }

        return list;
    }

    protected GroupRoleDataV1 groupRoleDataToGroupRoleDataV1(GroupRoleData groupRoleData) {
        if ( groupRoleData == null ) {
            return null;
        }

        GroupRoleDataV1 groupRoleDataV1 = new GroupRoleDataV1();

        groupRoleDataV1.setId( groupRoleData.getId() );
        groupRoleDataV1.setRole( codeValueDataToCodeValueDataV1( groupRoleData.getRole() ) );
        groupRoleDataV1.setClientId( groupRoleData.getClientId() );
        groupRoleDataV1.setClientName( groupRoleData.getClientName() );

        return groupRoleDataV1;
    }

    protected List<GroupRoleDataV1> groupRoleDataCollectionToGroupRoleDataV1List(Collection<GroupRoleData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<GroupRoleDataV1> list = new ArrayList<GroupRoleDataV1>( collection.size() );
        for ( GroupRoleData groupRoleData : collection ) {
            list.add( groupRoleDataToGroupRoleDataV1( groupRoleData ) );
        }

        return list;
    }

    protected List<String> localDateCollectionToStringList(Collection<LocalDate> collection) {
        if ( collection == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( collection.size() );
        for ( LocalDate localDate : collection ) {
            list.add( avroDateTimeMapper.mapLocalDate( localDate ) );
        }

        return list;
    }

    protected CalendarDataV1 calendarDataToCalendarDataV1(CalendarData calendarData) {
        if ( calendarData == null ) {
            return null;
        }

        CalendarDataV1 calendarDataV1 = new CalendarDataV1();

        calendarDataV1.setId( calendarData.getId() );
        calendarDataV1.setCalendarInstanceId( calendarData.getCalendarInstanceId() );
        calendarDataV1.setEntityId( calendarData.getEntityId() );
        calendarDataV1.setEntityType( enumOptionDataToEnumOptionDataV1( calendarData.getEntityType() ) );
        calendarDataV1.setTitle( calendarData.getTitle() );
        calendarDataV1.setDescription( calendarData.getDescription() );
        calendarDataV1.setLocation( calendarData.getLocation() );
        calendarDataV1.setStartDate( avroDateTimeMapper.mapLocalDate( calendarData.getStartDate() ) );
        calendarDataV1.setEndDate( avroDateTimeMapper.mapLocalDate( calendarData.getEndDate() ) );
        if ( calendarData.getMeetingTime() != null ) {
            calendarDataV1.setMeetingTime( DateTimeFormatter.ISO_LOCAL_TIME.format( calendarData.getMeetingTime() ) );
        }
        calendarDataV1.setDuration( calendarData.getDuration() );
        calendarDataV1.setType( enumOptionDataToEnumOptionDataV1( calendarData.getType() ) );
        calendarDataV1.setRepeating( calendarData.isRepeating() );
        calendarDataV1.setRecurrence( calendarData.getRecurrence() );
        calendarDataV1.setFrequency( enumOptionDataToEnumOptionDataV1( calendarData.getFrequency() ) );
        calendarDataV1.setInterval( calendarData.getInterval() );
        calendarDataV1.setRepeatsOnDay( enumOptionDataToEnumOptionDataV1( calendarData.getRepeatsOnDay() ) );
        calendarDataV1.setRepeatsOnNthDayOfMonth( enumOptionDataToEnumOptionDataV1( calendarData.getRepeatsOnNthDayOfMonth() ) );
        calendarDataV1.setRemindBy( enumOptionDataToEnumOptionDataV1( calendarData.getRemindBy() ) );
        calendarDataV1.setFirstReminder( calendarData.getFirstReminder() );
        calendarDataV1.setSecondReminder( calendarData.getSecondReminder() );
        calendarDataV1.setRecurringDates( localDateCollectionToStringList( calendarData.getRecurringDates() ) );
        calendarDataV1.setNextTenRecurringDates( localDateCollectionToStringList( calendarData.getNextTenRecurringDates() ) );
        calendarDataV1.setHumanReadable( calendarData.getHumanReadable() );
        calendarDataV1.setRecentEligibleMeetingDate( avroDateTimeMapper.mapLocalDate( calendarData.getRecentEligibleMeetingDate() ) );
        calendarDataV1.setCreatedDate( avroDateTimeMapper.mapOffsetDateTime( calendarData.getCreatedDate() ) );
        calendarDataV1.setLastUpdatedDate( avroDateTimeMapper.mapOffsetDateTime( calendarData.getLastUpdatedDate() ) );
        calendarDataV1.setCreatedByUserId( calendarData.getCreatedByUserId() );
        calendarDataV1.setCreatedByUsername( calendarData.getCreatedByUsername() );
        calendarDataV1.setLastUpdatedByUserId( calendarData.getLastUpdatedByUserId() );
        calendarDataV1.setLastUpdatedByUsername( calendarData.getLastUpdatedByUsername() );
        calendarDataV1.setRepeatsOnDayOfMonth( calendarData.getRepeatsOnDayOfMonth() );

        return calendarDataV1;
    }

    protected List<CalendarDataV1> calendarDataCollectionToCalendarDataV1List(Collection<CalendarData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<CalendarDataV1> list = new ArrayList<CalendarDataV1>( collection.size() );
        for ( CalendarData calendarData : collection ) {
            list.add( calendarDataToCalendarDataV1( calendarData ) );
        }

        return list;
    }

    protected GroupGeneralDataV1 groupGeneralDataToGroupGeneralDataV1(GroupGeneralData groupGeneralData) {
        if ( groupGeneralData == null ) {
            return null;
        }

        GroupGeneralDataV1 groupGeneralDataV1 = new GroupGeneralDataV1();

        groupGeneralDataV1.setId( groupGeneralData.getId() );
        groupGeneralDataV1.setAccountNo( groupGeneralData.getAccountNo() );
        groupGeneralDataV1.setName( groupGeneralData.getName() );
        groupGeneralDataV1.setExternalId( groupGeneralData.getExternalId() );
        groupGeneralDataV1.setStatus( enumOptionDataToEnumOptionDataV1( groupGeneralData.getStatus() ) );
        groupGeneralDataV1.setActive( groupGeneralData.getActive() );
        groupGeneralDataV1.setActivationDate( avroDateTimeMapper.mapLocalDate( groupGeneralData.getActivationDate() ) );
        groupGeneralDataV1.setOfficeId( groupGeneralData.getOfficeId() );
        groupGeneralDataV1.setOfficeName( groupGeneralData.getOfficeName() );
        groupGeneralDataV1.setCenterId( groupGeneralData.getCenterId() );
        groupGeneralDataV1.setCenterName( groupGeneralData.getCenterName() );
        groupGeneralDataV1.setStaffId( groupGeneralData.getStaffId() );
        groupGeneralDataV1.setStaffName( groupGeneralData.getStaffName() );
        groupGeneralDataV1.setHierarchy( groupGeneralData.getHierarchy() );
        groupGeneralDataV1.setGroupLevel( groupGeneralData.getGroupLevel() );
        groupGeneralDataV1.setGroupRoles( groupRoleDataCollectionToGroupRoleDataV1List( groupGeneralData.getGroupRoles() ) );
        groupGeneralDataV1.setCalendarsData( calendarDataCollectionToCalendarDataV1List( groupGeneralData.getCalendarsData() ) );
        groupGeneralDataV1.setCollectionMeetingCalendar( calendarDataToCalendarDataV1( groupGeneralData.getCollectionMeetingCalendar() ) );

        return groupGeneralDataV1;
    }

    protected List<GroupGeneralDataV1> groupGeneralDataCollectionToGroupGeneralDataV1List(Collection<GroupGeneralData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<GroupGeneralDataV1> list = new ArrayList<GroupGeneralDataV1>( collection.size() );
        for ( GroupGeneralData groupGeneralData : collection ) {
            list.add( groupGeneralDataToGroupGeneralDataV1( groupGeneralData ) );
        }

        return list;
    }

    protected ClientDataV1 clientDataToClientDataV1(ClientData clientData) {
        if ( clientData == null ) {
            return null;
        }

        ClientDataV1 clientDataV1 = new ClientDataV1();

        clientDataV1.setId( clientData.getId() );
        clientDataV1.setAccountNo( clientData.getAccountNo() );
        clientDataV1.setExternalId( externalIdMapper.mapExternalId( clientData.getExternalId() ) );
        clientDataV1.setStatus( enumOptionDataToEnumOptionDataV1( clientData.getStatus() ) );
        clientDataV1.setSubStatus( codeValueDataToCodeValueDataV1( clientData.getSubStatus() ) );
        clientDataV1.setActive( clientData.getActive() );
        clientDataV1.setActivationDate( avroDateTimeMapper.mapLocalDate( clientData.getActivationDate() ) );
        clientDataV1.setFirstname( clientData.getFirstname() );
        clientDataV1.setMiddlename( clientData.getMiddlename() );
        clientDataV1.setLastname( clientData.getLastname() );
        clientDataV1.setFullname( clientData.getFullname() );
        clientDataV1.setDisplayName( clientData.getDisplayName() );
        clientDataV1.setMobileNo( clientData.getMobileNo() );
        clientDataV1.setEmailAddress( clientData.getEmailAddress() );
        clientDataV1.setDateOfBirth( avroDateTimeMapper.mapLocalDate( clientData.getDateOfBirth() ) );
        clientDataV1.setGender( codeValueDataToCodeValueDataV1( clientData.getGender() ) );
        clientDataV1.setClientType( codeValueDataToCodeValueDataV1( clientData.getClientType() ) );
        clientDataV1.setClientClassification( codeValueDataToCodeValueDataV1( clientData.getClientClassification() ) );
        clientDataV1.setIsStaff( clientData.getIsStaff() );
        clientDataV1.setOfficeId( clientData.getOfficeId() );
        clientDataV1.setOfficeName( clientData.getOfficeName() );
        clientDataV1.setTransferToOfficeId( clientData.getTransferToOfficeId() );
        clientDataV1.setTransferToOfficeName( clientData.getTransferToOfficeName() );
        clientDataV1.setImageId( clientData.getImageId() );
        clientDataV1.setImagePresent( clientData.getImagePresent() );
        clientDataV1.setStaffId( clientData.getStaffId() );
        clientDataV1.setStaffName( clientData.getStaffName() );
        clientDataV1.setTimeline( clientTimelineDataToClientTimelineDataV1( clientData.getTimeline() ) );
        clientDataV1.setSavingsProductId( clientData.getSavingsProductId() );
        clientDataV1.setSavingsProductName( clientData.getSavingsProductName() );
        clientDataV1.setSavingsAccountId( clientData.getSavingsAccountId() );
        clientDataV1.setLegalForm( enumOptionDataToEnumOptionDataV1( clientData.getLegalForm() ) );
        clientDataV1.setClientCollateralManagements( clientCollateralManagementDataSetToClientCollateralManagementDataV1List( clientData.getClientCollateralManagements() ) );
        clientDataV1.setGroups( groupGeneralDataCollectionToGroupGeneralDataV1List( clientData.getGroups() ) );

        return clientDataV1;
    }

    protected PortfolioAccountDataV1 portfolioAccountDataToPortfolioAccountDataV1(PortfolioAccountData portfolioAccountData) {
        if ( portfolioAccountData == null ) {
            return null;
        }

        PortfolioAccountDataV1 portfolioAccountDataV1 = new PortfolioAccountDataV1();

        portfolioAccountDataV1.setId( portfolioAccountData.getId() );
        portfolioAccountDataV1.setAccountNo( portfolioAccountData.getAccountNo() );
        portfolioAccountDataV1.setExternalId( portfolioAccountData.getExternalId() );
        portfolioAccountDataV1.setGroupId( portfolioAccountData.getGroupId() );
        portfolioAccountDataV1.setGroupName( portfolioAccountData.getGroupName() );
        portfolioAccountDataV1.setClientId( portfolioAccountData.getClientId() );
        portfolioAccountDataV1.setClientName( portfolioAccountData.getClientName() );
        portfolioAccountDataV1.setProductId( portfolioAccountData.getProductId() );
        portfolioAccountDataV1.setProductName( portfolioAccountData.getProductName() );
        portfolioAccountDataV1.setFieldOfficerId( portfolioAccountData.getFieldOfficerId() );
        portfolioAccountDataV1.setFieldOfficerName( portfolioAccountData.getFieldOfficerName() );
        portfolioAccountDataV1.setCurrency( currencyDataToCurrencyDataV1( portfolioAccountData.getCurrency() ) );
        portfolioAccountDataV1.setAmtForTransfer( portfolioAccountData.getAmtForTransfer() );

        return portfolioAccountDataV1;
    }

    protected AccountTransferDataV1 accountTransferDataToAccountTransferDataV1(AccountTransferData accountTransferData) {
        if ( accountTransferData == null ) {
            return null;
        }

        AccountTransferDataV1 accountTransferDataV1 = new AccountTransferDataV1();

        if ( accountTransferData.getId() != null ) {
            accountTransferDataV1.setId( accountTransferData.getId().intValue() );
        }
        accountTransferDataV1.setReversed( accountTransferData.getReversed() );
        accountTransferDataV1.setCurrency( currencyDataToCurrencyDataV1( accountTransferData.getCurrency() ) );
        accountTransferDataV1.setTransferAmount( accountTransferData.getTransferAmount() );
        accountTransferDataV1.setTransferDate( avroDateTimeMapper.mapLocalDate( accountTransferData.getTransferDate() ) );
        accountTransferDataV1.setTransferDescription( accountTransferData.getTransferDescription() );
        accountTransferDataV1.setFromOffice( officeDataToOfficeDataV1( accountTransferData.getFromOffice() ) );
        accountTransferDataV1.setFromClient( clientDataToClientDataV1( accountTransferData.getFromClient() ) );
        accountTransferDataV1.setFromAccountType( enumOptionDataToEnumOptionDataV1( accountTransferData.getFromAccountType() ) );
        accountTransferDataV1.setFromAccount( portfolioAccountDataToPortfolioAccountDataV1( accountTransferData.getFromAccount() ) );
        accountTransferDataV1.setToOffice( officeDataToOfficeDataV1( accountTransferData.getToOffice() ) );
        accountTransferDataV1.setToClient( clientDataToClientDataV1( accountTransferData.getToClient() ) );
        accountTransferDataV1.setToAccountType( enumOptionDataToEnumOptionDataV1( accountTransferData.getToAccountType() ) );
        accountTransferDataV1.setToAccount( portfolioAccountDataToPortfolioAccountDataV1( accountTransferData.getToAccount() ) );

        return accountTransferDataV1;
    }

    protected GLAccountDataV1 gLAccountDataToGLAccountDataV1(GLAccountData gLAccountData) {
        if ( gLAccountData == null ) {
            return null;
        }

        GLAccountDataV1 gLAccountDataV1 = new GLAccountDataV1();

        gLAccountDataV1.setId( gLAccountData.getId() );
        gLAccountDataV1.setName( gLAccountData.getName() );
        gLAccountDataV1.setParentId( gLAccountData.getParentId() );
        gLAccountDataV1.setGlCode( gLAccountData.getGlCode() );
        gLAccountDataV1.setDisabled( gLAccountData.getDisabled() );
        gLAccountDataV1.setManualEntriesAllowed( gLAccountData.getManualEntriesAllowed() );
        gLAccountDataV1.setType( enumOptionDataToEnumOptionDataV1( gLAccountData.getType() ) );
        gLAccountDataV1.setUsage( enumOptionDataToEnumOptionDataV1( gLAccountData.getUsage() ) );
        gLAccountDataV1.setDescription( gLAccountData.getDescription() );
        gLAccountDataV1.setNameDecorated( gLAccountData.getNameDecorated() );
        gLAccountDataV1.setTagId( codeValueDataToCodeValueDataV1( gLAccountData.getTagId() ) );
        gLAccountDataV1.setOrganizationRunningBalance( gLAccountData.getOrganizationRunningBalance() );

        return gLAccountDataV1;
    }

    protected ChargeDataV1 chargeDataToChargeDataV1(ChargeData chargeData) {
        if ( chargeData == null ) {
            return null;
        }

        ChargeDataV1 chargeDataV1 = new ChargeDataV1();

        chargeDataV1.setId( chargeData.getId() );
        chargeDataV1.setName( chargeData.getName() );
        chargeDataV1.setActive( chargeData.isActive() );
        chargeDataV1.setPenalty( chargeData.isPenalty() );
        chargeDataV1.setFreeWithdrawal( chargeData.isFreeWithdrawal() );
        chargeDataV1.setFreeWithdrawalChargeFrequency( chargeData.getFreeWithdrawalChargeFrequency() );
        chargeDataV1.setRestartFrequency( chargeData.getRestartFrequency() );
        chargeDataV1.setRestartFrequencyEnum( chargeData.getRestartFrequencyEnum() );
        chargeDataV1.setIsPaymentType( chargeData.isIsPaymentType() );
        chargeDataV1.setPaymentTypeOptions( paymentTypeDataToPaymentTypeDataV1( chargeData.getPaymentTypeOptions() ) );
        chargeDataV1.setCurrency( currencyDataToCurrencyDataV1( chargeData.getCurrency() ) );
        chargeDataV1.setAmount( chargeData.getAmount() );
        chargeDataV1.setChargeTimeType( enumOptionDataToEnumOptionDataV1( chargeData.getChargeTimeType() ) );
        chargeDataV1.setChargeAppliesTo( enumOptionDataToEnumOptionDataV1( chargeData.getChargeAppliesTo() ) );
        chargeDataV1.setChargeCalculationType( enumOptionDataToEnumOptionDataV1( chargeData.getChargeCalculationType() ) );
        chargeDataV1.setChargePaymentMode( enumOptionDataToEnumOptionDataV1( chargeData.getChargePaymentMode() ) );
        chargeDataV1.setFeeOnMonthDay( avroMonthDayMapper.mapMonthDay( chargeData.getFeeOnMonthDay() ) );
        chargeDataV1.setFeeInterval( chargeData.getFeeInterval() );
        chargeDataV1.setMinCap( chargeData.getMinCap() );
        chargeDataV1.setMaxCap( chargeData.getMaxCap() );
        chargeDataV1.setFeeFrequency( enumOptionDataToEnumOptionDataV1( chargeData.getFeeFrequency() ) );
        chargeDataV1.setIncomeOrLiabilityAccount( gLAccountDataToGLAccountDataV1( chargeData.getIncomeOrLiabilityAccount() ) );

        return chargeDataV1;
    }

    protected SavingsAccountChargeDataV1 savingsAccountChargeDataToSavingsAccountChargeDataV1(SavingsAccountChargeData savingsAccountChargeData) {
        if ( savingsAccountChargeData == null ) {
            return null;
        }

        SavingsAccountChargeDataV1 savingsAccountChargeDataV1 = new SavingsAccountChargeDataV1();

        savingsAccountChargeDataV1.setId( savingsAccountChargeData.getId() );
        savingsAccountChargeDataV1.setChargeId( savingsAccountChargeData.getChargeId() );
        savingsAccountChargeDataV1.setAccountId( savingsAccountChargeData.getAccountId() );
        savingsAccountChargeDataV1.setName( savingsAccountChargeData.getName() );
        savingsAccountChargeDataV1.setChargeTimeType( enumOptionDataToEnumOptionDataV1( savingsAccountChargeData.getChargeTimeType() ) );
        savingsAccountChargeDataV1.setDueDate( avroDateTimeMapper.mapLocalDate( savingsAccountChargeData.getDueDate() ) );
        savingsAccountChargeDataV1.setFeeOnMonthDay( avroMonthDayMapper.mapMonthDay( savingsAccountChargeData.getFeeOnMonthDay() ) );
        savingsAccountChargeDataV1.setFeeInterval( savingsAccountChargeData.getFeeInterval() );
        savingsAccountChargeDataV1.setChargeCalculationType( enumOptionDataToEnumOptionDataV1( savingsAccountChargeData.getChargeCalculationType() ) );
        savingsAccountChargeDataV1.setPercentage( savingsAccountChargeData.getPercentage() );
        savingsAccountChargeDataV1.setAmountPercentageAppliedTo( savingsAccountChargeData.getAmountPercentageAppliedTo() );
        savingsAccountChargeDataV1.setCurrency( currencyDataToCurrencyDataV1( savingsAccountChargeData.getCurrency() ) );
        savingsAccountChargeDataV1.setAmount( savingsAccountChargeData.getAmount() );
        savingsAccountChargeDataV1.setAmountPaid( savingsAccountChargeData.getAmountPaid() );
        savingsAccountChargeDataV1.setAmountWaived( savingsAccountChargeData.getAmountWaived() );
        savingsAccountChargeDataV1.setAmountWrittenOff( savingsAccountChargeData.getAmountWrittenOff() );
        savingsAccountChargeDataV1.setAmountOutstanding( savingsAccountChargeData.getAmountOutstanding() );
        savingsAccountChargeDataV1.setAmountOrPercentage( savingsAccountChargeData.getAmountOrPercentage() );
        savingsAccountChargeDataV1.setPenalty( savingsAccountChargeData.isPenalty() );
        savingsAccountChargeDataV1.setIsActive( savingsAccountChargeData.getIsActive() );
        savingsAccountChargeDataV1.setIsFreeWithdrawal( savingsAccountChargeData.getIsFreeWithdrawal() );
        savingsAccountChargeDataV1.setFreeWithdrawalChargeFrequency( savingsAccountChargeData.getFreeWithdrawalChargeFrequency() );
        savingsAccountChargeDataV1.setRestartFrequency( savingsAccountChargeData.getRestartFrequency() );
        savingsAccountChargeDataV1.setRestartFrequencyEnum( savingsAccountChargeData.getRestartFrequencyEnum() );
        savingsAccountChargeDataV1.setInactivationDate( avroDateTimeMapper.mapLocalDate( savingsAccountChargeData.getInactivationDate() ) );
        savingsAccountChargeDataV1.setChargeData( chargeDataToChargeDataV1( savingsAccountChargeData.getChargeData() ) );

        return savingsAccountChargeDataV1;
    }

    protected SavingsAccountChargesPaidByDataV1 savingsAccountChargesPaidByDataToSavingsAccountChargesPaidByDataV1(SavingsAccountChargesPaidByData savingsAccountChargesPaidByData) {
        if ( savingsAccountChargesPaidByData == null ) {
            return null;
        }

        SavingsAccountChargesPaidByDataV1 savingsAccountChargesPaidByDataV1 = new SavingsAccountChargesPaidByDataV1();

        savingsAccountChargesPaidByDataV1.setChargeId( savingsAccountChargesPaidByData.getChargeId() );
        savingsAccountChargesPaidByDataV1.setAmount( savingsAccountChargesPaidByData.getAmount() );
        savingsAccountChargesPaidByDataV1.setSavingsAccountChargeData( savingsAccountChargeDataToSavingsAccountChargeDataV1( savingsAccountChargesPaidByData.getSavingsAccountChargeData() ) );

        return savingsAccountChargesPaidByDataV1;
    }

    protected List<SavingsAccountChargesPaidByDataV1> savingsAccountChargesPaidByDataSetToSavingsAccountChargesPaidByDataV1List(Set<SavingsAccountChargesPaidByData> set) {
        if ( set == null ) {
            return null;
        }

        List<SavingsAccountChargesPaidByDataV1> list = new ArrayList<SavingsAccountChargesPaidByDataV1>( set.size() );
        for ( SavingsAccountChargesPaidByData savingsAccountChargesPaidByData : set ) {
            list.add( savingsAccountChargesPaidByDataToSavingsAccountChargesPaidByDataV1( savingsAccountChargesPaidByData ) );
        }

        return list;
    }

    protected SavingsAccountTransactionDataV1 savingsAccountTransactionDataToSavingsAccountTransactionDataV1(SavingsAccountTransactionData savingsAccountTransactionData) {
        if ( savingsAccountTransactionData == null ) {
            return null;
        }

        SavingsAccountTransactionDataV1 savingsAccountTransactionDataV1 = new SavingsAccountTransactionDataV1();

        savingsAccountTransactionDataV1.setId( savingsAccountTransactionData.getId() );
        savingsAccountTransactionDataV1.setTransactionType( savingsAccountTransactionEnumDataToSavingsAccountTransactionEnumDataV1( savingsAccountTransactionData.getTransactionType() ) );
        savingsAccountTransactionDataV1.setAccountId( savingsAccountTransactionData.getAccountId() );
        savingsAccountTransactionDataV1.setAccountNo( savingsAccountTransactionData.getAccountNo() );
        savingsAccountTransactionDataV1.setDate( avroDateTimeMapper.mapLocalDate( savingsAccountTransactionData.getDate() ) );
        savingsAccountTransactionDataV1.setCurrency( currencyDataToCurrencyDataV1( savingsAccountTransactionData.getCurrency() ) );
        savingsAccountTransactionDataV1.setPaymentDetailData( paymentDetailDataToPaymentDetailDataV1( savingsAccountTransactionData.getPaymentDetailData() ) );
        savingsAccountTransactionDataV1.setAmount( savingsAccountTransactionData.getAmount() );
        savingsAccountTransactionDataV1.setOutstandingChargeAmount( savingsAccountTransactionData.getOutstandingChargeAmount() );
        savingsAccountTransactionDataV1.setRunningBalance( savingsAccountTransactionData.getRunningBalance() );
        savingsAccountTransactionDataV1.setReversed( savingsAccountTransactionData.isReversed() );
        savingsAccountTransactionDataV1.setTransfer( accountTransferDataToAccountTransferDataV1( savingsAccountTransactionData.getTransfer() ) );
        savingsAccountTransactionDataV1.setSubmittedOnDate( avroDateTimeMapper.mapLocalDate( savingsAccountTransactionData.getSubmittedOnDate() ) );
        savingsAccountTransactionDataV1.setInterestedPostedAsOn( savingsAccountTransactionData.isInterestedPostedAsOn() );
        savingsAccountTransactionDataV1.setSubmittedByUsername( savingsAccountTransactionData.getSubmittedByUsername() );
        savingsAccountTransactionDataV1.setNote( savingsAccountTransactionData.getNote() );
        savingsAccountTransactionDataV1.setIsManualTransaction( savingsAccountTransactionData.isIsManualTransaction() );
        savingsAccountTransactionDataV1.setIsReversal( savingsAccountTransactionData.getIsReversal() );
        if ( savingsAccountTransactionData.getOriginalTransactionId() != null ) {
            savingsAccountTransactionDataV1.setOriginalTransactionId( String.valueOf( savingsAccountTransactionData.getOriginalTransactionId() ) );
        }
        savingsAccountTransactionDataV1.setLienTransaction( savingsAccountTransactionData.getLienTransaction() );
        savingsAccountTransactionDataV1.setReleaseTransactionId( savingsAccountTransactionData.getReleaseTransactionId() );
        savingsAccountTransactionDataV1.setReasonForBlock( savingsAccountTransactionData.getReasonForBlock() );
        savingsAccountTransactionDataV1.setChargesPaidByData( savingsAccountChargesPaidByDataSetToSavingsAccountChargesPaidByDataV1List( savingsAccountTransactionData.getChargesPaidByData() ) );

        return savingsAccountTransactionDataV1;
    }

    protected List<SavingsAccountTransactionDataV1> savingsAccountTransactionDataCollectionToSavingsAccountTransactionDataV1List(Collection<SavingsAccountTransactionData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<SavingsAccountTransactionDataV1> list = new ArrayList<SavingsAccountTransactionDataV1>( collection.size() );
        for ( SavingsAccountTransactionData savingsAccountTransactionData : collection ) {
            list.add( savingsAccountTransactionDataToSavingsAccountTransactionDataV1( savingsAccountTransactionData ) );
        }

        return list;
    }

    protected List<SavingsAccountChargeDataV1> savingsAccountChargeDataCollectionToSavingsAccountChargeDataV1List(Collection<SavingsAccountChargeData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<SavingsAccountChargeDataV1> list = new ArrayList<SavingsAccountChargeDataV1>( collection.size() );
        for ( SavingsAccountChargeData savingsAccountChargeData : collection ) {
            list.add( savingsAccountChargeDataToSavingsAccountChargeDataV1( savingsAccountChargeData ) );
        }

        return list;
    }
}
