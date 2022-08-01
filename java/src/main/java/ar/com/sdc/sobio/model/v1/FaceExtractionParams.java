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
import ar.com.sdc.sobio.model.v1.FacePoseSensibilityConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FaceExtractionParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-01T15:17:54.527-03:00")
public class FaceExtractionParams {
  @JsonProperty("blinkSensibility")
  private Double blinkSensibility = null;

  @JsonProperty("detectAge")
  private Boolean detectAge = null;

  @JsonProperty("detectEmotion")
  private Boolean detectEmotion = null;

  @JsonProperty("detectExpression")
  private Boolean detectExpression = null;

  @JsonProperty("detectGender")
  private Boolean detectGender = null;

  @JsonProperty("detectOnlyMajorFace")
  private Boolean detectOnlyMajorFace = null;

  @JsonProperty("detectTraitsAndActions")
  private Boolean detectTraitsAndActions = null;

  @JsonProperty("facePoseSensibility")
  private FacePoseSensibilityConfig facePoseSensibility = null;

  @JsonProperty("maxCLAHE")
  private Integer maxCLAHE = null;

  @JsonProperty("maxRoll")
  private Integer maxRoll = null;

  @JsonProperty("maxYaw")
  private Integer maxYaw = null;

  @JsonProperty("minCLAHE")
  private Integer minCLAHE = null;

  @JsonProperty("minConfidence")
  private byte[] minConfidence = null;

  @JsonProperty("minIOD")
  private Integer minIOD = null;

  @JsonProperty("minQuality")
  private byte[] minQuality = null;

  @JsonProperty("scaleH")
  private Integer scaleH = null;

  @JsonProperty("thumbnailWidth")
  private Integer thumbnailWidth = null;

  @JsonProperty("useCLAHE")
  private Boolean useCLAHE = null;

  @JsonProperty("useCache")
  private Boolean useCache = null;

  @JsonProperty("videoFramesSeq")
  private Integer videoFramesSeq = null;

  public FaceExtractionParams blinkSensibility(Double blinkSensibility) {
    this.blinkSensibility = blinkSensibility;
    return this;
  }

   /**
   * Get blinkSensibility
   * @return blinkSensibility
  **/
  @ApiModelProperty(value = "")
  public Double getBlinkSensibility() {
    return blinkSensibility;
  }

  public void setBlinkSensibility(Double blinkSensibility) {
    this.blinkSensibility = blinkSensibility;
  }

  public FaceExtractionParams detectAge(Boolean detectAge) {
    this.detectAge = detectAge;
    return this;
  }

   /**
   * Get detectAge
   * @return detectAge
  **/
  @ApiModelProperty(value = "")
  public Boolean isDetectAge() {
    return detectAge;
  }

  public void setDetectAge(Boolean detectAge) {
    this.detectAge = detectAge;
  }

  public FaceExtractionParams detectEmotion(Boolean detectEmotion) {
    this.detectEmotion = detectEmotion;
    return this;
  }

   /**
   * Get detectEmotion
   * @return detectEmotion
  **/
  @ApiModelProperty(value = "")
  public Boolean isDetectEmotion() {
    return detectEmotion;
  }

  public void setDetectEmotion(Boolean detectEmotion) {
    this.detectEmotion = detectEmotion;
  }

  public FaceExtractionParams detectExpression(Boolean detectExpression) {
    this.detectExpression = detectExpression;
    return this;
  }

   /**
   * Get detectExpression
   * @return detectExpression
  **/
  @ApiModelProperty(value = "")
  public Boolean isDetectExpression() {
    return detectExpression;
  }

  public void setDetectExpression(Boolean detectExpression) {
    this.detectExpression = detectExpression;
  }

  public FaceExtractionParams detectGender(Boolean detectGender) {
    this.detectGender = detectGender;
    return this;
  }

   /**
   * Get detectGender
   * @return detectGender
  **/
  @ApiModelProperty(value = "")
  public Boolean isDetectGender() {
    return detectGender;
  }

  public void setDetectGender(Boolean detectGender) {
    this.detectGender = detectGender;
  }

  public FaceExtractionParams detectOnlyMajorFace(Boolean detectOnlyMajorFace) {
    this.detectOnlyMajorFace = detectOnlyMajorFace;
    return this;
  }

   /**
   * Get detectOnlyMajorFace
   * @return detectOnlyMajorFace
  **/
  @ApiModelProperty(value = "")
  public Boolean isDetectOnlyMajorFace() {
    return detectOnlyMajorFace;
  }

  public void setDetectOnlyMajorFace(Boolean detectOnlyMajorFace) {
    this.detectOnlyMajorFace = detectOnlyMajorFace;
  }

  public FaceExtractionParams detectTraitsAndActions(Boolean detectTraitsAndActions) {
    this.detectTraitsAndActions = detectTraitsAndActions;
    return this;
  }

   /**
   * Get detectTraitsAndActions
   * @return detectTraitsAndActions
  **/
  @ApiModelProperty(value = "")
  public Boolean isDetectTraitsAndActions() {
    return detectTraitsAndActions;
  }

  public void setDetectTraitsAndActions(Boolean detectTraitsAndActions) {
    this.detectTraitsAndActions = detectTraitsAndActions;
  }

  public FaceExtractionParams facePoseSensibility(FacePoseSensibilityConfig facePoseSensibility) {
    this.facePoseSensibility = facePoseSensibility;
    return this;
  }

   /**
   * Get facePoseSensibility
   * @return facePoseSensibility
  **/
  @ApiModelProperty(value = "")
  public FacePoseSensibilityConfig getFacePoseSensibility() {
    return facePoseSensibility;
  }

  public void setFacePoseSensibility(FacePoseSensibilityConfig facePoseSensibility) {
    this.facePoseSensibility = facePoseSensibility;
  }

  public FaceExtractionParams maxCLAHE(Integer maxCLAHE) {
    this.maxCLAHE = maxCLAHE;
    return this;
  }

   /**
   * Get maxCLAHE
   * @return maxCLAHE
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxCLAHE() {
    return maxCLAHE;
  }

  public void setMaxCLAHE(Integer maxCLAHE) {
    this.maxCLAHE = maxCLAHE;
  }

  public FaceExtractionParams maxRoll(Integer maxRoll) {
    this.maxRoll = maxRoll;
    return this;
  }

   /**
   * Get maxRoll
   * @return maxRoll
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxRoll() {
    return maxRoll;
  }

  public void setMaxRoll(Integer maxRoll) {
    this.maxRoll = maxRoll;
  }

  public FaceExtractionParams maxYaw(Integer maxYaw) {
    this.maxYaw = maxYaw;
    return this;
  }

   /**
   * Get maxYaw
   * @return maxYaw
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxYaw() {
    return maxYaw;
  }

  public void setMaxYaw(Integer maxYaw) {
    this.maxYaw = maxYaw;
  }

  public FaceExtractionParams minCLAHE(Integer minCLAHE) {
    this.minCLAHE = minCLAHE;
    return this;
  }

   /**
   * Get minCLAHE
   * @return minCLAHE
  **/
  @ApiModelProperty(value = "")
  public Integer getMinCLAHE() {
    return minCLAHE;
  }

  public void setMinCLAHE(Integer minCLAHE) {
    this.minCLAHE = minCLAHE;
  }

  public FaceExtractionParams minConfidence(byte[] minConfidence) {
    this.minConfidence = minConfidence;
    return this;
  }

   /**
   * Get minConfidence
   * @return minConfidence
  **/
  @ApiModelProperty(value = "")
  public byte[] getMinConfidence() {
    return minConfidence;
  }

  public void setMinConfidence(byte[] minConfidence) {
    this.minConfidence = minConfidence;
  }

  public FaceExtractionParams minIOD(Integer minIOD) {
    this.minIOD = minIOD;
    return this;
  }

   /**
   * Get minIOD
   * @return minIOD
  **/
  @ApiModelProperty(value = "")
  public Integer getMinIOD() {
    return minIOD;
  }

  public void setMinIOD(Integer minIOD) {
    this.minIOD = minIOD;
  }

  public FaceExtractionParams minQuality(byte[] minQuality) {
    this.minQuality = minQuality;
    return this;
  }

   /**
   * Get minQuality
   * @return minQuality
  **/
  @ApiModelProperty(value = "")
  public byte[] getMinQuality() {
    return minQuality;
  }

  public void setMinQuality(byte[] minQuality) {
    this.minQuality = minQuality;
  }

  public FaceExtractionParams scaleH(Integer scaleH) {
    this.scaleH = scaleH;
    return this;
  }

   /**
   * Get scaleH
   * @return scaleH
  **/
  @ApiModelProperty(value = "")
  public Integer getScaleH() {
    return scaleH;
  }

  public void setScaleH(Integer scaleH) {
    this.scaleH = scaleH;
  }

  public FaceExtractionParams thumbnailWidth(Integer thumbnailWidth) {
    this.thumbnailWidth = thumbnailWidth;
    return this;
  }

   /**
   * Get thumbnailWidth
   * @return thumbnailWidth
  **/
  @ApiModelProperty(value = "")
  public Integer getThumbnailWidth() {
    return thumbnailWidth;
  }

  public void setThumbnailWidth(Integer thumbnailWidth) {
    this.thumbnailWidth = thumbnailWidth;
  }

  public FaceExtractionParams useCLAHE(Boolean useCLAHE) {
    this.useCLAHE = useCLAHE;
    return this;
  }

   /**
   * Get useCLAHE
   * @return useCLAHE
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseCLAHE() {
    return useCLAHE;
  }

  public void setUseCLAHE(Boolean useCLAHE) {
    this.useCLAHE = useCLAHE;
  }

  public FaceExtractionParams useCache(Boolean useCache) {
    this.useCache = useCache;
    return this;
  }

   /**
   * Get useCache
   * @return useCache
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseCache() {
    return useCache;
  }

  public void setUseCache(Boolean useCache) {
    this.useCache = useCache;
  }

  public FaceExtractionParams videoFramesSeq(Integer videoFramesSeq) {
    this.videoFramesSeq = videoFramesSeq;
    return this;
  }

   /**
   * Get videoFramesSeq
   * @return videoFramesSeq
  **/
  @ApiModelProperty(value = "")
  public Integer getVideoFramesSeq() {
    return videoFramesSeq;
  }

  public void setVideoFramesSeq(Integer videoFramesSeq) {
    this.videoFramesSeq = videoFramesSeq;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceExtractionParams faceExtractionParams = (FaceExtractionParams) o;
    return Objects.equals(this.blinkSensibility, faceExtractionParams.blinkSensibility) &&
        Objects.equals(this.detectAge, faceExtractionParams.detectAge) &&
        Objects.equals(this.detectEmotion, faceExtractionParams.detectEmotion) &&
        Objects.equals(this.detectExpression, faceExtractionParams.detectExpression) &&
        Objects.equals(this.detectGender, faceExtractionParams.detectGender) &&
        Objects.equals(this.detectOnlyMajorFace, faceExtractionParams.detectOnlyMajorFace) &&
        Objects.equals(this.detectTraitsAndActions, faceExtractionParams.detectTraitsAndActions) &&
        Objects.equals(this.facePoseSensibility, faceExtractionParams.facePoseSensibility) &&
        Objects.equals(this.maxCLAHE, faceExtractionParams.maxCLAHE) &&
        Objects.equals(this.maxRoll, faceExtractionParams.maxRoll) &&
        Objects.equals(this.maxYaw, faceExtractionParams.maxYaw) &&
        Objects.equals(this.minCLAHE, faceExtractionParams.minCLAHE) &&
        Objects.equals(this.minConfidence, faceExtractionParams.minConfidence) &&
        Objects.equals(this.minIOD, faceExtractionParams.minIOD) &&
        Objects.equals(this.minQuality, faceExtractionParams.minQuality) &&
        Objects.equals(this.scaleH, faceExtractionParams.scaleH) &&
        Objects.equals(this.thumbnailWidth, faceExtractionParams.thumbnailWidth) &&
        Objects.equals(this.useCLAHE, faceExtractionParams.useCLAHE) &&
        Objects.equals(this.useCache, faceExtractionParams.useCache) &&
        Objects.equals(this.videoFramesSeq, faceExtractionParams.videoFramesSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blinkSensibility, detectAge, detectEmotion, detectExpression, detectGender, detectOnlyMajorFace, detectTraitsAndActions, facePoseSensibility, maxCLAHE, maxRoll, maxYaw, minCLAHE, minConfidence, minIOD, minQuality, scaleH, thumbnailWidth, useCLAHE, useCache, videoFramesSeq);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceExtractionParams {\n");
    
    sb.append("    blinkSensibility: ").append(toIndentedString(blinkSensibility)).append("\n");
    sb.append("    detectAge: ").append(toIndentedString(detectAge)).append("\n");
    sb.append("    detectEmotion: ").append(toIndentedString(detectEmotion)).append("\n");
    sb.append("    detectExpression: ").append(toIndentedString(detectExpression)).append("\n");
    sb.append("    detectGender: ").append(toIndentedString(detectGender)).append("\n");
    sb.append("    detectOnlyMajorFace: ").append(toIndentedString(detectOnlyMajorFace)).append("\n");
    sb.append("    detectTraitsAndActions: ").append(toIndentedString(detectTraitsAndActions)).append("\n");
    sb.append("    facePoseSensibility: ").append(toIndentedString(facePoseSensibility)).append("\n");
    sb.append("    maxCLAHE: ").append(toIndentedString(maxCLAHE)).append("\n");
    sb.append("    maxRoll: ").append(toIndentedString(maxRoll)).append("\n");
    sb.append("    maxYaw: ").append(toIndentedString(maxYaw)).append("\n");
    sb.append("    minCLAHE: ").append(toIndentedString(minCLAHE)).append("\n");
    sb.append("    minConfidence: ").append(toIndentedString(minConfidence)).append("\n");
    sb.append("    minIOD: ").append(toIndentedString(minIOD)).append("\n");
    sb.append("    minQuality: ").append(toIndentedString(minQuality)).append("\n");
    sb.append("    scaleH: ").append(toIndentedString(scaleH)).append("\n");
    sb.append("    thumbnailWidth: ").append(toIndentedString(thumbnailWidth)).append("\n");
    sb.append("    useCLAHE: ").append(toIndentedString(useCLAHE)).append("\n");
    sb.append("    useCache: ").append(toIndentedString(useCache)).append("\n");
    sb.append("    videoFramesSeq: ").append(toIndentedString(videoFramesSeq)).append("\n");
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

