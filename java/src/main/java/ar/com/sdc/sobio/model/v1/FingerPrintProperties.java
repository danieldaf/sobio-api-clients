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
 * FingerPrintProperties
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-01T15:17:54.527-03:00")
public class FingerPrintProperties {
  @JsonProperty("bitRate")
  private Float bitRate = null;

  @JsonProperty("height")
  private Integer height = null;

  /**
   * Gets or Sets nfiq
   */
  public enum NfiqEnum {
    EXCELLENT("EXCELLENT"),
    
    FAIR("FAIR"),
    
    GOOD("GOOD"),
    
    NOT_EVALUATED("NOT_EVALUATED"),
    
    POOR("POOR"),
    
    UNKNOWN("UNKNOWN"),
    
    VERY_GOOD("VERY_GOOD");

    private String value;

    NfiqEnum(String value) {
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
    public static NfiqEnum fromValue(String text) {
      for (NfiqEnum b : NfiqEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("nfiq")
  private NfiqEnum nfiq = null;

  /**
   * Gets or Sets pattern
   */
  public enum PatternEnum {
    NOT_EVALUATED("NOT_EVALUATED"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    PatternEnum(String value) {
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
    public static PatternEnum fromValue(String text) {
      for (PatternEnum b : PatternEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("pattern")
  private PatternEnum pattern = null;

  @JsonProperty("width")
  private Integer width = null;

  public FingerPrintProperties bitRate(Float bitRate) {
    this.bitRate = bitRate;
    return this;
  }

   /**
   * Get bitRate
   * @return bitRate
  **/
  @ApiModelProperty(value = "")
  public Float getBitRate() {
    return bitRate;
  }

  public void setBitRate(Float bitRate) {
    this.bitRate = bitRate;
  }

  public FingerPrintProperties height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public FingerPrintProperties nfiq(NfiqEnum nfiq) {
    this.nfiq = nfiq;
    return this;
  }

   /**
   * Get nfiq
   * @return nfiq
  **/
  @ApiModelProperty(value = "")
  public NfiqEnum getNfiq() {
    return nfiq;
  }

  public void setNfiq(NfiqEnum nfiq) {
    this.nfiq = nfiq;
  }

  public FingerPrintProperties pattern(PatternEnum pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @ApiModelProperty(value = "")
  public PatternEnum getPattern() {
    return pattern;
  }

  public void setPattern(PatternEnum pattern) {
    this.pattern = pattern;
  }

  public FingerPrintProperties width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FingerPrintProperties fingerPrintProperties = (FingerPrintProperties) o;
    return Objects.equals(this.bitRate, fingerPrintProperties.bitRate) &&
        Objects.equals(this.height, fingerPrintProperties.height) &&
        Objects.equals(this.nfiq, fingerPrintProperties.nfiq) &&
        Objects.equals(this.pattern, fingerPrintProperties.pattern) &&
        Objects.equals(this.width, fingerPrintProperties.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitRate, height, nfiq, pattern, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FingerPrintProperties {\n");
    
    sb.append("    bitRate: ").append(toIndentedString(bitRate)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    nfiq: ").append(toIndentedString(nfiq)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

