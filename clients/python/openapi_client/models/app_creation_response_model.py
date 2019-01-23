# coding: utf-8

"""
    Tweek

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    OpenAPI spec version: 0.1.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class AppCreationResponseModel(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'app_id': 'str',
        'app_secret': 'str'
    }

    attribute_map = {
        'app_id': 'appId',
        'app_secret': 'appSecret'
    }

    def __init__(self, app_id=None, app_secret=None):  # noqa: E501
        """AppCreationResponseModel - a model defined in OpenAPI"""  # noqa: E501

        self._app_id = None
        self._app_secret = None
        self.discriminator = None

        self.app_id = app_id
        self.app_secret = app_secret

    @property
    def app_id(self):
        """Gets the app_id of this AppCreationResponseModel.  # noqa: E501


        :return: The app_id of this AppCreationResponseModel.  # noqa: E501
        :rtype: str
        """
        return self._app_id

    @app_id.setter
    def app_id(self, app_id):
        """Sets the app_id of this AppCreationResponseModel.


        :param app_id: The app_id of this AppCreationResponseModel.  # noqa: E501
        :type: str
        """
        if app_id is None:
            raise ValueError("Invalid value for `app_id`, must not be `None`")  # noqa: E501

        self._app_id = app_id

    @property
    def app_secret(self):
        """Gets the app_secret of this AppCreationResponseModel.  # noqa: E501


        :return: The app_secret of this AppCreationResponseModel.  # noqa: E501
        :rtype: str
        """
        return self._app_secret

    @app_secret.setter
    def app_secret(self, app_secret):
        """Sets the app_secret of this AppCreationResponseModel.


        :param app_secret: The app_secret of this AppCreationResponseModel.  # noqa: E501
        :type: str
        """
        if app_secret is None:
            raise ValueError("Invalid value for `app_secret`, must not be `None`")  # noqa: E501

        self._app_secret = app_secret

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, AppCreationResponseModel):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
