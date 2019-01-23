# openapi_client.RevisionHistoryApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_revision_history**](RevisionHistoryApi.md#get_revision_history) | **GET** /revision-history | 


# **get_revision_history**
> list[object] get_revision_history(key_path, since)



Get Revision History

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
api_instance = openapi_client.RevisionHistoryApi(openapi_client.ApiClient(configuration))
key_path = 'key_path_example' # str | 
since = 'since_example' # str | 

try:
    api_response = api_instance.get_revision_history(key_path, since)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RevisionHistoryApi->get_revision_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_path** | **str**|  | 
 **since** | **str**|  | 

### Return type

**list[object]**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

