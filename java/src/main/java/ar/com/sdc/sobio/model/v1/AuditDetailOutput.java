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
import ar.com.sdc.sobio.model.v1.AuditDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * AuditDetailOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T09:56:20.444-03:00")
public class AuditDetailOutput {
  @JsonProperty("auditDetail")
  private List<AuditDetail> auditDetail = null;

  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("txId")
  private String txId = null;

  public AuditDetailOutput auditDetail(List<AuditDetail> auditDetail) {
    this.auditDetail = auditDetail;
    return this;
  }

  public AuditDetailOutput addAuditDetailItem(AuditDetail auditDetailItem) {
    if (this.auditDetail == null) {
      this.auditDetail = new ArrayList<AuditDetail>();
    }
    this.auditDetail.add(auditDetailItem);
    return this;
  }

   /**
   * Get auditDetail
   * @return auditDetail
  **/
  @ApiModelProperty(value = "")
  public List<AuditDetail> getAuditDetail() {
    return auditDetail;
  }

  public void setAuditDetail(List<AuditDetail> auditDetail) {
    this.auditDetail = auditDetail;
  }

  public AuditDetailOutput exception(Boolean exception) {
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

  public AuditDetailOutput txId(String txId) {
    this.txId = txId;
    return this;
  }

   /**
   * Get txId
   * @return txId
  **/
  @ApiModelProperty(value = "")
  public String getTxId() {
    return txId;
  }

  public void setTxId(String txId) {
    this.txId = txId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditDetailOutput auditDetailOutput = (AuditDetailOutput) o;
    return Objects.equals(this.auditDetail, auditDetailOutput.auditDetail) &&
        Objects.equals(this.exception, auditDetailOutput.exception) &&
        Objects.equals(this.txId, auditDetailOutput.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditDetail, exception, txId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditDetailOutput {\n");
    
    sb.append("    auditDetail: ").append(toIndentedString(auditDetail)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
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

