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
import ar.com.sdc.sobio.model.v1.InputStream;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;

/**
 * Resource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-01T16:13:13.139-03:00")
public class Resource {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("file")
  private File file = null;

  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("inputStream")
  private InputStream inputStream = null;

  @JsonProperty("open")
  private Boolean open = null;

  @JsonProperty("readable")
  private Boolean readable = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("url")
  private String url = null;

  public Resource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Resource file(File file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @ApiModelProperty(value = "")
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public Resource filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Resource inputStream(InputStream inputStream) {
    this.inputStream = inputStream;
    return this;
  }

   /**
   * Get inputStream
   * @return inputStream
  **/
  @ApiModelProperty(value = "")
  public InputStream getInputStream() {
    return inputStream;
  }

  public void setInputStream(InputStream inputStream) {
    this.inputStream = inputStream;
  }

  public Resource open(Boolean open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @ApiModelProperty(value = "")
  public Boolean isOpen() {
    return open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public Resource readable(Boolean readable) {
    this.readable = readable;
    return this;
  }

   /**
   * Get readable
   * @return readable
  **/
  @ApiModelProperty(value = "")
  public Boolean isReadable() {
    return readable;
  }

  public void setReadable(Boolean readable) {
    this.readable = readable;
  }

  public Resource uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Resource url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.description, resource.description) &&
        Objects.equals(this.file, resource.file) &&
        Objects.equals(this.filename, resource.filename) &&
        Objects.equals(this.inputStream, resource.inputStream) &&
        Objects.equals(this.open, resource.open) &&
        Objects.equals(this.readable, resource.readable) &&
        Objects.equals(this.uri, resource.uri) &&
        Objects.equals(this.url, resource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, file, filename, inputStream, open, readable, uri, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    inputStream: ").append(toIndentedString(inputStream)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

