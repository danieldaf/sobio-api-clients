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
import ar.com.sdc.sobio.model.v1.FaceExtractionParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExtractFaceFromImageInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T10:34:31.222-03:00")
public class ExtractFaceFromImageInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("params")
  private FaceExtractionParams params = null;

  public ExtractFaceFromImageInput auditToken(String auditToken) {
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

  public ExtractFaceFromImageInput image(byte[] image) {
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

  public ExtractFaceFromImageInput params(FaceExtractionParams params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public FaceExtractionParams getParams() {
    return params;
  }

  public void setParams(FaceExtractionParams params) {
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
    ExtractFaceFromImageInput extractFaceFromImageInput = (ExtractFaceFromImageInput) o;
    return Objects.equals(this.auditToken, extractFaceFromImageInput.auditToken) &&
        Objects.equals(this.image, extractFaceFromImageInput.image) &&
        Objects.equals(this.params, extractFaceFromImageInput.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, image, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractFaceFromImageInput {\n");
    
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

