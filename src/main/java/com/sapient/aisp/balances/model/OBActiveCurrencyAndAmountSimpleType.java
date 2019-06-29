package com.sapient.aisp.balances.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
 */
@ApiModel(description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-29T16:58:28.625+01:00[Europe/London]")
public class OBActiveCurrencyAndAmountSimpleType   {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBActiveCurrencyAndAmountSimpleType {\n");
    
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
