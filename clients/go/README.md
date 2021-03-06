# Go API client for openapi

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [OpenAPI-spec](https://www.openapis.org/) from a remote server, you can easily generate an API client.

- API version: 0.1.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.GoClientCodegen

## Installation

Install the following dependencies:
```
go get github.com/stretchr/testify/assert
go get golang.org/x/oauth2
go get golang.org/x/net/context
go get github.com/antihax/optional
```

Put the package under your project folder and add the following in import:
```golang
import "./openapi"
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppsApi* | [**AppsCreateApp**](docs/AppsApi.md#appscreateapp) | **Post** /apps | 
*ConfiguraitonApi* | [**GetValue**](docs/ConfiguraitonApi.md#getvalue) | **Get** /values | 
*ContextApi* | [**DeleteContextProp**](docs/ContextApi.md#deletecontextprop) | **Delete** /context/{identityType}/{identityId}/{prop} | 
*ContextApi* | [**GetContext**](docs/ContextApi.md#getcontext) | **Get** /context/{identityType}/{identityId} | 
*ContextApi* | [**SaveContext**](docs/ContextApi.md#savecontext) | **Post** /context/{identityType}/{identityId} | 
*DependentApi* | [**GetDependents**](docs/DependentApi.md#getdependents) | **Get** /dependents | 
*KeysApi* | [**CreateKey**](docs/KeysApi.md#createkey) | **Put** /keys | 
*KeysApi* | [**GetKey**](docs/KeysApi.md#getkey) | **Get** /keys | 
*KeysApi* | [**KeysDeleteKey**](docs/KeysApi.md#keysdeletekey) | **Delete** /keys | 
*ManifestApi* | [**GetManifests**](docs/ManifestApi.md#getmanifests) | **Get** /manifests | 
*PolicyApi* | [**GetPolicies**](docs/PolicyApi.md#getpolicies) | **Get** /policies | 
*PolicyApi* | [**ReplacePolicy**](docs/PolicyApi.md#replacepolicy) | **Put** /policies | 
*PolicyApi* | [**UpdatePolicy**](docs/PolicyApi.md#updatepolicy) | **Patch** /policies | 
*RevisionHistoryApi* | [**GetRevisionHistory**](docs/RevisionHistoryApi.md#getrevisionhistory) | **Get** /revision-history | 
*SchemaApi* | [**DeleteIdentity**](docs/SchemaApi.md#deleteidentity) | **Delete** /schemas/{identityType} | 
*SchemaApi* | [**GetSchemas**](docs/SchemaApi.md#getschemas) | **Get** /schemas | 
*SchemaApi* | [**SchemaAddIdentity**](docs/SchemaApi.md#schemaaddidentity) | **Post** /schemas/{identityType} | 
*SchemaApi* | [**SchemaPatchIdentity**](docs/SchemaApi.md#schemapatchidentity) | **Patch** /schemas/{identityType} | 
*SearchApi* | [**Search**](docs/SearchApi.md#search) | **Get** /search | 
*SuggestionsApi* | [**GetSuggestions**](docs/SuggestionsApi.md#getsuggestions) | **Get** /suggestions | 
*TagsApi* | [**SaveTag**](docs/TagsApi.md#savetag) | **Put** /tags | 
*TagsApi* | [**TagsGet**](docs/TagsApi.md#tagsget) | **Get** /tags | 


## Documentation For Models

 - [AppCreationRequestModel](docs/AppCreationRequestModel.md)
 - [AppCreationResponseModel](docs/AppCreationResponseModel.md)
 - [KeyUpdateModel](docs/KeyUpdateModel.md)
 - [PatchOperation](docs/PatchOperation.md)


## Documentation For Authorization

## bearerAuth
- **Type**: HTTP basic authentication

Example
```golang
auth := context.WithValue(context.Background(), sw.ContextBasicAuth, sw.BasicAuth{
	UserName: "username",
	Password: "password",
})
r, err := client.Service.Operation(auth, args)
```

## Author



