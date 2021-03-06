# openapi-java-client

Tweek
- API version: 0.1.0
  - Build date: 2019-01-23T17:20:35.070Z[GMT]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppsApi;

import java.io.File;
import java.util.*;

public class AppsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: bearerAuth
        HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setUsername("YOUR USERNAME");
        bearerAuth.setPassword("YOUR PASSWORD");

        AppsApi apiInstance = new AppsApi();
        String authorName = "authorName_example"; // String | 
        String authorEmail = "authorEmail_example"; // String | 
        AppCreationRequestModel appCreationRequestModel = new AppCreationRequestModel(); // AppCreationRequestModel | 
        try {
            AppCreationResponseModel result = apiInstance.appsCreateApp(authorName, authorEmail, appCreationRequestModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppsApi#appsCreateApp");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppsApi* | [**appsCreateApp**](docs/AppsApi.md#appsCreateApp) | **POST** /apps | 
*ConfiguraitonApi* | [**getValue**](docs/ConfiguraitonApi.md#getValue) | **GET** /values | 
*ContextApi* | [**deleteContextProp**](docs/ContextApi.md#deleteContextProp) | **DELETE** /context/{identityType}/{identityId}/{prop} | 
*ContextApi* | [**getContext**](docs/ContextApi.md#getContext) | **GET** /context/{identityType}/{identityId} | 
*ContextApi* | [**saveContext**](docs/ContextApi.md#saveContext) | **POST** /context/{identityType}/{identityId} | 
*DependentApi* | [**getDependents**](docs/DependentApi.md#getDependents) | **GET** /dependents | 
*KeysApi* | [**createKey**](docs/KeysApi.md#createKey) | **PUT** /keys | 
*KeysApi* | [**getKey**](docs/KeysApi.md#getKey) | **GET** /keys | 
*KeysApi* | [**keysDeleteKey**](docs/KeysApi.md#keysDeleteKey) | **DELETE** /keys | 
*ManifestApi* | [**getManifests**](docs/ManifestApi.md#getManifests) | **GET** /manifests | 
*PolicyApi* | [**getPolicies**](docs/PolicyApi.md#getPolicies) | **GET** /policies | 
*PolicyApi* | [**replacePolicy**](docs/PolicyApi.md#replacePolicy) | **PUT** /policies | 
*PolicyApi* | [**updatePolicy**](docs/PolicyApi.md#updatePolicy) | **PATCH** /policies | 
*RevisionHistoryApi* | [**getRevisionHistory**](docs/RevisionHistoryApi.md#getRevisionHistory) | **GET** /revision-history | 
*SchemaApi* | [**deleteIdentity**](docs/SchemaApi.md#deleteIdentity) | **DELETE** /schemas/{identityType} | 
*SchemaApi* | [**getSchemas**](docs/SchemaApi.md#getSchemas) | **GET** /schemas | 
*SchemaApi* | [**schemaAddIdentity**](docs/SchemaApi.md#schemaAddIdentity) | **POST** /schemas/{identityType} | 
*SchemaApi* | [**schemaPatchIdentity**](docs/SchemaApi.md#schemaPatchIdentity) | **PATCH** /schemas/{identityType} | 
*SearchApi* | [**search**](docs/SearchApi.md#search) | **GET** /search | 
*SuggestionsApi* | [**getSuggestions**](docs/SuggestionsApi.md#getSuggestions) | **GET** /suggestions | 
*TagsApi* | [**saveTag**](docs/TagsApi.md#saveTag) | **PUT** /tags | 
*TagsApi* | [**tagsGet**](docs/TagsApi.md#tagsGet) | **GET** /tags | 


## Documentation for Models

 - [AppCreationRequestModel](docs/AppCreationRequestModel.md)
 - [AppCreationResponseModel](docs/AppCreationResponseModel.md)
 - [KeyUpdateModel](docs/KeyUpdateModel.md)
 - [PatchOperation](docs/PatchOperation.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



