package com.sapient.aisp.balances.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Limit type, in a coded form.
 */
public enum OBExternalLimitType1Code {
  AVAILABLE("Available"),
    CREDIT("Credit"),
    EMERGENCY("Emergency"),
    PRE_AGREED("Pre-Agreed"),
    TEMPORARY("Temporary");

  private String value;

  OBExternalLimitType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalLimitType1Code fromValue(String text) {
    for (OBExternalLimitType1Code b : OBExternalLimitType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
