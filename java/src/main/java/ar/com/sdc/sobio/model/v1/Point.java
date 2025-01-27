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
 * Point
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T10:34:31.222-03:00")
public class Point {
  @JsonProperty("confidence")
  private Integer confidence = null;

  @JsonProperty("num")
  private Integer num = null;

  @JsonProperty("x")
  private Integer x = null;

  @JsonProperty("y")
  private Integer y = null;

  public Point confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * minimum: -128
   * maximum: 127
   * @return confidence
  **/
  @ApiModelProperty(value = "")
  public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  public Point num(Integer num) {
    this.num = num;
    return this;
  }

   /**
   * Get num
   * @return num
  **/
  @ApiModelProperty(value = "")
  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public Point x(Integer x) {
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @ApiModelProperty(value = "")
  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public Point y(Integer y) {
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @ApiModelProperty(value = "")
  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Point point = (Point) o;
    return Objects.equals(this.confidence, point.confidence) &&
        Objects.equals(this.num, point.num) &&
        Objects.equals(this.x, point.x) &&
        Objects.equals(this.y, point.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, num, x, y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Point {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

