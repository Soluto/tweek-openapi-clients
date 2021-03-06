# SuggestionsApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSuggestions**](SuggestionsApi.md#getSuggestions) | **GET** /suggestions | 


<a name="getSuggestions"></a>
# **getSuggestions**
> List&lt;Object&gt; getSuggestions()



Get Suggestions

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.SuggestionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

SuggestionsApi apiInstance = new SuggestionsApi();
try {
    List<Object> result = apiInstance.getSuggestions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuggestionsApi#getSuggestions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

