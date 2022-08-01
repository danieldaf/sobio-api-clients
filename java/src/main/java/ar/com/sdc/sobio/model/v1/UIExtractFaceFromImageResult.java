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
import ar.com.sdc.sobio.model.v1.Face;
import ar.com.sdc.sobio.model.v1.FaceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UIExtractFaceFromImageResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-01T15:33:45.277-03:00")
public class UIExtractFaceFromImageResult {
  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("face")
  private Face face = null;

  @JsonProperty("faceImage")
  private byte[] faceImage = null;

  @JsonProperty("properties")
  private FaceProperties properties = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    BAD_ILLUMINATION("BAD_ILLUMINATION"),
    
    BAD_TEMPLATE("BAD_TEMPLATE"),
    
    FACE_NOT_DETECTED("FACE_NOT_DETECTED"),
    
    OK("OK"),
    
    TEMPLATE_MULTIPLE_FACES("TEMPLATE_MULTIPLE_FACES");

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

  public UIExtractFaceFromImageResult exception(Boolean exception) {
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

  public UIExtractFaceFromImageResult face(Face face) {
    this.face = face;
    return this;
  }

   /**
   * Get face
   * @return face
  **/
  @ApiModelProperty(value = "")
  public Face getFace() {
    return face;
  }

  public void setFace(Face face) {
    this.face = face;
  }

  public UIExtractFaceFromImageResult faceImage(byte[] faceImage) {
    this.faceImage = faceImage;
    return this;
  }

   /**
   * Get faceImage
   * @return faceImage
  **/
  @ApiModelProperty(value = "")
  public byte[] getFaceImage() {
    return faceImage;
  }

  public void setFaceImage(byte[] faceImage) {
    this.faceImage = faceImage;
  }

  public UIExtractFaceFromImageResult properties(FaceProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public FaceProperties getProperties() {
    return properties;
  }

  public void setProperties(FaceProperties properties) {
    this.properties = properties;
  }

  public UIExtractFaceFromImageResult status(StatusEnum status) {
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

  public UIExtractFaceFromImageResult txId(String txId) {
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
    UIExtractFaceFromImageResult uiExtractFaceFromImageResult = (UIExtractFaceFromImageResult) o;
    return Objects.equals(this.exception, uiExtractFaceFromImageResult.exception) &&
        Objects.equals(this.face, uiExtractFaceFromImageResult.face) &&
        Objects.equals(this.faceImage, uiExtractFaceFromImageResult.faceImage) &&
        Objects.equals(this.properties, uiExtractFaceFromImageResult.properties) &&
        Objects.equals(this.status, uiExtractFaceFromImageResult.status) &&
        Objects.equals(this.txId, uiExtractFaceFromImageResult.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, face, faceImage, properties, status, txId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UIExtractFaceFromImageResult {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
    sb.append("    faceImage: ").append(toIndentedString(faceImage)).append("\n");
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
