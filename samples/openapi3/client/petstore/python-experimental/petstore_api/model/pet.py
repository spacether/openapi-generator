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
    from petstore_api.model.category import Category
    from petstore_api.model.tag import Tag
    globals()['Category'] = Category
    globals()['Tag'] = Tag



class Pet(DictSchema):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Pet object that needs to be added to the store

    Attributes:
    id (int,): 
    category (): 
    name (str,): 
    photoUrls (list,): 
    tags (list,): 
    status (str,): pet status in the store
    _additional_properties (Schema): the definition used for additional properties
        that are not defined in _properties
    """
    _required_property_names = {
        'name',
        'photoUrls',
    }
    id = IntSchema

    @cached_property
    def category():
        lazy_import()
        return Category
    name = StrSchema



    class photoUrls(ListSchema):
        _items = StrSchema




    class tags(ListSchema):

        @cached_property
        def _items():
            lazy_import()
            return Tag


    class status(StrSchema):

        _enum_name_by_value = {
            "available": "AVAILABLE",
            "pending": "PENDING",
            "sold": "SOLD",
        }

        @class_property
        def AVAILABLE(cls):
            return cls._enum_by_value["available"].AVAILABLE

        @class_property
        def PENDING(cls):
            return cls._enum_by_value["pending"].PENDING

        @class_property
        def SOLD(cls):
            return cls._enum_by_value["sold"].SOLD


