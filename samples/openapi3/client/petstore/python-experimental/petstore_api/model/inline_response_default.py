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
    AnyTypeSchema,
    DictSchema,
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
    _get_discriminated_class_helper,
)

def lazy_import():
    from petstore_api.model.foo import Foo
    globals()['Foo'] = Foo



class InlineResponseDefault(DictSchema):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
    string (): 
    _additional_properties (Schema): the definition used for additional properties
        that are not defined in _properties
    """

    @cached_property
    def string():
        lazy_import()
        return Foo

