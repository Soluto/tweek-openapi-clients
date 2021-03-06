# ContextApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteContextProp**](ContextApi.md#deleteContextProp) | **DELETE** /context/{identityType}/{identityId}/{prop} | 
[**getContext**](ContextApi.md#getContext) | **GET** /context/{identityType}/{identityId} | 
[**saveContext**](ContextApi.md#saveContext) | **POST** /context/{identityType}/{identityId} | 


<a name="deleteContextProp"></a>
# **deleteContextProp**
> deleteContextProp(identityType, identityId, prop)



Delete identity context property

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.ContextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

ContextApi apiInstance = new ContextApi();
String identityType = "identityType_example"; // String | the type of the identity - for example user
String identityId = "identityId_example"; // String | the identifier of the identity - for example jaime
String prop = "prop_example"; // String | the property to delete, for example age
try {
    apiInstance.deleteContextProp(identityType, identityId, prop);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#deleteContextProp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityType** | **String**| the type of the identity - for example user |
 **identityId** | **String**| the identifier of the identity - for example jaime |
 **prop** | **String**| the property to delete, for example age |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContext"></a>
# **getContext**
> getContext(identityType, identityId)



Get identity context

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.ContextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

ContextApi apiInstance = new ContextApi();
String identityType = "identityType_example"; // String | the type of the identity - for example user
String identityId = "identityId_example"; // String | the identifier of the identity - for example jaime
try {
    apiInstance.getContext(identityType, identityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#getContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityType** | **String**| the type of the identity - for example user |
 **identityId** | **String**| the identifier of the identity - for example jaime |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="saveContext"></a>
# **saveContext**
> saveContext(identityType, identityId)



Save identity context

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.ContextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

ContextApi apiInstance = new ContextApi();
String identityType = "identityType_example"; // String | the type of the identity - for example user
String identityId = "identityId_example"; // String | the identifier of the identity - for example jaime
try {
    apiInstance.saveContext(identityType, identityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#saveContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityType** | **String**| the type of the identity - for example user |
 **identityId** | **String**| the identifier of the identity - for example jaime |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

