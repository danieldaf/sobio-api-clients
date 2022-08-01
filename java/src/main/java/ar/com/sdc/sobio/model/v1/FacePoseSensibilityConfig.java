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
 * FacePoseSensibilityConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-01T15:17:54.527-03:00")
public class FacePoseSensibilityConfig {
  @JsonProperty("lookingDownwardsPitchAngle")
  private Double lookingDownwardsPitchAngle = null;

  @JsonProperty("lookingFront")
  private Double lookingFront = null;

  @JsonProperty("lookingLeftYawAngle")
  private Double lookingLeftYawAngle = null;

  @JsonProperty("lookingRightYawAngle")
  private Double lookingRightYawAngle = null;

  @JsonProperty("lookingUpwardsPitchAngle")
  private Double lookingUpwardsPitchAngle = null;

  public FacePoseSensibilityConfig lookingDownwardsPitchAngle(Double lookingDownwardsPitchAngle) {
    this.lookingDownwardsPitchAngle = lookingDownwardsPitchAngle;
    return this;
  }

   /**
   * Get lookingDownwardsPitchAngle
   * @return lookingDownwardsPitchAngle
  **/
  @ApiModelProperty(value = "")
  public Double getLookingDownwardsPitchAngle() {
    return lookingDownwardsPitchAngle;
  }

  public void setLookingDownwardsPitchAngle(Double lookingDownwardsPitchAngle) {
    this.lookingDownwardsPitchAngle = lookingDownwardsPitchAngle;
  }

  public FacePoseSensibilityConfig lookingFront(Double lookingFront) {
    this.lookingFront = lookingFront;
    return this;
  }

   /**
   * Get lookingFront
   * @return lookingFront
  **/
  @ApiModelProperty(value = "")
  public Double getLookingFront() {
    return lookingFront;
  }

  public void setLookingFront(Double lookingFront) {
    this.lookingFront = lookingFront;
  }

  public FacePoseSensibilityConfig lookingLeftYawAngle(Double lookingLeftYawAngle) {
    this.lookingLeftYawAngle = lookingLeftYawAngle;
    return this;
  }

   /**
   * Get lookingLeftYawAngle
   * @return lookingLeftYawAngle
  **/
  @ApiModelProperty(value = "")
  public Double getLookingLeftYawAngle() {
    return lookingLeftYawAngle;
  }

  public void setLookingLeftYawAngle(Double lookingLeftYawAngle) {
    this.lookingLeftYawAngle = lookingLeftYawAngle;
  }

  public FacePoseSensibilityConfig lookingRightYawAngle(Double lookingRightYawAngle) {
    this.lookingRightYawAngle = lookingRightYawAngle;
    return this;
  }

   /**
   * Get lookingRightYawAngle
   * @return lookingRightYawAngle
  **/
  @ApiModelProperty(value = "")
  public Double getLookingRightYawAngle() {
    return lookingRightYawAngle;
  }

  public void setLookingRightYawAngle(Double lookingRightYawAngle) {
    this.lookingRightYawAngle = lookingRightYawAngle;
  }

  public FacePoseSensibilityConfig lookingUpwardsPitchAngle(Double lookingUpwardsPitchAngle) {
    this.lookingUpwardsPitchAngle = lookingUpwardsPitchAngle;
    return this;
  }

   /**
   * Get lookingUpwardsPitchAngle
   * @return lookingUpwardsPitchAngle
  **/
  @ApiModelProperty(value = "")
  public Double getLookingUpwardsPitchAngle() {
    return lookingUpwardsPitchAngle;
  }

  public void setLookingUpwardsPitchAngle(Double lookingUpwardsPitchAngle) {
    this.lookingUpwardsPitchAngle = lookingUpwardsPitchAngle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacePoseSensibilityConfig facePoseSensibilityConfig = (FacePoseSensibilityConfig) o;
    return Objects.equals(this.lookingDownwardsPitchAngle, facePoseSensibilityConfig.lookingDownwardsPitchAngle) &&
        Objects.equals(this.lookingFront, facePoseSensibilityConfig.lookingFront) &&
        Objects.equals(this.lookingLeftYawAngle, facePoseSensibilityConfig.lookingLeftYawAngle) &&
        Objects.equals(this.lookingRightYawAngle, facePoseSensibilityConfig.lookingRightYawAngle) &&
        Objects.equals(this.lookingUpwardsPitchAngle, facePoseSensibilityConfig.lookingUpwardsPitchAngle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookingDownwardsPitchAngle, lookingFront, lookingLeftYawAngle, lookingRightYawAngle, lookingUpwardsPitchAngle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacePoseSensibilityConfig {\n");
    
    sb.append("    lookingDownwardsPitchAngle: ").append(toIndentedString(lookingDownwardsPitchAngle)).append("\n");
    sb.append("    lookingFront: ").append(toIndentedString(lookingFront)).append("\n");
    sb.append("    lookingLeftYawAngle: ").append(toIndentedString(lookingLeftYawAngle)).append("\n");
    sb.append("    lookingRightYawAngle: ").append(toIndentedString(lookingRightYawAngle)).append("\n");
    sb.append("    lookingUpwardsPitchAngle: ").append(toIndentedString(lookingUpwardsPitchAngle)).append("\n");
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

