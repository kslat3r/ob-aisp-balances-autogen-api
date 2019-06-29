package com.sapient.aisp.balances.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.sapient.aisp.balances.model.OBActiveOrHistoricCurrencyAndAmount;
import com.sapient.aisp.balances.model.OBBalanceType1Code;
import com.sapient.aisp.balances.model.OBCreditLine1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of elements used to define the balance details.
 */
@ApiModel(description = "Set of elements used to define the balance details.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-29T16:58:28.625+01:00[Europe/London]")
public class OBCashBalance1   {
  @JsonProperty("AccountId")
  private String accountId = null;

  /**
   * Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.
   */
  public enum CreditDebitIndicatorEnum {
    CREDIT("Credit"),
    
    DEBIT("Debit");

    private String value;

    CreditDebitIndicatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CreditDebitIndicatorEnum fromValue(String text) {
      for (CreditDebitIndicatorEnum b : CreditDebitIndicatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("CreditDebitIndicator")
  private CreditDebitIndicatorEnum creditDebitIndicator = null;

  @JsonProperty("Type")
  private OBBalanceType1Code type = null;

  @JsonProperty("DateTime")
  private OffsetDateTime dateTime = null;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount amount = null;

  @JsonProperty("CreditLine")
  @Valid
  private List<OBCreditLine1> creditLine = null;

  public OBCashBalance1 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=40)   public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBCashBalance1 creditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.")
  @NotNull

  public CreditDebitIndicatorEnum getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBCashBalance1 type(OBBalanceType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public OBBalanceType1Code getType() {
    return type;
  }

  public void setType(OBBalanceType1Code type) {
    this.type = type;
  }

  public OBCashBalance1 dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Indicates the date (and time) of the balance. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return dateTime
  **/
  @ApiModelProperty(required = true, value = "Indicates the date (and time) of the balance. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public OBCashBalance1 amount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public OBActiveOrHistoricCurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
  }

  public OBCashBalance1 creditLine(List<OBCreditLine1> creditLine) {
    this.creditLine = creditLine;
    return this;
  }

  public OBCashBalance1 addCreditLineItem(OBCreditLine1 creditLineItem) {
    if (this.creditLine == null) {
      this.creditLine = new ArrayList<OBCreditLine1>();
    }
    this.creditLine.add(creditLineItem);
    return this;
  }

  /**
   * Set of elements used to provide details on the credit line.
   * @return creditLine
  **/
  @ApiModelProperty(value = "Set of elements used to provide details on the credit line.")
  @Valid
  public List<OBCreditLine1> getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(List<OBCreditLine1> creditLine) {
    this.creditLine = creditLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCashBalance1 obCashBalance1 = (OBCashBalance1) o;
    return Objects.equals(this.accountId, obCashBalance1.accountId) &&
        Objects.equals(this.creditDebitIndicator, obCashBalance1.creditDebitIndicator) &&
        Objects.equals(this.type, obCashBalance1.type) &&
        Objects.equals(this.dateTime, obCashBalance1.dateTime) &&
        Objects.equals(this.amount, obCashBalance1.amount) &&
        Objects.equals(this.creditLine, obCashBalance1.creditLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creditDebitIndicator, type, dateTime, amount, creditLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCashBalance1 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
