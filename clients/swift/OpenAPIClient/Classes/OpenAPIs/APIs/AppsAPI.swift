//
// AppsAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Alamofire



public class AppsAPI: APIBase {
    /**

     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter appCreationRequestModel: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func appsCreateApp(authorName authorName: String, authorEmail: String, appCreationRequestModel: AppCreationRequestModel, completion: ((data: AppCreationResponseModel?, error: ErrorType?) -> Void)) {
        appsCreateAppWithRequestBuilder(authorName: authorName, authorEmail: authorEmail, appCreationRequestModel: appCreationRequestModel).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - POST /apps     - BASIC:
       - type: http
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "appId" : "appId",
  "appSecret" : "appSecret"
}, statusCode=200}]
     - parameter authorName: (query)  
     - parameter authorEmail: (query)  
     - parameter appCreationRequestModel: (body)  

     - returns: RequestBuilder<AppCreationResponseModel> 
     */
    public class func appsCreateAppWithRequestBuilder(authorName authorName: String, authorEmail: String, appCreationRequestModel: AppCreationRequestModel) -> RequestBuilder<AppCreationResponseModel> {
        let path = "/apps"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = appCreationRequestModel.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AppCreationResponseModel>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

}
