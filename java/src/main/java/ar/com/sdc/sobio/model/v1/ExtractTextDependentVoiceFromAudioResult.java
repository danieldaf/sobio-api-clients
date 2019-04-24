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
import ar.com.sdc.sobio.model.v1.TextDependentVoice;
import ar.com.sdc.sobio.model.v1.VoiceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExtractTextDependentVoiceFromAudioResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-24T14:47:31.932-03:00")
public class ExtractTextDependentVoiceFromAudioResult {
  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("properties")
  private VoiceProperties properties = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OK("OK"),
    
    LOW_QUALITY("LOW_QUALITY"),
    
    VOICE_NOT_DETECTED("VOICE_NOT_DETECTED"),
    
    NOISY("NOISY"),
    
    LOW_LEVEL("LOW_LEVEL"),
    
    EXCEPTION("EXCEPTION"),
    
    TOO_SHORT("TOO_SHORT");

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

  @JsonProperty("voice")
  private TextDependentVoice voice = null;

  public ExtractTextDependentVoiceFromAudioResult exception(Boolean exception) {
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

  public ExtractTextDependentVoiceFromAudioResult properties(VoiceProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public VoiceProperties getProperties() {
    return properties;
  }

  public void setProperties(VoiceProperties properties) {
    this.properties = properties;
  }

  public ExtractTextDependentVoiceFromAudioResult status(StatusEnum status) {
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

  public ExtractTextDependentVoiceFromAudioResult txId(String txId) {
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

  public ExtractTextDependentVoiceFromAudioResult voice(TextDependentVoice voice) {
    this.voice = voice;
    return this;
  }

   /**
   * Get voice
   * @return voice
  **/
  @ApiModelProperty(value = "")
  public TextDependentVoice getVoice() {
    return voice;
  }

  public void setVoice(TextDependentVoice voice) {
    this.voice = voice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractTextDependentVoiceFromAudioResult extractTextDependentVoiceFromAudioResult = (ExtractTextDependentVoiceFromAudioResult) o;
    return Objects.equals(this.exception, extractTextDependentVoiceFromAudioResult.exception) &&
        Objects.equals(this.properties, extractTextDependentVoiceFromAudioResult.properties) &&
        Objects.equals(this.status, extractTextDependentVoiceFromAudioResult.status) &&
        Objects.equals(this.txId, extractTextDependentVoiceFromAudioResult.txId) &&
        Objects.equals(this.voice, extractTextDependentVoiceFromAudioResult.voice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, properties, status, txId, voice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractTextDependentVoiceFromAudioResult {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
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

