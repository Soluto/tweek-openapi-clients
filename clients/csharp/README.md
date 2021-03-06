# Org.OpenAPITools - the C# library for the Tweek

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.1.0
- SDK version: 1.0.0
- Build package: org.openapitools.codegen.languages.CSharpClientCodegen

<a name="frameworks-supported"></a>
## Frameworks supported
- .NET Core >=1.0
- .NET Framework >=4.6
- Mono/Xamarin >=vNext
- UWP >=10.0

<a name="dependencies"></a>
## Dependencies
- FubarCoder.RestSharp.Portable.Core >=4.0.7
- FubarCoder.RestSharp.Portable.HttpClient >=4.0.7
- Newtonsoft.Json >=10.0.3

<a name="installation"></a>
## Installation
Generate the DLL using your preferred tool

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;
```
<a name="getting-started"></a>
## Getting Started

```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Example
    {
        public void main()
        {

            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AppsApi();
            var authorName = authorName_example;  // string | 
            var authorEmail = authorEmail_example;  // string | 
            var appCreationRequestModel = new AppCreationRequestModel(); // AppCreationRequestModel | 

            try
            {
                AppCreationResponseModel result = apiInstance.AppsCreateApp(authorName, authorEmail, appCreationRequestModel);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AppsApi.AppsCreateApp: " + e.Message );
            }

        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppsApi* | [**AppsCreateApp**](docs/AppsApi.md#appscreateapp) | **POST** /apps | 
*ConfiguraitonApi* | [**GetValue**](docs/ConfiguraitonApi.md#getvalue) | **GET** /values | 
*ContextApi* | [**DeleteContextProp**](docs/ContextApi.md#deletecontextprop) | **DELETE** /context/{identityType}/{identityId}/{prop} | 
*ContextApi* | [**GetContext**](docs/ContextApi.md#getcontext) | **GET** /context/{identityType}/{identityId} | 
*ContextApi* | [**SaveContext**](docs/ContextApi.md#savecontext) | **POST** /context/{identityType}/{identityId} | 
*DependentApi* | [**GetDependents**](docs/DependentApi.md#getdependents) | **GET** /dependents | 
*KeysApi* | [**CreateKey**](docs/KeysApi.md#createkey) | **PUT** /keys | 
*KeysApi* | [**GetKey**](docs/KeysApi.md#getkey) | **GET** /keys | 
*KeysApi* | [**KeysDeleteKey**](docs/KeysApi.md#keysdeletekey) | **DELETE** /keys | 
*ManifestApi* | [**GetManifests**](docs/ManifestApi.md#getmanifests) | **GET** /manifests | 
*PolicyApi* | [**GetPolicies**](docs/PolicyApi.md#getpolicies) | **GET** /policies | 
*PolicyApi* | [**ReplacePolicy**](docs/PolicyApi.md#replacepolicy) | **PUT** /policies | 
*PolicyApi* | [**UpdatePolicy**](docs/PolicyApi.md#updatepolicy) | **PATCH** /policies | 
*RevisionHistoryApi* | [**GetRevisionHistory**](docs/RevisionHistoryApi.md#getrevisionhistory) | **GET** /revision-history | 
*SchemaApi* | [**DeleteIdentity**](docs/SchemaApi.md#deleteidentity) | **DELETE** /schemas/{identityType} | 
*SchemaApi* | [**GetSchemas**](docs/SchemaApi.md#getschemas) | **GET** /schemas | 
*SchemaApi* | [**SchemaAddIdentity**](docs/SchemaApi.md#schemaaddidentity) | **POST** /schemas/{identityType} | 
*SchemaApi* | [**SchemaPatchIdentity**](docs/SchemaApi.md#schemapatchidentity) | **PATCH** /schemas/{identityType} | 
*SearchApi* | [**Search**](docs/SearchApi.md#search) | **GET** /search | 
*SuggestionsApi* | [**GetSuggestions**](docs/SuggestionsApi.md#getsuggestions) | **GET** /suggestions | 
*TagsApi* | [**SaveTag**](docs/TagsApi.md#savetag) | **PUT** /tags | 
*TagsApi* | [**TagsGet**](docs/TagsApi.md#tagsget) | **GET** /tags | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Model.AppCreationRequestModel](docs/AppCreationRequestModel.md)
 - [Model.AppCreationResponseModel](docs/AppCreationResponseModel.md)
 - [Model.KeyUpdateModel](docs/KeyUpdateModel.md)
 - [Model.PatchOperation](docs/PatchOperation.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="bearerAuth"></a>
### bearerAuth

- **Type**: HTTP basic authentication

