# RevisionHistoryApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRevisionHistory**](RevisionHistoryApi.md#getRevisionHistory) | **GET** /revision-history | 


<a name="getRevisionHistory"></a>
# **getRevisionHistory**
> List&lt;Object&gt; getRevisionHistory(keyPath, since)



Get Revision History

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.RevisionHistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

RevisionHistoryApi apiInstance = new RevisionHistoryApi();
String keyPath = "keyPath_example"; // String | 
String since = "since_example"; // String | 
try {
    List<Object> result = apiInstance.getRevisionHistory(keyPath, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RevisionHistoryApi#getRevisionHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyPath** | **String**|  |
 **since** | **String**|  |

### Return type

**List&lt;Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

