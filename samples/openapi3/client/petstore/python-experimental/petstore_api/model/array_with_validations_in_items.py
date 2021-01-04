# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from petstore_api.model_utils import (  # noqa: F401
    ListSchema,
    StrSchema,
    IntSchema,
    FloatSchema,
    IntOrFloatSchema,
    DateSchema,
    DateTimeSchema,
    BoolSchema,
    FileSchema,
    NoneSchema,
    class_property,
    cached_property,
    isoparse,
    none_type,
)




class ArrayWithValidationsInItems(ListSchema):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
    _items (Schema): the schema definition of the array items
    _validations (dict): the validations which apply to the current Schema
         The value is a dict that stores validations for max_length, min_length, max_items,
         min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
         inclusive_minimum, and regex.
    """
    _validations = {
        'max_items': 2,
    }


    class _items(IntSchema):
        _validations = {
            'inclusive_maximum': 7,
        }

