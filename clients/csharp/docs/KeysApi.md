# Org.OpenAPITools.Api.KeysApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateKey**](KeysApi.md#createkey) | **PUT** /keys | 
[**GetKey**](KeysApi.md#getkey) | **GET** /keys | 
[**KeysDeleteKey**](KeysApi.md#keysdeletekey) | **DELETE** /keys | 


<a name="createkey"></a>
# **CreateKey**
> string CreateKey (string keyPath, string authorName, string authorEmail, KeyUpdateModel keyUpdateModel)



Save Key

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateKeyExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new KeysApi();
            var keyPath = keyPath_example;  // string | 
            var authorName = authorName_example;  // string | 
            var authorEmail = authorEmail_example;  // string | 
            var keyUpdateModel = new KeyUpdateModel(); // KeyUpdateModel | 

            try
            {
                string result = apiInstance.CreateKey(keyPath, authorName, authorEmail, keyUpdateModel);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling KeysApi.CreateKey: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="getkey"></a>
# **GetKey**
> Object GetKey (string keyPath, string revision = null)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetKeyExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new KeysApi();
            var keyPath = keyPath_example;  // string | 
            var revision = revision_example;  // string |  (optional) 

            try
            {
                Object result = apiInstance.GetKey(keyPath, revision);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling KeysApi.GetKey: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyPath** | **string**|  | 
 **revision** | **string**|  | [optional] 

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="keysdeletekey"></a>
# **KeysDeleteKey**
> string KeysDeleteKey (string keyPath, string authorName, string authorEmail, List<string> requestBody = null)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class KeysDeleteKeyExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new KeysApi();
            var keyPath = keyPath_example;  // string | 
            var authorName = authorName_example;  // string | 
            var authorEmail = authorEmail_example;  // string | 
            var requestBody = new List<string>(); // List<string> |  (optional) 

            try
            {
                string result = apiInstance.KeysDeleteKey(keyPath, authorName, authorEmail, requestBody);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling KeysApi.KeysDeleteKey: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyPath** | **string**|  | 
 **authorName** | **string**|  | 
 **authorEmail** | **string**|  | 
 **requestBody** | [**List&lt;string&gt;**](List.md)|  | [optional] 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

