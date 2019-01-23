/*
 * Tweek
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.AppCreationRequestModel;
import org.openapitools.client.model.AppCreationResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppsApi {
    private ApiClient apiClient;

    public AppsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for appsCreateApp
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param appCreationRequestModel  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call appsCreateAppCall(String authorName, String authorEmail, AppCreationRequestModel appCreationRequestModel, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = appCreationRequestModel;

        // create path and map variables
        String localVarPath = "/apps";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (authorName != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("author.name", authorName));
        }

        if (authorEmail != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("author.email", authorEmail));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call appsCreateAppValidateBeforeCall(String authorName, String authorEmail, AppCreationRequestModel appCreationRequestModel, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorName' is set
        if (authorName == null) {
            throw new ApiException("Missing the required parameter 'authorName' when calling appsCreateApp(Async)");
        }
        
        // verify the required parameter 'authorEmail' is set
        if (authorEmail == null) {
            throw new ApiException("Missing the required parameter 'authorEmail' when calling appsCreateApp(Async)");
        }
        
        // verify the required parameter 'appCreationRequestModel' is set
        if (appCreationRequestModel == null) {
            throw new ApiException("Missing the required parameter 'appCreationRequestModel' when calling appsCreateApp(Async)");
        }
        

        okhttp3.Call call = appsCreateAppCall(authorName, authorEmail, appCreationRequestModel, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param appCreationRequestModel  (required)
     * @return AppCreationResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AppCreationResponseModel appsCreateApp(String authorName, String authorEmail, AppCreationRequestModel appCreationRequestModel) throws ApiException {
        ApiResponse<AppCreationResponseModel> resp = appsCreateAppWithHttpInfo(authorName, authorEmail, appCreationRequestModel);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param appCreationRequestModel  (required)
     * @return ApiResponse&lt;AppCreationResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AppCreationResponseModel> appsCreateAppWithHttpInfo(String authorName, String authorEmail, AppCreationRequestModel appCreationRequestModel) throws ApiException {
        okhttp3.Call call = appsCreateAppValidateBeforeCall(authorName, authorEmail, appCreationRequestModel, null, null);
        Type localVarReturnType = new TypeToken<AppCreationResponseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param appCreationRequestModel  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call appsCreateAppAsync(String authorName, String authorEmail, AppCreationRequestModel appCreationRequestModel, final ApiCallback<AppCreationResponseModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = appsCreateAppValidateBeforeCall(authorName, authorEmail, appCreationRequestModel, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AppCreationResponseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}