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
 * UIEnrollInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-01T15:17:54.527-03:00")
public class UIEnrollInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("duplicateConfidence")
  private Integer duplicateConfidence = null;

  @JsonProperty("subjectId")
  private String subjectId = null;

  @JsonProperty("template")
  private String template = null;

  public UIEnrollInput auditToken(String auditToken) {
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

  public UIEnrollInput duplicateConfidence(Integer duplicateConfidence) {
    this.duplicateConfidence = duplicateConfidence;
    return this;
  }

   /**
   * Get duplicateConfidence
   * @return duplicateConfidence
  **/
  @ApiModelProperty(value = "")
  public Integer getDuplicateConfidence() {
    return duplicateConfidence;
  }

  public void setDuplicateConfidence(Integer duplicateConfidence) {
    this.duplicateConfidence = duplicateConfidence;
  }

  public UIEnrollInput subjectId(String subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  public UIEnrollInput template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UIEnrollInput uiEnrollInput = (UIEnrollInput) o;
    return Objects.equals(this.auditToken, uiEnrollInput.auditToken) &&
        Objects.equals(this.duplicateConfidence, uiEnrollInput.duplicateConfidence) &&
        Objects.equals(this.subjectId, uiEnrollInput.subjectId) &&
        Objects.equals(this.template, uiEnrollInput.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, duplicateConfidence, subjectId, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UIEnrollInput {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    duplicateConfidence: ").append(toIndentedString(duplicateConfidence)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

