# \KeysApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateKey**](KeysApi.md#CreateKey) | **Put** /keys | 
[**GetKey**](KeysApi.md#GetKey) | **Get** /keys | 
[**KeysDeleteKey**](KeysApi.md#KeysDeleteKey) | **Delete** /keys | 


# **CreateKey**
> string CreateKey(ctx, keyPath, authorName, authorEmail, keyUpdateModel)


Save Key

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **keyPath** | **string**|  | 
  **authorName** | **string**|  | 
  **authorEmail** | **string**|  | 
  **keyUpdateModel** | [**KeyUpdateModel**](KeyUpdateModel.md)|  | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetKey**
> map[string]interface{} GetKey(ctx, keyPath, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **keyPath** | **string**|  | 
 **optional** | ***GetKeyOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetKeyOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **revision** | **optional.String**|  | 

### Return type

[**map[string]interface{}**](map[string]interface{}.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **KeysDeleteKey**
> string KeysDeleteKey(ctx, keyPath, authorName, authorEmail, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **keyPath** | **string**|  | 
  **authorName** | **string**|  | 
  **authorEmail** | **string**|  | 
 **optional** | ***KeysDeleteKeyOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a KeysDeleteKeyOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **requestBody** | [**optional.Interface of []string**](array.md)|  | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

