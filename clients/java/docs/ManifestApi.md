# ManifestApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getManifests**](ManifestApi.md#getManifests) | **GET** /manifests | 


<a name="getManifests"></a>
# **getManifests**
> List&lt;Object&gt; getManifests()



Get Manifests

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.ManifestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

ManifestApi apiInstance = new ManifestApi();
try {
    List<Object> result = apiInstance.getManifests();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManifestApi#getManifests");
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

