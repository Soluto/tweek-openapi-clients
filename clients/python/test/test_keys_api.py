# coding: utf-8

"""
    Tweek

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    OpenAPI spec version: 0.1.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import openapi_client
from openapi_client.api.keys_api import KeysApi  # noqa: E501
from openapi_client.rest import ApiException


class TestKeysApi(unittest.TestCase):
    """KeysApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.keys_api.KeysApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_key(self):
        """Test case for create_key

        """
        pass

    def test_get_key(self):
        """Test case for get_key

        """
        pass

    def test_keys_delete_key(self):
        """Test case for keys_delete_key

        """
        pass


if __name__ == '__main__':
    unittest.main()