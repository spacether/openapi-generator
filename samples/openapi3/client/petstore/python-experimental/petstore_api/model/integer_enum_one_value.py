# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

import nulltype  # noqa: F401

from petstore_api.model_utils import (  # noqa: F401
    ApiTypeError,
    Enum,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    get_inheritance_chain_vars,
    get_new_instance,
    file_type,
    mfg_new_class,
    none_type,
    validate_get_composed_info,
)



class IntegerEnumOneValue(ModelSimple, int, Enum):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    POSITIVE_0 = 0

    @cached_property
    def validations():
        # this must be a method so it will exist in our enum class in __new__
        return {
        }

    @cached_property
    def _nullable():
        # this must be a method, otherwise it will be set as an enum member
        return False


    @cached_property
    def openapi_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_type (tuple): the accepted types
        """
        return (int,)

    def __new__(cls, *args, **kwargs):
        """IntegerEnumOneValue - a model defined in OpenAPI

        Args:
            arg (int): defaults to 0, must be one of [0, ]  # noqa: E501
        """
        if not args:
            args = (0,)
        return super().__new__(cls, *args, **kwargs)

