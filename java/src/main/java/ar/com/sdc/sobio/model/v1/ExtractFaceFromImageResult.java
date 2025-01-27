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
import ar.com.sdc.sobio.model.v1.ExtractedFace;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ExtractFaceFromImageResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T10:34:31.222-03:00")
public class ExtractFaceFromImageResult {
  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("extractedFaces")
  private List<ExtractedFace> extractedFaces = null;

  @JsonProperty("txId")
  private String txId = null;

  public ExtractFaceFromImageResult exception(Boolean exception) {
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

  public ExtractFaceFromImageResult extractedFaces(List<ExtractedFace> extractedFaces) {
    this.extractedFaces = extractedFaces;
    return this;
  }

  public ExtractFaceFromImageResult addExtractedFacesItem(ExtractedFace extractedFacesItem) {
    if (this.extractedFaces == null) {
      this.extractedFaces = new ArrayList<ExtractedFace>();
    }
    this.extractedFaces.add(extractedFacesItem);
    return this;
  }

   /**
   * Get extractedFaces
   * @return extractedFaces
  **/
  @ApiModelProperty(value = "")
  public List<ExtractedFace> getExtractedFaces() {
    return extractedFaces;
  }

  public void setExtractedFaces(List<ExtractedFace> extractedFaces) {
    this.extractedFaces = extractedFaces;
  }

  public ExtractFaceFromImageResult txId(String txId) {
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
    ExtractFaceFromImageResult extractFaceFromImageResult = (ExtractFaceFromImageResult) o;
    return Objects.equals(this.exception, extractFaceFromImageResult.exception) &&
        Objects.equals(this.extractedFaces, extractFaceFromImageResult.extractedFaces) &&
        Objects.equals(this.txId, extractFaceFromImageResult.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, extractedFaces, txId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractFaceFromImageResult {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    extractedFaces: ").append(toIndentedString(extractedFaces)).append("\n");
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

