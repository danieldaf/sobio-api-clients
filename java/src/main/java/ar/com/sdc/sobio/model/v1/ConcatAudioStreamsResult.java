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
 * ConcatAudioStreamsResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-01T15:33:45.277-03:00")
public class ConcatAudioStreamsResult {
  @JsonProperty("audio")
  private byte[] audio = null;

  @JsonProperty("exception")
  private Boolean exception = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ERROR("ERROR"),
    
    OK("OK");

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

  public ConcatAudioStreamsResult audio(byte[] audio) {
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @ApiModelProperty(value = "")
  public byte[] getAudio() {
    return audio;
  }

  public void setAudio(byte[] audio) {
    this.audio = audio;
  }

  public ConcatAudioStreamsResult exception(Boolean exception) {
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

  public ConcatAudioStreamsResult status(StatusEnum status) {
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

  public ConcatAudioStreamsResult txId(String txId) {
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
    ConcatAudioStreamsResult concatAudioStreamsResult = (ConcatAudioStreamsResult) o;
    return Objects.equals(this.audio, concatAudioStreamsResult.audio) &&
        Objects.equals(this.exception, concatAudioStreamsResult.exception) &&
        Objects.equals(this.status, concatAudioStreamsResult.status) &&
        Objects.equals(this.txId, concatAudioStreamsResult.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, exception, status, txId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcatAudioStreamsResult {\n");
    
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
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

