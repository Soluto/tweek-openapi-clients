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


class ContextApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_context_prop(self, identity_type, identity_id, prop, **kwargs):  # noqa: E501
        """delete_context_prop  # noqa: E501

        Delete identity context property  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_context_prop(identity_type, identity_id, prop, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str identity_type: the type of the identity - for example user (required)
        :param str identity_id: the identifier of the identity - for example jaime (required)
        :param str prop: the property to delete, for example age (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_context_prop_with_http_info(identity_type, identity_id, prop, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_context_prop_with_http_info(identity_type, identity_id, prop, **kwargs)  # noqa: E501
            return data

    def delete_context_prop_with_http_info(self, identity_type, identity_id, prop, **kwargs):  # noqa: E501
        """delete_context_prop  # noqa: E501

        Delete identity context property  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_context_prop_with_http_info(identity_type, identity_id, prop, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str identity_type: the type of the identity - for example user (required)
        :param str identity_id: the identifier of the identity - for example jaime (required)
        :param str prop: the property to delete, for example age (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['identity_type', 'identity_id', 'prop']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_context_prop" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'identity_type' is set
        if ('identity_type' not in local_var_params or
                local_var_params['identity_type'] is None):
            raise ValueError("Missing the required parameter `identity_type` when calling `delete_context_prop`")  # noqa: E501
        # verify the required parameter 'identity_id' is set
        if ('identity_id' not in local_var_params or
                local_var_params['identity_id'] is None):
            raise ValueError("Missing the required parameter `identity_id` when calling `delete_context_prop`")  # noqa: E501
        # verify the required parameter 'prop' is set
        if ('prop' not in local_var_params or
                local_var_params['prop'] is None):
            raise ValueError("Missing the required parameter `prop` when calling `delete_context_prop`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'identity_type' in local_var_params:
            path_params['identityType'] = local_var_params['identity_type']  # noqa: E501
        if 'identity_id' in local_var_params:
            path_params['identityId'] = local_var_params['identity_id']  # noqa: E501
        if 'prop' in local_var_params:
            path_params['prop'] = local_var_params['prop']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/context/{identityType}/{identityId}/{prop}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_context(self, identity_type, identity_id, **kwargs):  # noqa: E501
        """get_context  # noqa: E501

        Get identity context  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_context(identity_type, identity_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str identity_type: the type of the identity - for example user (required)
        :param str identity_id: the identifier of the identity - for example jaime (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_context_with_http_info(identity_type, identity_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_context_with_http_info(identity_type, identity_id, **kwargs)  # noqa: E501
            return data

    def get_context_with_http_info(self, identity_type, identity_id, **kwargs):  # noqa: E501
        """get_context  # noqa: E501

        Get identity context  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_context_with_http_info(identity_type, identity_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str identity_type: the type of the identity - for example user (required)
        :param str identity_id: the identifier of the identity - for example jaime (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['identity_type', 'identity_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_context" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'identity_type' is set
        if ('identity_type' not in local_var_params or
                local_var_params['identity_type'] is None):
            raise ValueError("Missing the required parameter `identity_type` when calling `get_context`")  # noqa: E501
        # verify the required parameter 'identity_id' is set
        if ('identity_id' not in local_var_params or
                local_var_params['identity_id'] is None):
            raise ValueError("Missing the required parameter `identity_id` when calling `get_context`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'identity_type' in local_var_params:
            path_params['identityType'] = local_var_params['identity_type']  # noqa: E501
        if 'identity_id' in local_var_params:
            path_params['identityId'] = local_var_params['identity_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/context/{identityType}/{identityId}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def save_context(self, identity_type, identity_id, **kwargs):  # noqa: E501
        """save_context  # noqa: E501

        Save identity context  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.save_context(identity_type, identity_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str identity_type: the type of the identity - for example user (required)
        :param str identity_id: the identifier of the identity - for example jaime (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.save_context_with_http_info(identity_type, identity_id, **kwargs)  # noqa: E501
        else:
            (data) = self.save_context_with_http_info(identity_type, identity_id, **kwargs)  # noqa: E501
            return data

    def save_context_with_http_info(self, identity_type, identity_id, **kwargs):  # noqa: E501
        """save_context  # noqa: E501

        Save identity context  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.save_context_with_http_info(identity_type, identity_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str identity_type: the type of the identity - for example user (required)
        :param str identity_id: the identifier of the identity - for example jaime (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['identity_type', 'identity_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method save_context" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'identity_type' is set
        if ('identity_type' not in local_var_params or
                local_var_params['identity_type'] is None):
            raise ValueError("Missing the required parameter `identity_type` when calling `save_context`")  # noqa: E501
        # verify the required parameter 'identity_id' is set
        if ('identity_id' not in local_var_params or
                local_var_params['identity_id'] is None):
            raise ValueError("Missing the required parameter `identity_id` when calling `save_context`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'identity_type' in local_var_params:
            path_params['identityType'] = local_var_params['identity_type']  # noqa: E501
        if 'identity_id' in local_var_params:
            path_params['identityId'] = local_var_params['identity_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/context/{identityType}/{identityId}', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)