# openapi_client.AppsApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apps_create_app**](AppsApi.md#apps_create_app) | **POST** /apps | 


# **apps_create_app**
> AppCreationResponseModel apps_create_app(author_name, author_email, app_creation_request_model)



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
api_instance = openapi_client.AppsApi(openapi_client.ApiClient(configuration))
author_name = 'author_name_example' # str | 
author_email = 'author_email_example' # str | 
app_creation_request_model = openapi_client.AppCreationRequestModel() # AppCreationRequestModel | 

try:
    api_response = api_instance.apps_create_app(author_name, author_email, app_creation_request_model)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->apps_create_app: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **author_name** | **str**|  | 
 **author_email** | **str**|  | 
 **app_creation_request_model** | [**AppCreationRequestModel**](AppCreationRequestModel.md)|  | 

### Return type

[**AppCreationResponseModel**](AppCreationResponseModel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

