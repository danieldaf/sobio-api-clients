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
 * Emotion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:38:33.176-03:00")
public class Emotion {
  @JsonProperty("anger")
  private Integer anger = null;

  @JsonProperty("disgust")
  private Integer disgust = null;

  @JsonProperty("fear")
  private Integer fear = null;

  @JsonProperty("happiness")
  private Integer happiness = null;

  @JsonProperty("neutral")
  private Integer neutral = null;

  @JsonProperty("sadness")
  private Integer sadness = null;

  @JsonProperty("surprise")
  private Integer surprise = null;

  public Emotion anger(Integer anger) {
    this.anger = anger;
    return this;
  }

   /**
   * Get anger
   * minimum: -128
   * maximum: 127
   * @return anger
  **/
  @ApiModelProperty(value = "")
  public Integer getAnger() {
    return anger;
  }

  public void setAnger(Integer anger) {
    this.anger = anger;
  }

  public Emotion disgust(Integer disgust) {
    this.disgust = disgust;
    return this;
  }

   /**
   * Get disgust
   * minimum: -128
   * maximum: 127
   * @return disgust
  **/
  @ApiModelProperty(value = "")
  public Integer getDisgust() {
    return disgust;
  }

  public void setDisgust(Integer disgust) {
    this.disgust = disgust;
  }

  public Emotion fear(Integer fear) {
    this.fear = fear;
    return this;
  }

   /**
   * Get fear
   * minimum: -128
   * maximum: 127
   * @return fear
  **/
  @ApiModelProperty(value = "")
  public Integer getFear() {
    return fear;
  }

  public void setFear(Integer fear) {
    this.fear = fear;
  }

  public Emotion happiness(Integer happiness) {
    this.happiness = happiness;
    return this;
  }

   /**
   * Get happiness
   * minimum: -128
   * maximum: 127
   * @return happiness
  **/
  @ApiModelProperty(value = "")
  public Integer getHappiness() {
    return happiness;
  }

  public void setHappiness(Integer happiness) {
    this.happiness = happiness;
  }

  public Emotion neutral(Integer neutral) {
    this.neutral = neutral;
    return this;
  }

   /**
   * Get neutral
   * minimum: -128
   * maximum: 127
   * @return neutral
  **/
  @ApiModelProperty(value = "")
  public Integer getNeutral() {
    return neutral;
  }

  public void setNeutral(Integer neutral) {
    this.neutral = neutral;
  }

  public Emotion sadness(Integer sadness) {
    this.sadness = sadness;
    return this;
  }

   /**
   * Get sadness
   * minimum: -128
   * maximum: 127
   * @return sadness
  **/
  @ApiModelProperty(value = "")
  public Integer getSadness() {
    return sadness;
  }

  public void setSadness(Integer sadness) {
    this.sadness = sadness;
  }

  public Emotion surprise(Integer surprise) {
    this.surprise = surprise;
    return this;
  }

   /**
   * Get surprise
   * minimum: -128
   * maximum: 127
   * @return surprise
  **/
  @ApiModelProperty(value = "")
  public Integer getSurprise() {
    return surprise;
  }

  public void setSurprise(Integer surprise) {
    this.surprise = surprise;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emotion emotion = (Emotion) o;
    return Objects.equals(this.anger, emotion.anger) &&
        Objects.equals(this.disgust, emotion.disgust) &&
        Objects.equals(this.fear, emotion.fear) &&
        Objects.equals(this.happiness, emotion.happiness) &&
        Objects.equals(this.neutral, emotion.neutral) &&
        Objects.equals(this.sadness, emotion.sadness) &&
        Objects.equals(this.surprise, emotion.surprise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anger, disgust, fear, happiness, neutral, sadness, surprise);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emotion {\n");
    
    sb.append("    anger: ").append(toIndentedString(anger)).append("\n");
    sb.append("    disgust: ").append(toIndentedString(disgust)).append("\n");
    sb.append("    fear: ").append(toIndentedString(fear)).append("\n");
    sb.append("    happiness: ").append(toIndentedString(happiness)).append("\n");
    sb.append("    neutral: ").append(toIndentedString(neutral)).append("\n");
    sb.append("    sadness: ").append(toIndentedString(sadness)).append("\n");
    sb.append("    surprise: ").append(toIndentedString(surprise)).append("\n");
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

