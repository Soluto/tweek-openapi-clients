# openapi_client.SchemaApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_identity**](SchemaApi.md#delete_identity) | **DELETE** /schemas/{identityType} | 
[**get_schemas**](SchemaApi.md#get_schemas) | **GET** /schemas | 
[**schema_add_identity**](SchemaApi.md#schema_add_identity) | **POST** /schemas/{identityType} | 
[**schema_patch_identity**](SchemaApi.md#schema_patch_identity) | **PATCH** /schemas/{identityType} | 


# **delete_identity**
> str delete_identity(identity_type, author_name, author_email)



Delete Schema

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
api_instance = openapi_client.SchemaApi(openapi_client.ApiClient(configuration))
identity_type = 'identity_type_example' # str | The type of the identity
author_name = 'author_name_example' # str | 
author_email = 'author_email_example' # str | 

try:
    api_response = api_instance.delete_identity(identity_type, author_name, author_email)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SchemaApi->delete_identity: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_type** | **str**| The type of the identity | 
 **author_name** | **str**|  | 
 **author_email** | **str**|  | 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_schemas**
> list[object] get_schemas()



Get query

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
api_instance = openapi_client.SchemaApi(openapi_client.ApiClient(configuration))

try:
    api_response = api_instance.get_schemas()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SchemaApi->get_schemas: %s\n" % e)
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

# **schema_add_identity**
> str schema_add_identity(identity_type, author_name, author_email, body)



Add identity

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
api_instance = openapi_client.SchemaApi(openapi_client.ApiClient(configuration))
identity_type = 'identity_type_example' # str | 
author_name = 'author_name_example' # str | 
author_email = 'author_email_example' # str | 
body = NULL # object | 

try:
    api_response = api_instance.schema_add_identity(identity_type, author_name, author_email, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SchemaApi->schema_add_identity: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_type** | **str**|  | 
 **author_name** | **str**|  | 
 **author_email** | **str**|  | 
 **body** | **object**|  | 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schema_patch_identity**
> str schema_patch_identity(identity_type, author_name, author_email, patch_operation)



Update identity

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
api_instance = openapi_client.SchemaApi(openapi_client.ApiClient(configuration))
identity_type = 'identity_type_example' # str | 
author_name = 'author_name_example' # str | 
author_email = 'author_email_example' # str | 
patch_operation = NULL # list[PatchOperation] | 

try:
    api_response = api_instance.schema_patch_identity(identity_type, author_name, author_email, patch_operation)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SchemaApi->schema_patch_identity: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_type** | **str**|  | 
 **author_name** | **str**|  | 
 **author_email** | **str**|  | 
 **patch_operation** | [**list[PatchOperation]**](list.md)|  | 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

