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
    AnyTypeSchema,
    DictSchema,
    ListSchema,
    StrSchema,
    IntSchema,
    FloatSchema,
    DateSchema,
    DateTimeSchema,
    BoolSchema,
    FileSchema,
    class_property,
    cached_property,
    isoparse,
    none_type,
)



class NoAdditionalProperties(DictSchema):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
    id (int,): 
    petId (int,): 
    """


    class id(IntSchema):
        _required = True

    petId = IntSchema

    _additional_properties = None
