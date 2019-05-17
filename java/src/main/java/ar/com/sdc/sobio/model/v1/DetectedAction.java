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
import ar.com.sdc.sobio.model.v1.Point;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * DetectedAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:38:33.176-03:00")
public class DetectedAction {
  @JsonProperty("frameNum")
  private Integer frameNum = null;

  @JsonProperty("pitch")
  private Float pitch = null;

  @JsonProperty("points")
  private List<Point> points = null;

  @JsonProperty("roll")
  private Float roll = null;

  @JsonProperty("thumbnail")
  private byte[] thumbnail = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    LOOKING_LEFT("LOOKING_LEFT"),
    
    LOOKING_RIGHT("LOOKING_RIGHT"),
    
    LOOKING_UPWARDS("LOOKING_UPWARDS"),
    
    LOOKING_DOWNWARDS("LOOKING_DOWNWARDS"),
    
    LOOKING_FRONT("LOOKING_FRONT"),
    
    RIGHT_EYE_BLINK("RIGHT_EYE_BLINK"),
    
    LEFT_EYE_BLINK("LEFT_EYE_BLINK");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("yaw")
  private Float yaw = null;

  public DetectedAction frameNum(Integer frameNum) {
    this.frameNum = frameNum;
    return this;
  }

   /**
   * Get frameNum
   * @return frameNum
  **/
  @ApiModelProperty(value = "")
  public Integer getFrameNum() {
    return frameNum;
  }

  public void setFrameNum(Integer frameNum) {
    this.frameNum = frameNum;
  }

  public DetectedAction pitch(Float pitch) {
    this.pitch = pitch;
    return this;
  }

   /**
   * Get pitch
   * @return pitch
  **/
  @ApiModelProperty(value = "")
  public Float getPitch() {
    return pitch;
  }

  public void setPitch(Float pitch) {
    this.pitch = pitch;
  }

  public DetectedAction points(List<Point> points) {
    this.points = points;
    return this;
  }

  public DetectedAction addPointsItem(Point pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<Point>();
    }
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @ApiModelProperty(value = "")
  public List<Point> getPoints() {
    return points;
  }

  public void setPoints(List<Point> points) {
    this.points = points;
  }

  public DetectedAction roll(Float roll) {
    this.roll = roll;
    return this;
  }

   /**
   * Get roll
   * @return roll
  **/
  @ApiModelProperty(value = "")
  public Float getRoll() {
    return roll;
  }

  public void setRoll(Float roll) {
    this.roll = roll;
  }

  public DetectedAction thumbnail(byte[] thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(value = "")
  public byte[] getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(byte[] thumbnail) {
    this.thumbnail = thumbnail;
  }

  public DetectedAction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public DetectedAction yaw(Float yaw) {
    this.yaw = yaw;
    return this;
  }

   /**
   * Get yaw
   * @return yaw
  **/
  @ApiModelProperty(value = "")
  public Float getYaw() {
    return yaw;
  }

  public void setYaw(Float yaw) {
    this.yaw = yaw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedAction detectedAction = (DetectedAction) o;
    return Objects.equals(this.frameNum, detectedAction.frameNum) &&
        Objects.equals(this.pitch, detectedAction.pitch) &&
        Objects.equals(this.points, detectedAction.points) &&
        Objects.equals(this.roll, detectedAction.roll) &&
        Objects.equals(this.thumbnail, detectedAction.thumbnail) &&
        Objects.equals(this.type, detectedAction.type) &&
        Objects.equals(this.yaw, detectedAction.yaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameNum, pitch, points, roll, thumbnail, type, yaw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedAction {\n");
    
    sb.append("    frameNum: ").append(toIndentedString(frameNum)).append("\n");
    sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    roll: ").append(toIndentedString(roll)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    yaw: ").append(toIndentedString(yaw)).append("\n");
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

