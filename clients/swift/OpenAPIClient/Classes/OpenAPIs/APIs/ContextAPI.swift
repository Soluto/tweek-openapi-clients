//
// ContextAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Alamofire



public class ContextAPI: APIBase {
    /**

     - parameter identityType: (path) the type of the identity - for example user 
     - parameter identityId: (path) the identifier of the identity - for example jaime 
     - parameter prop: (path) the property to delete, for example age 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteContextProp(identityType identityType: String, identityId: String, prop: String, completion: ((error: ErrorType?) -> Void)) {
        deleteContextPropWithRequestBuilder(identityType: identityType, identityId: identityId, prop: prop).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - DELETE /context/{identityType}/{identityId}/{prop}
     - Delete identity context property     - BASIC:
       - type: http
       - name: bearerAuth
     - parameter identityType: (path) the type of the identity - for example user 
     - parameter identityId: (path) the identifier of the identity - for example jaime 
     - parameter prop: (path) the property to delete, for example age 

     - returns: RequestBuilder<Void> 
     */
    public class func deleteContextPropWithRequestBuilder(identityType identityType: String, identityId: String, prop: String) -> RequestBuilder<Void> {
        var path = "/context/{identityType}/{identityId}/{prop}"
        path = path.stringByReplacingOccurrencesOfString("{identityType}", withString: "\(identityType)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{identityId}", withString: "\(identityId)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{prop}", withString: "\(prop)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter identityType: (path) the type of the identity - for example user 
     - parameter identityId: (path) the identifier of the identity - for example jaime 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getContext(identityType identityType: String, identityId: String, completion: ((error: ErrorType?) -> Void)) {
        getContextWithRequestBuilder(identityType: identityType, identityId: identityId).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - GET /context/{identityType}/{identityId}
     - Get identity context     - BASIC:
       - type: http
       - name: bearerAuth
     - parameter identityType: (path) the type of the identity - for example user 
     - parameter identityId: (path) the identifier of the identity - for example jaime 

     - returns: RequestBuilder<Void> 
     */
    public class func getContextWithRequestBuilder(identityType identityType: String, identityId: String) -> RequestBuilder<Void> {
        var path = "/context/{identityType}/{identityId}"
        path = path.stringByReplacingOccurrencesOfString("{identityType}", withString: "\(identityType)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{identityId}", withString: "\(identityId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter identityType: (path) the type of the identity - for example user 
     - parameter identityId: (path) the identifier of the identity - for example jaime 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func saveContext(identityType identityType: String, identityId: String, completion: ((error: ErrorType?) -> Void)) {
        saveContextWithRequestBuilder(identityType: identityType, identityId: identityId).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - POST /context/{identityType}/{identityId}
     - Save identity context     - BASIC:
       - type: http
       - name: bearerAuth
     - parameter identityType: (path) the type of the identity - for example user 
     - parameter identityId: (path) the identifier of the identity - for example jaime 

     - returns: RequestBuilder<Void> 
     */
    public class func saveContextWithRequestBuilder(identityType identityType: String, identityId: String) -> RequestBuilder<Void> {
        var path = "/context/{identityType}/{identityId}"
        path = path.stringByReplacingOccurrencesOfString("{identityType}", withString: "\(identityType)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{identityId}", withString: "\(identityId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}
