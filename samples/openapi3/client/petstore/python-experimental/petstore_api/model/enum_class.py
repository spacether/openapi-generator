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



class EnumClass(StrSchema):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
    """
    _default_value = "-efg"

    _enum_info_by_value = {
        "_abc": ("_ABC", str),
        "-efg": ("EFG", str),
        "(xyz)": ("XYZ", str),
    }

    @class_property
    def _ABC(cls):
        return cls._enum_by_value["_abc"]._ABC

    @class_property
    def EFG(cls):
        return cls._enum_by_value["-efg"].EFG

    @class_property
    def XYZ(cls):
        return cls._enum_by_value["(xyz)"].XYZ

