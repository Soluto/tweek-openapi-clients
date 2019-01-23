# openapi_client.ContextApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_context_prop**](ContextApi.md#delete_context_prop) | **DELETE** /context/{identityType}/{identityId}/{prop} | 
[**get_context**](ContextApi.md#get_context) | **GET** /context/{identityType}/{identityId} | 
[**save_context**](ContextApi.md#save_context) | **POST** /context/{identityType}/{identityId} | 


# **delete_context_prop**
> delete_context_prop(identity_type, identity_id, prop)



Delete identity context property

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
api_instance = openapi_client.ContextApi(openapi_client.ApiClient(configuration))
identity_type = 'identity_type_example' # str | the type of the identity - for example user
identity_id = 'identity_id_example' # str | the identifier of the identity - for example jaime
prop = 'prop_example' # str | the property to delete, for example age

try:
    api_instance.delete_context_prop(identity_type, identity_id, prop)
except ApiException as e:
    print("Exception when calling ContextApi->delete_context_prop: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_type** | **str**| the type of the identity - for example user | 
 **identity_id** | **str**| the identifier of the identity - for example jaime | 
 **prop** | **str**| the property to delete, for example age | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_context**
> get_context(identity_type, identity_id)



Get identity context

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
api_instance = openapi_client.ContextApi(openapi_client.ApiClient(configuration))
identity_type = 'identity_type_example' # str | the type of the identity - for example user
identity_id = 'identity_id_example' # str | the identifier of the identity - for example jaime

try:
    api_instance.get_context(identity_type, identity_id)
except ApiException as e:
    print("Exception when calling ContextApi->get_context: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_type** | **str**| the type of the identity - for example user | 
 **identity_id** | **str**| the identifier of the identity - for example jaime | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_context**
> save_context(identity_type, identity_id)



Save identity context

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
api_instance = openapi_client.ContextApi(openapi_client.ApiClient(configuration))
identity_type = 'identity_type_example' # str | the type of the identity - for example user
identity_id = 'identity_id_example' # str | the identifier of the identity - for example jaime

try:
    api_instance.save_context(identity_type, identity_id)
except ApiException as e:
    print("Exception when calling ContextApi->save_context: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_type** | **str**| the type of the identity - for example user | 
 **identity_id** | **str**| the identifier of the identity - for example jaime | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

