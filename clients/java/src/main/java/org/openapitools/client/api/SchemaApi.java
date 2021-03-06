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


import org.openapitools.client.model.PatchOperation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchemaApi {
    private ApiClient apiClient;

    public SchemaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SchemaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteIdentity
     * @param identityType The type of the identity (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteIdentityCall(String identityType, String authorName, String authorEmail, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/schemas/{identityType}"
            .replaceAll("\\{" + "identityType" + "\\}", apiClient.escapeString(identityType.toString()));

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
            "text/html"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteIdentityValidateBeforeCall(String identityType, String authorName, String authorEmail, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identityType' is set
        if (identityType == null) {
            throw new ApiException("Missing the required parameter 'identityType' when calling deleteIdentity(Async)");
        }
        
        // verify the required parameter 'authorName' is set
        if (authorName == null) {
            throw new ApiException("Missing the required parameter 'authorName' when calling deleteIdentity(Async)");
        }
        
        // verify the required parameter 'authorEmail' is set
        if (authorEmail == null) {
            throw new ApiException("Missing the required parameter 'authorEmail' when calling deleteIdentity(Async)");
        }
        

        okhttp3.Call call = deleteIdentityCall(identityType, authorName, authorEmail, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Delete Schema
     * @param identityType The type of the identity (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String deleteIdentity(String identityType, String authorName, String authorEmail) throws ApiException {
        ApiResponse<String> resp = deleteIdentityWithHttpInfo(identityType, authorName, authorEmail);
        return resp.getData();
    }

    /**
     * 
     * Delete Schema
     * @param identityType The type of the identity (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> deleteIdentityWithHttpInfo(String identityType, String authorName, String authorEmail) throws ApiException {
        okhttp3.Call call = deleteIdentityValidateBeforeCall(identityType, authorName, authorEmail, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delete Schema
     * @param identityType The type of the identity (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteIdentityAsync(String identityType, String authorName, String authorEmail, final ApiCallback<String> callback) throws ApiException {

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

        okhttp3.Call call = deleteIdentityValidateBeforeCall(identityType, authorName, authorEmail, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSchemas
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getSchemasCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/schemas";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSchemasValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        okhttp3.Call call = getSchemasCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Get query
     * @return List&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Object> getSchemas() throws ApiException {
        ApiResponse<List<Object>> resp = getSchemasWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Get query
     * @return ApiResponse&lt;List&lt;Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Object>> getSchemasWithHttpInfo() throws ApiException {
        okhttp3.Call call = getSchemasValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get query
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getSchemasAsync(final ApiCallback<List<Object>> callback) throws ApiException {

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

        okhttp3.Call call = getSchemasValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for schemaAddIdentity
     * @param identityType  (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call schemaAddIdentityCall(String identityType, String authorName, String authorEmail, Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/schemas/{identityType}"
            .replaceAll("\\{" + "identityType" + "\\}", apiClient.escapeString(identityType.toString()));

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
            "text/html"
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
    private okhttp3.Call schemaAddIdentityValidateBeforeCall(String identityType, String authorName, String authorEmail, Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identityType' is set
        if (identityType == null) {
            throw new ApiException("Missing the required parameter 'identityType' when calling schemaAddIdentity(Async)");
        }
        
        // verify the required parameter 'authorName' is set
        if (authorName == null) {
            throw new ApiException("Missing the required parameter 'authorName' when calling schemaAddIdentity(Async)");
        }
        
        // verify the required parameter 'authorEmail' is set
        if (authorEmail == null) {
            throw new ApiException("Missing the required parameter 'authorEmail' when calling schemaAddIdentity(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling schemaAddIdentity(Async)");
        }
        

        okhttp3.Call call = schemaAddIdentityCall(identityType, authorName, authorEmail, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Add identity
     * @param identityType  (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param body  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String schemaAddIdentity(String identityType, String authorName, String authorEmail, Object body) throws ApiException {
        ApiResponse<String> resp = schemaAddIdentityWithHttpInfo(identityType, authorName, authorEmail, body);
        return resp.getData();
    }

    /**
     * 
     * Add identity
     * @param identityType  (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param body  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> schemaAddIdentityWithHttpInfo(String identityType, String authorName, String authorEmail, Object body) throws ApiException {
        okhttp3.Call call = schemaAddIdentityValidateBeforeCall(identityType, authorName, authorEmail, body, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add identity
     * @param identityType  (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call schemaAddIdentityAsync(String identityType, String authorName, String authorEmail, Object body, final ApiCallback<String> callback) throws ApiException {

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

        okhttp3.Call call = schemaAddIdentityValidateBeforeCall(identityType, authorName, authorEmail, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for schemaPatchIdentity
     * @param identityType  (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param patchOperation  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call schemaPatchIdentityCall(String identityType, String authorName, String authorEmail, List<PatchOperation> patchOperation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = patchOperation;

        // create path and map variables
        String localVarPath = "/schemas/{identityType}"
            .replaceAll("\\{" + "identityType" + "\\}", apiClient.escapeString(identityType.toString()));

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
            "text/html"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call schemaPatchIdentityValidateBeforeCall(String identityType, String authorName, String authorEmail, List<PatchOperation> patchOperation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identityType' is set
        if (identityType == null) {
            throw new ApiException("Missing the required parameter 'identityType' when calling schemaPatchIdentity(Async)");
        }
        
        // verify the required parameter 'authorName' is set
        if (authorName == null) {
            throw new ApiException("Missing the required parameter 'authorName' when calling schemaPatchIdentity(Async)");
        }
        
        // verify the required parameter 'authorEmail' is set
        if (authorEmail == null) {
            throw new ApiException("Missing the required parameter 'authorEmail' when calling schemaPatchIdentity(Async)");
        }
        
        // verify the required parameter 'patchOperation' is set
        if (patchOperation == null) {
            throw new ApiException("Missing the required parameter 'patchOperation' when calling schemaPatchIdentity(Async)");
        }
        

        okhttp3.Call call = schemaPatchIdentityCall(identityType, authorName, authorEmail, patchOperation, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Update identity
     * @param identityType  (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param patchOperation  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String schemaPatchIdentity(String identityType, String authorName, String authorEmail, List<PatchOperation> patchOperation) throws ApiException {
        ApiResponse<String> resp = schemaPatchIdentityWithHttpInfo(identityType, authorName, authorEmail, patchOperation);
        return resp.getData();
    }

    /**
     * 
     * Update identity
     * @param identityType  (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param patchOperation  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> schemaPatchIdentityWithHttpInfo(String identityType, String authorName, String authorEmail, List<PatchOperation> patchOperation) throws ApiException {
        okhttp3.Call call = schemaPatchIdentityValidateBeforeCall(identityType, authorName, authorEmail, patchOperation, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update identity
     * @param identityType  (required)
     * @param authorName  (required)
     * @param authorEmail  (required)
     * @param patchOperation  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call schemaPatchIdentityAsync(String identityType, String authorName, String authorEmail, List<PatchOperation> patchOperation, final ApiCallback<String> callback) throws ApiException {

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

        okhttp3.Call call = schemaPatchIdentityValidateBeforeCall(identityType, authorName, authorEmail, patchOperation, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
