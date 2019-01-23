# coding: utf-8

"""
    Tweek

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    OpenAPI spec version: 0.1.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from openapi_client.api_client import ApiClient


class AppsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def apps_create_app(self, author_name, author_email, app_creation_request_model, **kwargs):  # noqa: E501
        """apps_create_app  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.apps_create_app(author_name, author_email, app_creation_request_model, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str author_name: (required)
        :param str author_email: (required)
        :param AppCreationRequestModel app_creation_request_model: (required)
        :return: AppCreationResponseModel
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.apps_create_app_with_http_info(author_name, author_email, app_creation_request_model, **kwargs)  # noqa: E501
        else:
            (data) = self.apps_create_app_with_http_info(author_name, author_email, app_creation_request_model, **kwargs)  # noqa: E501
            return data

    def apps_create_app_with_http_info(self, author_name, author_email, app_creation_request_model, **kwargs):  # noqa: E501
        """apps_create_app  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.apps_create_app_with_http_info(author_name, author_email, app_creation_request_model, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str author_name: (required)
        :param str author_email: (required)
        :param AppCreationRequestModel app_creation_request_model: (required)
        :return: AppCreationResponseModel
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['author_name', 'author_email', 'app_creation_request_model']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method apps_create_app" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'author_name' is set
        if ('author_name' not in local_var_params or
                local_var_params['author_name'] is None):
            raise ValueError("Missing the required parameter `author_name` when calling `apps_create_app`")  # noqa: E501
        # verify the required parameter 'author_email' is set
        if ('author_email' not in local_var_params or
                local_var_params['author_email'] is None):
            raise ValueError("Missing the required parameter `author_email` when calling `apps_create_app`")  # noqa: E501
        # verify the required parameter 'app_creation_request_model' is set
        if ('app_creation_request_model' not in local_var_params or
                local_var_params['app_creation_request_model'] is None):
            raise ValueError("Missing the required parameter `app_creation_request_model` when calling `apps_create_app`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'author_name' in local_var_params:
            query_params.append(('author.name', local_var_params['author_name']))  # noqa: E501
        if 'author_email' in local_var_params:
            query_params.append(('author.email', local_var_params['author_email']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'app_creation_request_model' in local_var_params:
            body_params = local_var_params['app_creation_request_model']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/apps', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='AppCreationResponseModel',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
