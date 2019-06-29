package com.sapient.aisp.balances.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * Meta Data relevant to the payload
 */
@ApiModel(description = "Meta Data relevant to the payload")

public class Meta   {
  @JsonProperty("TotalPages")
  private Integer totalPages;

  @JsonProperty("FirstAvailableDateTime")
  private OffsetDateTime firstAvailableDateTime;

  @JsonProperty("LastAvailableDateTime")
  private OffsetDateTime lastAvailableDateTime;

  public Meta totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  @ApiModelProperty(value = "")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public Meta firstAvailableDateTime(OffsetDateTime firstAvailableDateTime) {
    this.firstAvailableDateTime = firstAvailableDateTime;
    return this;
  }

  /**
   * All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return firstAvailableDateTime
  */
  @ApiModelProperty(value = "All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public OffsetDateTime getFirstAvailableDateTime() {
    return firstAvailableDateTime;
  }

  public void setFirstAvailableDateTime(OffsetDateTime firstAvailableDateTime) {
    this.firstAvailableDateTime = firstAvailableDateTime;
  }

  public Meta lastAvailableDateTime(OffsetDateTime lastAvailableDateTime) {
    this.lastAvailableDateTime = lastAvailableDateTime;
    return this;
  }

  /**
   * All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return lastAvailableDateTime
  */
  @ApiModelProperty(value = "All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public OffsetDateTime getLastAvailableDateTime() {
    return lastAvailableDateTime;
  }

  public void setLastAvailableDateTime(OffsetDateTime lastAvailableDateTime) {
    this.lastAvailableDateTime = lastAvailableDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.totalPages, meta.totalPages) &&
        Objects.equals(this.firstAvailableDateTime, meta.firstAvailableDateTime) &&
        Objects.equals(this.lastAvailableDateTime, meta.lastAvailableDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, firstAvailableDateTime, lastAvailableDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    firstAvailableDateTime: ").append(toIndentedString(firstAvailableDateTime)).append("\n");
    sb.append("    lastAvailableDateTime: ").append(toIndentedString(lastAvailableDateTime)).append("\n");
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

