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
import java.util.ArrayList;
import java.util.List;

/**
 * ConcatAudioStreamsInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T09:56:20.444-03:00")
public class ConcatAudioStreamsInput {
  @JsonProperty("audios")
  private List<String> audios = new ArrayList<String>();

  @JsonProperty("auditToken")
  private String auditToken = null;

  public ConcatAudioStreamsInput audios(List<String> audios) {
    this.audios = audios;
    return this;
  }

  public ConcatAudioStreamsInput addAudiosItem(String audiosItem) {
    this.audios.add(audiosItem);
    return this;
  }

   /**
   * Get audios
   * @return audios
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getAudios() {
    return audios;
  }

  public void setAudios(List<String> audios) {
    this.audios = audios;
  }

  public ConcatAudioStreamsInput auditToken(String auditToken) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConcatAudioStreamsInput concatAudioStreamsInput = (ConcatAudioStreamsInput) o;
    return Objects.equals(this.audios, concatAudioStreamsInput.audios) &&
        Objects.equals(this.auditToken, concatAudioStreamsInput.auditToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audios, auditToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcatAudioStreamsInput {\n");
    
    sb.append("    audios: ").append(toIndentedString(audios)).append("\n");
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
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

