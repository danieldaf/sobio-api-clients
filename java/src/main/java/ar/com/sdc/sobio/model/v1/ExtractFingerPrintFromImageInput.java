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
import ar.com.sdc.sobio.model.v1.FingerPrintExtractionParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExtractFingerPrintFromImageInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T07:44:13.357-03:00")
public class ExtractFingerPrintFromImageInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("params")
  private FingerPrintExtractionParameters params = null;

  public ExtractFingerPrintFromImageInput auditToken(String auditToken) {
    this.auditToken = auditToken;
    return this;
  }

   /**
   * Get auditToken
   * @return auditToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAuditToken() {
    return auditToken;
  }

  public void setAuditToken(String auditToken) {
    this.auditToken = auditToken;
  }

  public ExtractFingerPrintFromImageInput image(byte[] image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(required = true, value = "")
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public ExtractFingerPrintFromImageInput params(FingerPrintExtractionParameters params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(required = true, value = "")
  public FingerPrintExtractionParameters getParams() {
    return params;
  }

  public void setParams(FingerPrintExtractionParameters params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractFingerPrintFromImageInput extractFingerPrintFromImageInput = (ExtractFingerPrintFromImageInput) o;
    return Objects.equals(this.auditToken, extractFingerPrintFromImageInput.auditToken) &&
        Objects.equals(this.image, extractFingerPrintFromImageInput.image) &&
        Objects.equals(this.params, extractFingerPrintFromImageInput.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, image, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractFingerPrintFromImageInput {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

