package com.sapient.aisp.balances.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sapient.aisp.balances.model.OBCashBalance1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * OBReadBalance1Data
 */

public class OBReadBalance1Data   {
  @JsonProperty("Balance")
  @Valid
  private List<OBCashBalance1> balance = new ArrayList<>();

  public OBReadBalance1Data balance(List<OBCashBalance1> balance) {
    this.balance = balance;
    return this;
  }

  public OBReadBalance1Data addBalanceItem(OBCashBalance1 balanceItem) {
    this.balance.add(balanceItem);
    return this;
  }

  /**
   * Set of elements used to define the balance details.
   * @return balance
  */
  @ApiModelProperty(required = true, value = "Set of elements used to define the balance details.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<OBCashBalance1> getBalance() {
    return balance;
  }

  public void setBalance(List<OBCashBalance1> balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1Data obReadBalance1Data = (OBReadBalance1Data) o;
    return Objects.equals(this.balance, obReadBalance1Data.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1Data {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

