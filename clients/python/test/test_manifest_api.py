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
from openapi_client.api.manifest_api import ManifestApi  # noqa: E501
from openapi_client.rest import ApiException


class TestManifestApi(unittest.TestCase):
    """ManifestApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.manifest_api.ManifestApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_manifests(self):
        """Test case for get_manifests

        """
        pass


if __name__ == '__main__':
    unittest.main()