/* 
 * Tweek
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// AppCreationResponseModel
    /// </summary>
    [DataContract]
    public partial class AppCreationResponseModel :  IEquatable<AppCreationResponseModel>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AppCreationResponseModel" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AppCreationResponseModel() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AppCreationResponseModel" /> class.
        /// </summary>
        /// <param name="appId">appId (required).</param>
        /// <param name="appSecret">appSecret (required).</param>
        public AppCreationResponseModel(string appId = default(string), string appSecret = default(string))
        {
            // to ensure "appId" is required (not null)
            if (appId == null)
            {
                throw new InvalidDataException("appId is a required property for AppCreationResponseModel and cannot be null");
            }
            else
            {
                this.AppId = appId;
            }
            // to ensure "appSecret" is required (not null)
            if (appSecret == null)
            {
                throw new InvalidDataException("appSecret is a required property for AppCreationResponseModel and cannot be null");
            }
            else
            {
                this.AppSecret = appSecret;
            }
        }
        
        /// <summary>
        /// Gets or Sets AppId
        /// </summary>
        [DataMember(Name="appId", EmitDefaultValue=false)]
        public string AppId { get; set; }

        /// <summary>
        /// Gets or Sets AppSecret
        /// </summary>
        [DataMember(Name="appSecret", EmitDefaultValue=false)]
        public string AppSecret { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AppCreationResponseModel {\n");
            sb.Append("  AppId: ").Append(AppId).Append("\n");
            sb.Append("  AppSecret: ").Append(AppSecret).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AppCreationResponseModel);
        }

        /// <summary>
        /// Returns true if AppCreationResponseModel instances are equal
        /// </summary>
        /// <param name="input">Instance of AppCreationResponseModel to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AppCreationResponseModel input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AppId == input.AppId ||
                    (this.AppId != null &&
                    this.AppId.Equals(input.AppId))
                ) && 
                (
                    this.AppSecret == input.AppSecret ||
                    (this.AppSecret != null &&
                    this.AppSecret.Equals(input.AppSecret))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AppId != null)
                    hashCode = hashCode * 59 + this.AppId.GetHashCode();
                if (this.AppSecret != null)
                    hashCode = hashCode * 59 + this.AppSecret.GetHashCode();
                return hashCode;
            }
        }
    }

}
