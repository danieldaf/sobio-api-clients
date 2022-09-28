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
 * UIExtractFaceFromImageInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T07:51:40.431-03:00")
public class UIExtractFaceFromImageInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("params")
  private FaceExtractionParams params = null;

  @JsonProperty("uiTemplate")
  private String uiTemplate = null;

  public UIExtractFaceFromImageInput auditToken(String auditToken) {
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

  public UIExtractFaceFromImageInput params(FaceExtractionParams params) {
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

  public UIExtractFaceFromImageInput uiTemplate(String uiTemplate) {
    this.uiTemplate = uiTemplate;
    return this;
  }

   /**
   * Get uiTemplate
   * @return uiTemplate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUiTemplate() {
    return uiTemplate;
  }

  public void setUiTemplate(String uiTemplate) {
    this.uiTemplate = uiTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UIExtractFaceFromImageInput uiExtractFaceFromImageInput = (UIExtractFaceFromImageInput) o;
    return Objects.equals(this.auditToken, uiExtractFaceFromImageInput.auditToken) &&
        Objects.equals(this.params, uiExtractFaceFromImageInput.params) &&
        Objects.equals(this.uiTemplate, uiExtractFaceFromImageInput.uiTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, params, uiTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UIExtractFaceFromImageInput {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    uiTemplate: ").append(toIndentedString(uiTemplate)).append("\n");
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

