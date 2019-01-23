# openapi_client.DependentApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_dependents**](DependentApi.md#get_dependents) | **GET** /dependents | 


# **get_dependents**
> list[object] get_dependents()



Get Dependents

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
api_instance = openapi_client.DependentApi(openapi_client.ApiClient(configuration))

try:
    api_response = api_instance.get_dependents()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DependentApi->get_dependents: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**list[object]**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

