# KeysApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKey**](KeysApi.md#createKey) | **PUT** /keys | 
[**getKey**](KeysApi.md#getKey) | **GET** /keys | 
[**keysDeleteKey**](KeysApi.md#keysDeleteKey) | **DELETE** /keys | 


<a name="createKey"></a>
# **createKey**
> String createKey(keyPath, authorName, authorEmail, keyUpdateModel)



Save Key

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.KeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

KeysApi apiInstance = new KeysApi();
String keyPath = "keyPath_example"; // String | 
String authorName = "authorName_example"; // String | 
String authorEmail = "authorEmail_example"; // String | 
KeyUpdateModel keyUpdateModel = new KeyUpdateModel(); // KeyUpdateModel | 
try {
    String result = apiInstance.createKey(keyPath, authorName, authorEmail, keyUpdateModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeysApi#createKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyPath** | **String**|  |
 **authorName** | **String**|  |
 **authorEmail** | **String**|  |
 **keyUpdateModel** | [**KeyUpdateModel**](KeyUpdateModel.md)|  |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

<a name="getKey"></a>
# **getKey**
> Object getKey(keyPath, revision)



### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.KeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

KeysApi apiInstance = new KeysApi();
String keyPath = "keyPath_example"; // String | 
String revision = "revision_example"; // String | 
try {
    Object result = apiInstance.getKey(keyPath, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeysApi#getKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyPath** | **String**|  |
 **revision** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keysDeleteKey"></a>
# **keysDeleteKey**
> String keysDeleteKey(keyPath, authorName, authorEmail, requestBody)



### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.KeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

KeysApi apiInstance = new KeysApi();
String keyPath = "keyPath_example"; // String | 
String authorName = "authorName_example"; // String | 
String authorEmail = "authorEmail_example"; // String | 
List<String> requestBody = Arrays.asList(); // List<String> | 
try {
    String result = apiInstance.keysDeleteKey(keyPath, authorName, authorEmail, requestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeysApi#keysDeleteKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyPath** | **String**|  |
 **authorName** | **String**|  |
 **authorEmail** | **String**|  |
 **requestBody** | [**List&lt;String&gt;**](List.md)|  | [optional]

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

