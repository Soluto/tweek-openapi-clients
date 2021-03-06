/*
 * Tweek
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AppCreationResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-23T17:20:35.070Z[GMT]")
public class AppCreationResponseModel {
  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_APP_SECRET = "appSecret";
  @SerializedName(SERIALIZED_NAME_APP_SECRET)
  private String appSecret;

  public AppCreationResponseModel appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public AppCreationResponseModel appSecret(String appSecret) {
    this.appSecret = appSecret;
    return this;
  }

   /**
   * Get appSecret
   * @return appSecret
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAppSecret() {
    return appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppCreationResponseModel appCreationResponseModel = (AppCreationResponseModel) o;
    return Objects.equals(this.appId, appCreationResponseModel.appId) &&
        Objects.equals(this.appSecret, appCreationResponseModel.appSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCreationResponseModel {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
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

