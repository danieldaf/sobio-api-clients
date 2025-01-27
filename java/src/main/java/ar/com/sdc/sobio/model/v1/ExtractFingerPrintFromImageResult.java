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
import ar.com.sdc.sobio.model.v1.FingerPrint;
import ar.com.sdc.sobio.model.v1.FingerPrintProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExtractFingerPrintFromImageResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T10:34:31.222-03:00")
public class ExtractFingerPrintFromImageResult {
  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("fingerPrint")
  private FingerPrint fingerPrint = null;

  @JsonProperty("properties")
  private FingerPrintProperties properties = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OK("OK"),
    
    LOW_QUALITY("LOW_QUALITY"),
    
    INVALID_IMAGE_RESOLUTION("INVALID_IMAGE_RESOLUTION");

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

  @JsonProperty("txId")
  private String txId = null;

  public ExtractFingerPrintFromImageResult exception(Boolean exception) {
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

  public ExtractFingerPrintFromImageResult fingerPrint(FingerPrint fingerPrint) {
    this.fingerPrint = fingerPrint;
    return this;
  }

   /**
   * Get fingerPrint
   * @return fingerPrint
  **/
  @ApiModelProperty(value = "")
  public FingerPrint getFingerPrint() {
    return fingerPrint;
  }

  public void setFingerPrint(FingerPrint fingerPrint) {
    this.fingerPrint = fingerPrint;
  }

  public ExtractFingerPrintFromImageResult properties(FingerPrintProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public FingerPrintProperties getProperties() {
    return properties;
  }

  public void setProperties(FingerPrintProperties properties) {
    this.properties = properties;
  }

  public ExtractFingerPrintFromImageResult status(StatusEnum status) {
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

  public ExtractFingerPrintFromImageResult txId(String txId) {
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
    ExtractFingerPrintFromImageResult extractFingerPrintFromImageResult = (ExtractFingerPrintFromImageResult) o;
    return Objects.equals(this.exception, extractFingerPrintFromImageResult.exception) &&
        Objects.equals(this.fingerPrint, extractFingerPrintFromImageResult.fingerPrint) &&
        Objects.equals(this.properties, extractFingerPrintFromImageResult.properties) &&
        Objects.equals(this.status, extractFingerPrintFromImageResult.status) &&
        Objects.equals(this.txId, extractFingerPrintFromImageResult.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, fingerPrint, properties, status, txId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractFingerPrintFromImageResult {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    fingerPrint: ").append(toIndentedString(fingerPrint)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

