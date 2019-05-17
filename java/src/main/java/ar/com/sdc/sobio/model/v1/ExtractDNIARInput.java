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
import ar.com.sdc.sobio.model.v1.ExtractDNIARParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExtractDNIARInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:38:33.176-03:00")
public class ExtractDNIARInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("backImage")
  private byte[] backImage = null;

  @JsonProperty("frontImage")
  private byte[] frontImage = null;

  @JsonProperty("params")
  private ExtractDNIARParameters params = null;

  public ExtractDNIARInput auditToken(String auditToken) {
    this.auditToken = auditToken;
    return this;
  }

   /**
   * Get auditToken
   * @return auditToken
  **/
  @ApiModelProperty(value = "")
  public String getAuditToken() {
    return auditToken;
  }

  public void setAuditToken(String auditToken) {
    this.auditToken = auditToken;
  }

  public ExtractDNIARInput backImage(byte[] backImage) {
    this.backImage = backImage;
    return this;
  }

   /**
   * Get backImage
   * @return backImage
  **/
  @ApiModelProperty(value = "")
  public byte[] getBackImage() {
    return backImage;
  }

  public void setBackImage(byte[] backImage) {
    this.backImage = backImage;
  }

  public ExtractDNIARInput frontImage(byte[] frontImage) {
    this.frontImage = frontImage;
    return this;
  }

   /**
   * Get frontImage
   * @return frontImage
  **/
  @ApiModelProperty(value = "")
  public byte[] getFrontImage() {
    return frontImage;
  }

  public void setFrontImage(byte[] frontImage) {
    this.frontImage = frontImage;
  }

  public ExtractDNIARInput params(ExtractDNIARParameters params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public ExtractDNIARParameters getParams() {
    return params;
  }

  public void setParams(ExtractDNIARParameters params) {
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
    ExtractDNIARInput extractDNIARInput = (ExtractDNIARInput) o;
    return Objects.equals(this.auditToken, extractDNIARInput.auditToken) &&
        Objects.equals(this.backImage, extractDNIARInput.backImage) &&
        Objects.equals(this.frontImage, extractDNIARInput.frontImage) &&
        Objects.equals(this.params, extractDNIARInput.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, backImage, frontImage, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractDNIARInput {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    backImage: ").append(toIndentedString(backImage)).append("\n");
    sb.append("    frontImage: ").append(toIndentedString(frontImage)).append("\n");
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

