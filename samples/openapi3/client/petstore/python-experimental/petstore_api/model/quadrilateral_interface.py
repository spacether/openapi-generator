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



class QuadrilateralInterface(DictSchema):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
    shapeType (str,): 
    quadrilateralType (str,): 
    _additional_properties (Schema): the definition used for additional properties
        that are not defined in _properties
    """
    _required_property_names = {
        'shapeType',
        'quadrilateralType',
    }


    class shapeType(StrSchema):

        _enum_name_by_value = {
            "Quadrilateral": "QUADRILATERAL",
        }

        @class_property
        def QUADRILATERAL(cls):
            return cls._enum_by_value["Quadrilateral"].QUADRILATERAL

    quadrilateralType = StrSchema

