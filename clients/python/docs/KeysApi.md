# openapi_client.KeysApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_key**](KeysApi.md#create_key) | **PUT** /keys | 
[**get_key**](KeysApi.md#get_key) | **GET** /keys | 
[**keys_delete_key**](KeysApi.md#keys_delete_key) | **DELETE** /keys | 


# **create_key**
> str create_key(key_path, author_name, author_email, key_update_model)



Save Key

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
api_instance = openapi_client.KeysApi(openapi_client.ApiClient(configuration))
key_path = 'key_path_example' # str | 
author_name = 'author_name_example' # str | 
author_email = 'author_email_example' # str | 
key_update_model = openapi_client.KeyUpdateModel() # KeyUpdateModel | 

try:
    api_response = api_instance.create_key(key_path, author_name, author_email, key_update_model)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling KeysApi->create_key: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_path** | **str**|  | 
 **author_name** | **str**|  | 
 **author_email** | **str**|  | 
 **key_update_model** | [**KeyUpdateModel**](KeyUpdateModel.md)|  | 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_key**
> object get_key(key_path, revision=revision)



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
api_instance = openapi_client.KeysApi(openapi_client.ApiClient(configuration))
key_path = 'key_path_example' # str | 
revision = 'revision_example' # str |  (optional)

try:
    api_response = api_instance.get_key(key_path, revision=revision)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling KeysApi->get_key: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_path** | **str**|  | 
 **revision** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **keys_delete_key**
> str keys_delete_key(key_path, author_name, author_email, request_body=request_body)



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
api_instance = openapi_client.KeysApi(openapi_client.ApiClient(configuration))
key_path = 'key_path_example' # str | 
author_name = 'author_name_example' # str | 
author_email = 'author_email_example' # str | 
request_body = NULL # list[str] |  (optional)

try:
    api_response = api_instance.keys_delete_key(key_path, author_name, author_email, request_body=request_body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling KeysApi->keys_delete_key: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_path** | **str**|  | 
 **author_name** | **str**|  | 
 **author_email** | **str**|  | 
 **request_body** | [**list[str]**](list.md)|  | [optional] 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

