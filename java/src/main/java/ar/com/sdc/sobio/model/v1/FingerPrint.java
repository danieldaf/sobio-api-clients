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
 * FingerPrint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-24T14:47:31.932-03:00")
public class FingerPrint {
  /**
   * Gets or Sets formatoTemplate
   */
  public enum FormatoTemplateEnum {
    ANSI378("ANSI378"),
    
    SOBIO("SOBIO");

    private String value;

    FormatoTemplateEnum(String value) {
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
    public static FormatoTemplateEnum fromValue(String text) {
      for (FormatoTemplateEnum b : FormatoTemplateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("formatoTemplate")
  private FormatoTemplateEnum formatoTemplate = null;

  @JsonProperty("image")
  private byte[] image = null;

  /**
   * Gets or Sets imageSource
   */
  public enum ImageSourceEnum {
    LIVE_FINGERPRINT("LIVE_FINGERPRINT"),
    
    SCANNED_FINGERPRINT_IMAGE("SCANNED_FINGERPRINT_IMAGE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    ImageSourceEnum(String value) {
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
    public static ImageSourceEnum fromValue(String text) {
      for (ImageSourceEnum b : ImageSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("imageSource")
  private ImageSourceEnum imageSource = null;

  /**
   * Gets or Sets position
   */
  public enum PositionEnum {
    RIGHT_THUMB("RIGHT_THUMB"),
    
    LEFT_THUMB("LEFT_THUMB"),
    
    RIGHT_INDEX_FINGER("RIGHT_INDEX_FINGER"),
    
    LEFT_INDEX_FINGER("LEFT_INDEX_FINGER"),
    
    RIGHT_MIDDLE_FINGER("RIGHT_MIDDLE_FINGER"),
    
    LEFT_MIDDLE_FINGER("LEFT_MIDDLE_FINGER"),
    
    LEFT_RING_FINGER("LEFT_RING_FINGER"),
    
    RIGHT_RING_FINGER("RIGHT_RING_FINGER"),
    
    LEFT_LITTLE_FINGER("LEFT_LITTLE_FINGER"),
    
    RIGHT_LITTLE_FINGER("RIGHT_LITTLE_FINGER"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    PositionEnum(String value) {
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
    public static PositionEnum fromValue(String text) {
      for (PositionEnum b : PositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("position")
  private PositionEnum position = null;

  @JsonProperty("template")
  private byte[] template = null;

  public FingerPrint formatoTemplate(FormatoTemplateEnum formatoTemplate) {
    this.formatoTemplate = formatoTemplate;
    return this;
  }

   /**
   * Get formatoTemplate
   * @return formatoTemplate
  **/
  @ApiModelProperty(value = "")
  public FormatoTemplateEnum getFormatoTemplate() {
    return formatoTemplate;
  }

  public void setFormatoTemplate(FormatoTemplateEnum formatoTemplate) {
    this.formatoTemplate = formatoTemplate;
  }

  public FingerPrint image(byte[] image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public FingerPrint imageSource(ImageSourceEnum imageSource) {
    this.imageSource = imageSource;
    return this;
  }

   /**
   * Get imageSource
   * @return imageSource
  **/
  @ApiModelProperty(value = "")
  public ImageSourceEnum getImageSource() {
    return imageSource;
  }

  public void setImageSource(ImageSourceEnum imageSource) {
    this.imageSource = imageSource;
  }

  public FingerPrint position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public FingerPrint template(byte[] template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(value = "")
  public byte[] getTemplate() {
    return template;
  }

  public void setTemplate(byte[] template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FingerPrint fingerPrint = (FingerPrint) o;
    return Objects.equals(this.formatoTemplate, fingerPrint.formatoTemplate) &&
        Objects.equals(this.image, fingerPrint.image) &&
        Objects.equals(this.imageSource, fingerPrint.imageSource) &&
        Objects.equals(this.position, fingerPrint.position) &&
        Objects.equals(this.template, fingerPrint.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatoTemplate, image, imageSource, position, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FingerPrint {\n");
    
    sb.append("    formatoTemplate: ").append(toIndentedString(formatoTemplate)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageSource: ").append(toIndentedString(imageSource)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

