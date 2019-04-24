/*
 * SOBIO
 * SOBIO Biometric Services
 *
 * OpenAPI spec version: 1
 * Contact: info@softwaredelcentro.com.ar
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ar.com.sdc.sobio.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FingerPrintMatchingParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-24T14:47:31.932-03:00")
public class FingerPrintMatchingParameters {
  @JsonProperty("maxRotation")
  private Float maxRotation = null;

  @JsonProperty("useOnlyAnsi378")
  private Boolean useOnlyAnsi378 = null;

  public FingerPrintMatchingParameters maxRotation(Float maxRotation) {
    this.maxRotation = maxRotation;
    return this;
  }

   /**
   * Get maxRotation
   * @return maxRotation
  **/
  @ApiModelProperty(value = "")
  public Float getMaxRotation() {
    return maxRotation;
  }

  public void setMaxRotation(Float maxRotation) {
    this.maxRotation = maxRotation;
  }

  public FingerPrintMatchingParameters useOnlyAnsi378(Boolean useOnlyAnsi378) {
    this.useOnlyAnsi378 = useOnlyAnsi378;
    return this;
  }

   /**
   * Get useOnlyAnsi378
   * @return useOnlyAnsi378
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseOnlyAnsi378() {
    return useOnlyAnsi378;
  }

  public void setUseOnlyAnsi378(Boolean useOnlyAnsi378) {
    this.useOnlyAnsi378 = useOnlyAnsi378;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FingerPrintMatchingParameters fingerPrintMatchingParameters = (FingerPrintMatchingParameters) o;
    return Objects.equals(this.maxRotation, fingerPrintMatchingParameters.maxRotation) &&
        Objects.equals(this.useOnlyAnsi378, fingerPrintMatchingParameters.useOnlyAnsi378);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRotation, useOnlyAnsi378);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FingerPrintMatchingParameters {\n");
    
    sb.append("    maxRotation: ").append(toIndentedString(maxRotation)).append("\n");
    sb.append("    useOnlyAnsi378: ").append(toIndentedString(useOnlyAnsi378)).append("\n");
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

