//
// KeysAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Alamofire



public class KeysAPI: APIBase {
    /**

     - parameter keyPath: (query)  
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter keyUpdateModel: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func createKey(keyPath keyPath: String, authorName: String, authorEmail: String, keyUpdateModel: KeyUpdateModel, completion: ((data: String?, error: ErrorType?) -> Void)) {
        createKeyWithRequestBuilder(keyPath: keyPath, authorName: authorName, authorEmail: authorEmail, keyUpdateModel: keyUpdateModel).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - PUT /keys
     - Save Key     - BASIC:
       - type: http
       - name: bearerAuth
     - parameter keyPath: (query)  
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter keyUpdateModel: (body)  

     - returns: RequestBuilder<String> 
     */
    public class func createKeyWithRequestBuilder(keyPath keyPath: String, authorName: String, authorEmail: String, keyUpdateModel: KeyUpdateModel) -> RequestBuilder<String> {
        let path = "/keys"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = keyUpdateModel.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<String>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**

     - parameter keyPath: (query)  
     - parameter revision: (query)  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getKey(keyPath keyPath: String, revision: String? = nil, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        getKeyWithRequestBuilder(keyPath: keyPath, revision: revision).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /keys     - BASIC:
       - type: http
       - name: bearerAuth
     - parameter keyPath: (query)  
     - parameter revision: (query)  (optional)

     - returns: RequestBuilder<AnyObject> 
     */
    public class func getKeyWithRequestBuilder(keyPath keyPath: String, revision: String? = nil) -> RequestBuilder<AnyObject> {
        let path = "/keys"
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "keyPath": keyPath,
            "revision": revision
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AnyObject>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**

     - parameter keyPath: (query)  
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter requestBody: (body)  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func keysDeleteKey(keyPath keyPath: String, authorName: String, authorEmail: String, requestBody: [String]? = nil, completion: ((data: String?, error: ErrorType?) -> Void)) {
        keysDeleteKeyWithRequestBuilder(keyPath: keyPath, authorName: authorName, authorEmail: authorEmail, requestBody: requestBody).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - DELETE /keys     - BASIC:
       - type: http
       - name: bearerAuth
     - parameter keyPath: (query)  
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter requestBody: (body)  (optional)

     - returns: RequestBuilder<String> 
     */
    public class func keysDeleteKeyWithRequestBuilder(keyPath keyPath: String, authorName: String, authorEmail: String, requestBody: [String]? = nil) -> RequestBuilder<String> {
        let path = "/keys"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = requestBody?.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<String>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

}
