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
 * IdentifyResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T07:51:40.431-03:00")
public class IdentifyResult {
  @JsonProperty("confidence")
  private Double confidence = null;

  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("faP")
  private Double faP = null;

  @JsonProperty("score")
  private Integer score = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    IDENTIFY_OK("IDENTIFY_OK"),
    
    NOT_IDENTIFIED("NOT_IDENTIFIED"),
    
    MATCHING_NODE_UNAVAILABLE("MATCHING_NODE_UNAVAILABLE"),
    
    WITHOUT_TEMPLATE("WITHOUT_TEMPLATE"),
    
    IDENTIFY_UNSUPPORTED("IDENTIFY_UNSUPPORTED");

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

  @JsonProperty("subjectId")
  private String subjectId = null;

  @JsonProperty("txId")
  private String txId = null;

  public IdentifyResult confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(value = "")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public IdentifyResult exception(Boolean exception) {
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

  public IdentifyResult faP(Double faP) {
    this.faP = faP;
    return this;
  }

   /**
   * Get faP
   * @return faP
  **/
  @ApiModelProperty(value = "")
  public Double getFaP() {
    return faP;
  }

  public void setFaP(Double faP) {
    this.faP = faP;
  }

  public IdentifyResult score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public IdentifyResult status(StatusEnum status) {
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

  public IdentifyResult subjectId(String subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @ApiModelProperty(value = "")
  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  public IdentifyResult txId(String txId) {
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
    IdentifyResult identifyResult = (IdentifyResult) o;
    return Objects.equals(this.confidence, identifyResult.confidence) &&
        Objects.equals(this.exception, identifyResult.exception) &&
        Objects.equals(this.faP, identifyResult.faP) &&
        Objects.equals(this.score, identifyResult.score) &&
        Objects.equals(this.status, identifyResult.status) &&
        Objects.equals(this.subjectId, identifyResult.subjectId) &&
        Objects.equals(this.txId, identifyResult.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, exception, faP, score, status, subjectId, txId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifyResult {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    faP: ").append(toIndentedString(faP)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
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

