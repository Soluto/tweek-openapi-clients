# openapi_client.ConfiguraitonApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_value**](ConfiguraitonApi.md#get_value) | **GET** /values | 


# **get_value**
> get_value(key_name, params=params, include=include, flatten=flatten)



Get tweek key value

### Example

* Basic Authentication (bearerAuth): 
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
configuration = openapi_client.Configuration()
# Configure HTTP basic authorization: bearerAuth
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = openapi_client.ConfiguraitonApi(openapi_client.ApiClient(configuration))
key_name = 'key_name_example' # str | Context ids
params = {'key': 'params_example'} # dict(str, str) |  (optional)
include = ['include_example'] # list[str] | Include additional keys (optional)
flatten = True # bool | Return flat key/value JSON (no nesting) (optional)

try:
    api_instance.get_value(key_name, params=params, include=include, flatten=flatten)
except ApiException as e:
    print("Exception when calling ConfiguraitonApi->get_value: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_name** | **str**| Context ids | 
 **params** | [**dict(str, str)**](str.md)|  | [optional] 
 **include** | [**list[str]**](str.md)| Include additional keys | [optional] 
 **flatten** | **bool**| Return flat key/value JSON (no nesting) | [optional] 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

