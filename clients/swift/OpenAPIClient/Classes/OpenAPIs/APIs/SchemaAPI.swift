//
// SchemaAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Alamofire



public class SchemaAPI: APIBase {
    /**

     - parameter identityType: (path) The type of the identity 
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteIdentity(identityType identityType: String, authorName: String, authorEmail: String, completion: ((data: String?, error: ErrorType?) -> Void)) {
        deleteIdentityWithRequestBuilder(identityType: identityType, authorName: authorName, authorEmail: authorEmail).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - DELETE /schemas/{identityType}
     - Delete Schema     - BASIC:
       - type: http
       - name: bearerAuth
     - parameter identityType: (path) The type of the identity 
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  

     - returns: RequestBuilder<String> 
     */
    public class func deleteIdentityWithRequestBuilder(identityType identityType: String, authorName: String, authorEmail: String) -> RequestBuilder<String> {
        var path = "/schemas/{identityType}"
        path = path.stringByReplacingOccurrencesOfString("{identityType}", withString: "\(identityType)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "author.name": authorName,
            "author.email": authorEmail
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<String>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**

     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getSchemas(completion: ((data: [AnyObject]?, error: ErrorType?) -> Void)) {
        getSchemasWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /schemas
     - Get query     - BASIC:
       - type: http
       - name: bearerAuth
     - examples: [{contentType=application/json, example="{}", statusCode=200}]

     - returns: RequestBuilder<[AnyObject]> 
     */
    public class func getSchemasWithRequestBuilder() -> RequestBuilder<[AnyObject]> {
        let path = "/schemas"
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[AnyObject]>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter identityType: (path)  
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter body: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func schemaAddIdentity(identityType identityType: String, authorName: String, authorEmail: String, body: AnyObject, completion: ((data: String?, error: ErrorType?) -> Void)) {
        schemaAddIdentityWithRequestBuilder(identityType: identityType, authorName: authorName, authorEmail: authorEmail, body: body).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - POST /schemas/{identityType}
     - Add identity     - BASIC:
       - type: http
       - name: bearerAuth
     - parameter identityType: (path)  
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter body: (body)  

     - returns: RequestBuilder<String> 
     */
    public class func schemaAddIdentityWithRequestBuilder(identityType identityType: String, authorName: String, authorEmail: String, body: AnyObject) -> RequestBuilder<String> {
        var path = "/schemas/{identityType}"
        path = path.stringByReplacingOccurrencesOfString("{identityType}", withString: "\(identityType)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<String>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**

     - parameter identityType: (path)  
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter patchOperation: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func schemaPatchIdentity(identityType identityType: String, authorName: String, authorEmail: String, patchOperation: [PatchOperation], completion: ((data: String?, error: ErrorType?) -> Void)) {
        schemaPatchIdentityWithRequestBuilder(identityType: identityType, authorName: authorName, authorEmail: authorEmail, patchOperation: patchOperation).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - PATCH /schemas/{identityType}
     - Update identity     - BASIC:
       - type: http
       - name: bearerAuth
     - parameter identityType: (path)  
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter patchOperation: (body)  

     - returns: RequestBuilder<String> 
     */
    public class func schemaPatchIdentityWithRequestBuilder(identityType identityType: String, authorName: String, authorEmail: String, patchOperation: [PatchOperation]) -> RequestBuilder<String> {
        var path = "/schemas/{identityType}"
        path = path.stringByReplacingOccurrencesOfString("{identityType}", withString: "\(identityType)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = patchOperation.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<String>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PATCH", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

}
