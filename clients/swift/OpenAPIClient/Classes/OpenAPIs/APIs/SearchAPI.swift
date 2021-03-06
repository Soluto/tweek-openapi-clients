//
// SearchAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Alamofire



public class SearchAPI: APIBase {
    /**

     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func search(completion: ((data: [AnyObject]?, error: ErrorType?) -> Void)) {
        searchWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /search
     - Search     - BASIC:
       - type: http
       - name: bearerAuth
     - examples: [{contentType=application/json, example="{}", statusCode=200}]

     - returns: RequestBuilder<[AnyObject]> 
     */
    public class func searchWithRequestBuilder() -> RequestBuilder<[AnyObject]> {
        let path = "/search"
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[AnyObject]>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}
