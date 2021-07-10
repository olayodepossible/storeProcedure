package com.stanbic.service.finacle.enquiry.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * @author Abayomi
 */


@NamedStoredProcedureQuery(
        name = "TransactionLog.fetchPostedTransaction",
        procedureName = "rbx_fetch_posted_tran_pkg.FETCH_POSTED_TRAN",

        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "out_cursor",  type = Void.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "v_tran_date",  type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "SAP_ID",  type = String.class)
        },
        resultSetMappings = "TransactionLog.fetchPostedTransaction"

)
@SqlResultSetMapping(
        name = "TransactionLog.fetchPostedTransaction",
        entities = {
                @EntityResult(
                        entityClass = TransactionLog.class,
                         fields = {
                                @FieldResult(name = "id", column = "id"),
                                @FieldResult(name = "transactionId", column = "TRAN_ID"),
                                @FieldResult(name = "transactionDate", column = "TRAN_DATE"),
                                @FieldResult(name = "partTransactionSerialNumber", column = "PART_TRAN_SRL_NUM"),
                                @FieldResult(name = "deleteFlag", column = "DEL_FLG"),
                                @FieldResult(name = "transactionType", column = "TRAN_TYPE"),
                                @FieldResult(name = "transactionSubType", column = "TRAN_SUB_TYPE"),
                                @FieldResult(name = "transactionPartType", column = "PART_TRAN_TYPE"),
                                @FieldResult(name = "accountId", column = "ACID"),
                                @FieldResult(name = "valueDate", column = "VALUE_DATE"),
                                @FieldResult(name = "entryDate", column = "ENTRY_DATE"),
                                @FieldResult(name = "postedDate", column = "PSTD_DATE"),
                                @FieldResult(name = "verifyDate", column = "VFD_DATE"),
                                @FieldResult(name = "transactionAmount", column = "TRAN_AMT"),
                                @FieldResult(name = "transactionParticular", column = "TRAN_PARTICULAR"),
                                @FieldResult(name = "entryUserId", column = "ENTRY_USER_ID"),
                                @FieldResult(name = "postedUserId", column = "PSTD_USER_ID"),
                                @FieldResult(name = "verifiedUserId", column = "VFD_USER_ID"),
                                @FieldResult(name = "reportCode", column = "RPT_CODE"),
                                @FieldResult(name = "referenceNumber", column = "REF_NUM"),
                                @FieldResult(name = "instrumentType", column = "INSTRMNT_TYPE"),
                                @FieldResult(name = "instrumentDate", column = "INSTRMNT_DATE"),
                                @FieldResult(name = "instrumentNumber", column = "INSTRMNT_NUM"),
                                @FieldResult(name = "instrumentAlpha", column = "INSTRMNT_ALPHA"),
                                @FieldResult(name = "transactionRemarks", column = "TRAN_RMKS"),
                                @FieldResult(name = "postedFlag", column = "PSTD_FLG"),
                                @FieldResult(name = "customerId", column = "CUST_ID"),
                                @FieldResult(name = "bankCode", column = "BANK_CODE"),
                                @FieldResult(name = "moduleId", column = "MODULE_ID"),
                                @FieldResult(name = "branchCode", column = "BR_CODE"),
                                @FieldResult(name = "currencyCode", column = "CRNCY_CODE"),
                                @FieldResult(name = "transactionCurrencyCode", column = "TRAN_CRNCY_CODE"),
                                @FieldResult(name = "referenceCurrencyCode", column = "REF_CRNCY_CODE"),
                                @FieldResult(name = "referenceAmount", column = "REF_AMT"),
                                @FieldResult(name = "branchId", column = "SOL_ID"),
                                @FieldResult(name = "serialNumber", column = "SERIAL_NUM"),
                                @FieldResult(name = "reversalDate", column = "REVERSAL_DATE"),
                                @FieldResult(name = "reversalValueDate", column = "REVERSAL_VALUE_DATE"),
                                @FieldResult(name = "transactionInitiatedBranch", column = "DTH_INIT_SOL_ID"),
                                @FieldResult(name = "transactionParticular2", column = "TRAN_PARTICULAR_2"),
                                @FieldResult(name = "transactionParticularCode", column = "TRAN_PARTICULAR_CODE"),
                                @FieldResult(name = "bankId", column = "BANK_ID"),
                                @FieldResult(name = "accountNumber", column = "FORACID"),
                                @FieldResult(name = "accountName", column = "ACCT_NAME"),
                                @FieldResult(name = "schemeCode", column = "SCHM_CODE"),
                        }
                )
        }
)
@Entity
public class TransactionLog implements Serializable {

    @Id
    private Long id;

    private String transactionId;

    private String transactionDate;

    private String partTransactionSerialNumber;

    private String deleteFlag;

    private String transactionType;

    private String transactionSubType;

    private String transactionPartType;

    private String accountId;

    private Date valueDate;

    private Date entryDate;

    private Date postedDate;

    private Date verifyDate;

    private BigDecimal transactionAmount;

    private String transactionParticular;

    private String entryUserId;

    private String postedUserId;

    private String verifiedUserId;

    private String reportCode;

    private String referenceNumber;

    private String instrumentType;

    private Date instrumentDate;

    private String instrumentNumber;

    private String instrumentAlpha;

    private String transactionRemarks;

    private String postedFlag;

    private String customerId;

    private String moduleId;

    private String branchCode;

    private String currencyCode;

    private String transactionCurrencyCode;

    private String referenceCurrencyCode;

    private String referenceAmount;

    private String branchId;

    private String bankCode;

    private String serialNumber;

    private String reversalDate;

    private String reversalValueDate;

    private String transactionInitiatedBranch;

    private String transactionParticular2;

    private String transactionParticularCode;

    private String bankId;

    private String accountNumber;

    private String accountName;

    private String schemeCode;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public String getDeleteFlag() {
        return deleteFlag;
    }

    public String getEntryUserId() {
        return entryUserId;
    }

    public void setEntryUserId(String entryUserId) {
        this.entryUserId = entryUserId;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionSubType() {
        return transactionSubType;
    }

    public void setTransactionSubType(String transactionSubType) {
        this.transactionSubType = transactionSubType;
    }

    public String getTransactionPartType() {
        return transactionPartType;
    }

    public void setTransactionPartType(String transactionPartType) {
        this.transactionPartType = transactionPartType;
    }


    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public Date getVerifyDate() {
        return verifyDate;
    }

    public void setVerifyDate(Date verifyDate) {
        this.verifyDate = verifyDate;
    }


    public String getTransactionParticular() {
        return transactionParticular;
    }

    public void setTransactionParticular(String transactionParticular) {
        this.transactionParticular = transactionParticular;
    }

    public String getPostedUserId() {
        return postedUserId;
    }

    public void setPostedUserId(String postedUserId) {
        this.postedUserId = postedUserId;
    }

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
    }


    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public Date getInstrumentDate() {
        return instrumentDate;
    }

    public void setInstrumentDate(Date instrumentDate) {
        this.instrumentDate = instrumentDate;
    }

    public String getInstrumentAlpha() {
        return instrumentAlpha;
    }

    public void setInstrumentAlpha(String instrumentAlpha) {
        this.instrumentAlpha = instrumentAlpha;
    }

    public String getTransactionRemarks() {
        return transactionRemarks;
    }

    public void setTransactionRemarks(String transactionRemarks) {
        this.transactionRemarks = transactionRemarks;
    }

    public String getPostedFlag() {
        return postedFlag;
    }

    public void setPostedFlag(String postedFlag) {
        this.postedFlag = postedFlag;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }


    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getReversalDate() {
        return reversalDate;
    }

    public void setReversalDate(String reversalDate) {
        this.reversalDate = reversalDate;
    }

    public String getReversalValueDate() {
        return reversalValueDate;
    }

    public void setReversalValueDate(String reversalValueDate) {
        this.reversalValueDate = reversalValueDate;
    }

    public String getTransactionInitiatedBranch() {
        return transactionInitiatedBranch;
    }

    public void setTransactionInitiatedBranch(String transactionInitiatedBranch) {
        this.transactionInitiatedBranch = transactionInitiatedBranch;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPartTransactionSerialNumber() {
        return partTransactionSerialNumber;
    }

    public void setPartTransactionSerialNumber(String partTransactionSerialNumber) {
        this.partTransactionSerialNumber = partTransactionSerialNumber;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getInstrumentNumber() {
        return instrumentNumber;
    }

    public void setInstrumentNumber(String instrumentNumber) {
        this.instrumentNumber = instrumentNumber;
    }

    public String getTransactionCurrencyCode() {
        return transactionCurrencyCode;
    }

    public void setTransactionCurrencyCode(String transactionCurrencyCode) {
        this.transactionCurrencyCode = transactionCurrencyCode;
    }

    public String getReferenceCurrencyCode() {
        return referenceCurrencyCode;
    }

    public void setReferenceCurrencyCode(String referenceCurrencyCode) {
        this.referenceCurrencyCode = referenceCurrencyCode;
    }

    public String getReferenceAmount() {
        return referenceAmount;
    }

    public void setReferenceAmount(String referenceAmount) {
        this.referenceAmount = referenceAmount;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getTransactionParticular2() {
        return transactionParticular2;
    }

    public void setTransactionParticular2(String transactionParticular2) {
        this.transactionParticular2 = transactionParticular2;
    }

    public String getTransactionParticularCode() {
        return transactionParticularCode;
    }

    public void setTransactionParticularCode(String transactionParticularCode) {
        this.transactionParticularCode = transactionParticularCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSchemeCode() {
        return schemeCode;
    }

    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getVerifiedUserId() {
        return verifiedUserId;
    }

    public void setVerifiedUserId(String verifiedUserId) {
        this.verifiedUserId = verifiedUserId;
    }

    private static final long serialVersionUID = 1L;

}
