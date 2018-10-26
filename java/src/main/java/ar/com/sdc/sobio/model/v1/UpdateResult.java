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
 * UpdateResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-26T12:55:02.459-03:00")
public class UpdateResult {
  @JsonProperty("auditId")
  private Long auditId = null;

  @JsonProperty("duplicatedSubjectId")
  private String duplicatedSubjectId = null;

  @JsonProperty("exception")
  private Boolean exception = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    UPDATE_OK("UPDATE_OK"),
    
    DUPLICATED_FINGERPRINTS("DUPLICATED_FINGERPRINTS"),
    
    DUPLICATED_SUBJECT("DUPLICATED_SUBJECT"),
    
    INEXISTENT("INEXISTENT"),
    
    WITHOUT_TEMPLATE("WITHOUT_TEMPLATE"),
    
    MATCHING_NODE_UNAVAILABLE("MATCHING_NODE_UNAVAILABLE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public UpdateResult auditId(Long auditId) {
    this.auditId = auditId;
    return this;
  }

   /**
   * Get auditId
   * @return auditId
  **/
  @ApiModelProperty(value = "")
  public Long getAuditId() {
    return auditId;
  }

  public void setAuditId(Long auditId) {
    this.auditId = auditId;
  }

  public UpdateResult duplicatedSubjectId(String duplicatedSubjectId) {
    this.duplicatedSubjectId = duplicatedSubjectId;
    return this;
  }

   /**
   * Get duplicatedSubjectId
   * @return duplicatedSubjectId
  **/
  @ApiModelProperty(value = "")
  public String getDuplicatedSubjectId() {
    return duplicatedSubjectId;
  }

  public void setDuplicatedSubjectId(String duplicatedSubjectId) {
    this.duplicatedSubjectId = duplicatedSubjectId;
  }

  public UpdateResult exception(Boolean exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  @ApiModelProperty(value = "")
  public Boolean isException() {
    return exception;
  }

  public void setException(Boolean exception) {
    this.exception = exception;
  }

  public UpdateResult status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateResult updateResult = (UpdateResult) o;
    return Objects.equals(this.auditId, updateResult.auditId) &&
        Objects.equals(this.duplicatedSubjectId, updateResult.duplicatedSubjectId) &&
        Objects.equals(this.exception, updateResult.exception) &&
        Objects.equals(this.status, updateResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditId, duplicatedSubjectId, exception, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateResult {\n");
    
    sb.append("    auditId: ").append(toIndentedString(auditId)).append("\n");
    sb.append("    duplicatedSubjectId: ").append(toIndentedString(duplicatedSubjectId)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

