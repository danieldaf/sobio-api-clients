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
import org.joda.time.DateTime;

/**
 * SubjectInformationResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T09:56:20.444-03:00")
public class SubjectInformationResult {
  @JsonProperty("compositeFingerCount")
  private Integer compositeFingerCount = null;

  @JsonProperty("enrollmentDate")
  private DateTime enrollmentDate = null;

  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("faceCount")
  private Integer faceCount = null;

  @JsonProperty("fingerCount")
  private Integer fingerCount = null;

  @JsonProperty("hasTextIndependentVoice")
  private Boolean hasTextIndependentVoice = null;

  @JsonProperty("i1")
  private Integer i1 = null;

  @JsonProperty("i2")
  private Integer i2 = null;

  @JsonProperty("i3")
  private Integer i3 = null;

  @JsonProperty("i4")
  private Integer i4 = null;

  @JsonProperty("i5")
  private Integer i5 = null;

  @JsonProperty("lastIdentifyDate")
  private DateTime lastIdentifyDate = null;

  @JsonProperty("lastUpdateDate")
  private DateTime lastUpdateDate = null;

  @JsonProperty("lastVerifyDate")
  private DateTime lastVerifyDate = null;

  @JsonProperty("s1")
  private String s1 = null;

  @JsonProperty("s2")
  private String s2 = null;

  @JsonProperty("s3")
  private String s3 = null;

  @JsonProperty("s4")
  private String s4 = null;

  @JsonProperty("s5")
  private String s5 = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OK("OK"),
    
    INEXISTENT("INEXISTENT");

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

  @JsonProperty("textDependentVoiceCount")
  private Integer textDependentVoiceCount = null;

  @JsonProperty("txId")
  private String txId = null;

  public SubjectInformationResult compositeFingerCount(Integer compositeFingerCount) {
    this.compositeFingerCount = compositeFingerCount;
    return this;
  }

   /**
   * Get compositeFingerCount
   * @return compositeFingerCount
  **/
  @ApiModelProperty(value = "")
  public Integer getCompositeFingerCount() {
    return compositeFingerCount;
  }

  public void setCompositeFingerCount(Integer compositeFingerCount) {
    this.compositeFingerCount = compositeFingerCount;
  }

  public SubjectInformationResult enrollmentDate(DateTime enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
    return this;
  }

   /**
   * Get enrollmentDate
   * @return enrollmentDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getEnrollmentDate() {
    return enrollmentDate;
  }

  public void setEnrollmentDate(DateTime enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }

  public SubjectInformationResult exception(Boolean exception) {
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

  public SubjectInformationResult faceCount(Integer faceCount) {
    this.faceCount = faceCount;
    return this;
  }

   /**
   * Get faceCount
   * @return faceCount
  **/
  @ApiModelProperty(value = "")
  public Integer getFaceCount() {
    return faceCount;
  }

  public void setFaceCount(Integer faceCount) {
    this.faceCount = faceCount;
  }

  public SubjectInformationResult fingerCount(Integer fingerCount) {
    this.fingerCount = fingerCount;
    return this;
  }

   /**
   * Get fingerCount
   * @return fingerCount
  **/
  @ApiModelProperty(value = "")
  public Integer getFingerCount() {
    return fingerCount;
  }

  public void setFingerCount(Integer fingerCount) {
    this.fingerCount = fingerCount;
  }

  public SubjectInformationResult hasTextIndependentVoice(Boolean hasTextIndependentVoice) {
    this.hasTextIndependentVoice = hasTextIndependentVoice;
    return this;
  }

   /**
   * Get hasTextIndependentVoice
   * @return hasTextIndependentVoice
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasTextIndependentVoice() {
    return hasTextIndependentVoice;
  }

  public void setHasTextIndependentVoice(Boolean hasTextIndependentVoice) {
    this.hasTextIndependentVoice = hasTextIndependentVoice;
  }

  public SubjectInformationResult i1(Integer i1) {
    this.i1 = i1;
    return this;
  }

   /**
   * Get i1
   * @return i1
  **/
  @ApiModelProperty(value = "")
  public Integer getI1() {
    return i1;
  }

  public void setI1(Integer i1) {
    this.i1 = i1;
  }

  public SubjectInformationResult i2(Integer i2) {
    this.i2 = i2;
    return this;
  }

   /**
   * Get i2
   * @return i2
  **/
  @ApiModelProperty(value = "")
  public Integer getI2() {
    return i2;
  }

  public void setI2(Integer i2) {
    this.i2 = i2;
  }

  public SubjectInformationResult i3(Integer i3) {
    this.i3 = i3;
    return this;
  }

   /**
   * Get i3
   * @return i3
  **/
  @ApiModelProperty(value = "")
  public Integer getI3() {
    return i3;
  }

  public void setI3(Integer i3) {
    this.i3 = i3;
  }

  public SubjectInformationResult i4(Integer i4) {
    this.i4 = i4;
    return this;
  }

   /**
   * Get i4
   * @return i4
  **/
  @ApiModelProperty(value = "")
  public Integer getI4() {
    return i4;
  }

  public void setI4(Integer i4) {
    this.i4 = i4;
  }

  public SubjectInformationResult i5(Integer i5) {
    this.i5 = i5;
    return this;
  }

   /**
   * Get i5
   * @return i5
  **/
  @ApiModelProperty(value = "")
  public Integer getI5() {
    return i5;
  }

  public void setI5(Integer i5) {
    this.i5 = i5;
  }

  public SubjectInformationResult lastIdentifyDate(DateTime lastIdentifyDate) {
    this.lastIdentifyDate = lastIdentifyDate;
    return this;
  }

   /**
   * Get lastIdentifyDate
   * @return lastIdentifyDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastIdentifyDate() {
    return lastIdentifyDate;
  }

  public void setLastIdentifyDate(DateTime lastIdentifyDate) {
    this.lastIdentifyDate = lastIdentifyDate;
  }

  public SubjectInformationResult lastUpdateDate(DateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

   /**
   * Get lastUpdateDate
   * @return lastUpdateDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(DateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  public SubjectInformationResult lastVerifyDate(DateTime lastVerifyDate) {
    this.lastVerifyDate = lastVerifyDate;
    return this;
  }

   /**
   * Get lastVerifyDate
   * @return lastVerifyDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastVerifyDate() {
    return lastVerifyDate;
  }

  public void setLastVerifyDate(DateTime lastVerifyDate) {
    this.lastVerifyDate = lastVerifyDate;
  }

  public SubjectInformationResult s1(String s1) {
    this.s1 = s1;
    return this;
  }

   /**
   * Get s1
   * @return s1
  **/
  @ApiModelProperty(value = "")
  public String getS1() {
    return s1;
  }

  public void setS1(String s1) {
    this.s1 = s1;
  }

  public SubjectInformationResult s2(String s2) {
    this.s2 = s2;
    return this;
  }

   /**
   * Get s2
   * @return s2
  **/
  @ApiModelProperty(value = "")
  public String getS2() {
    return s2;
  }

  public void setS2(String s2) {
    this.s2 = s2;
  }

  public SubjectInformationResult s3(String s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty(value = "")
  public String getS3() {
    return s3;
  }

  public void setS3(String s3) {
    this.s3 = s3;
  }

  public SubjectInformationResult s4(String s4) {
    this.s4 = s4;
    return this;
  }

   /**
   * Get s4
   * @return s4
  **/
  @ApiModelProperty(value = "")
  public String getS4() {
    return s4;
  }

  public void setS4(String s4) {
    this.s4 = s4;
  }

  public SubjectInformationResult s5(String s5) {
    this.s5 = s5;
    return this;
  }

   /**
   * Get s5
   * @return s5
  **/
  @ApiModelProperty(value = "")
  public String getS5() {
    return s5;
  }

  public void setS5(String s5) {
    this.s5 = s5;
  }

  public SubjectInformationResult status(StatusEnum status) {
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

  public SubjectInformationResult textDependentVoiceCount(Integer textDependentVoiceCount) {
    this.textDependentVoiceCount = textDependentVoiceCount;
    return this;
  }

   /**
   * Get textDependentVoiceCount
   * @return textDependentVoiceCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTextDependentVoiceCount() {
    return textDependentVoiceCount;
  }

  public void setTextDependentVoiceCount(Integer textDependentVoiceCount) {
    this.textDependentVoiceCount = textDependentVoiceCount;
  }

  public SubjectInformationResult txId(String txId) {
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
    SubjectInformationResult subjectInformationResult = (SubjectInformationResult) o;
    return Objects.equals(this.compositeFingerCount, subjectInformationResult.compositeFingerCount) &&
        Objects.equals(this.enrollmentDate, subjectInformationResult.enrollmentDate) &&
        Objects.equals(this.exception, subjectInformationResult.exception) &&
        Objects.equals(this.faceCount, subjectInformationResult.faceCount) &&
        Objects.equals(this.fingerCount, subjectInformationResult.fingerCount) &&
        Objects.equals(this.hasTextIndependentVoice, subjectInformationResult.hasTextIndependentVoice) &&
        Objects.equals(this.i1, subjectInformationResult.i1) &&
        Objects.equals(this.i2, subjectInformationResult.i2) &&
        Objects.equals(this.i3, subjectInformationResult.i3) &&
        Objects.equals(this.i4, subjectInformationResult.i4) &&
        Objects.equals(this.i5, subjectInformationResult.i5) &&
        Objects.equals(this.lastIdentifyDate, subjectInformationResult.lastIdentifyDate) &&
        Objects.equals(this.lastUpdateDate, subjectInformationResult.lastUpdateDate) &&
        Objects.equals(this.lastVerifyDate, subjectInformationResult.lastVerifyDate) &&
        Objects.equals(this.s1, subjectInformationResult.s1) &&
        Objects.equals(this.s2, subjectInformationResult.s2) &&
        Objects.equals(this.s3, subjectInformationResult.s3) &&
        Objects.equals(this.s4, subjectInformationResult.s4) &&
        Objects.equals(this.s5, subjectInformationResult.s5) &&
        Objects.equals(this.status, subjectInformationResult.status) &&
        Objects.equals(this.textDependentVoiceCount, subjectInformationResult.textDependentVoiceCount) &&
        Objects.equals(this.txId, subjectInformationResult.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositeFingerCount, enrollmentDate, exception, faceCount, fingerCount, hasTextIndependentVoice, i1, i2, i3, i4, i5, lastIdentifyDate, lastUpdateDate, lastVerifyDate, s1, s2, s3, s4, s5, status, textDependentVoiceCount, txId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectInformationResult {\n");
    
    sb.append("    compositeFingerCount: ").append(toIndentedString(compositeFingerCount)).append("\n");
    sb.append("    enrollmentDate: ").append(toIndentedString(enrollmentDate)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    faceCount: ").append(toIndentedString(faceCount)).append("\n");
    sb.append("    fingerCount: ").append(toIndentedString(fingerCount)).append("\n");
    sb.append("    hasTextIndependentVoice: ").append(toIndentedString(hasTextIndependentVoice)).append("\n");
    sb.append("    i1: ").append(toIndentedString(i1)).append("\n");
    sb.append("    i2: ").append(toIndentedString(i2)).append("\n");
    sb.append("    i3: ").append(toIndentedString(i3)).append("\n");
    sb.append("    i4: ").append(toIndentedString(i4)).append("\n");
    sb.append("    i5: ").append(toIndentedString(i5)).append("\n");
    sb.append("    lastIdentifyDate: ").append(toIndentedString(lastIdentifyDate)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    lastVerifyDate: ").append(toIndentedString(lastVerifyDate)).append("\n");
    sb.append("    s1: ").append(toIndentedString(s1)).append("\n");
    sb.append("    s2: ").append(toIndentedString(s2)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    s4: ").append(toIndentedString(s4)).append("\n");
    sb.append("    s5: ").append(toIndentedString(s5)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    textDependentVoiceCount: ").append(toIndentedString(textDependentVoiceCount)).append("\n");
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

