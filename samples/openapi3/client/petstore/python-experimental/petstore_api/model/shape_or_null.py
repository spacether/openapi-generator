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
    ComposedSchema,
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
    date,
    datetime,
    _get_discriminated_class_helper,
)

def lazy_import():
    from petstore_api.model.quadrilateral import Quadrilateral
    from petstore_api.model.triangle import Triangle
    globals()['Quadrilateral'] = Quadrilateral
    globals()['Triangle'] = Triangle

class ShapeOrNull(ComposedSchema):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    The value may be a shape or the 'null' value. This is introduced in OAS schema >= 3.1.

    Attributes:
    shapeType (str,): 
    quadrilateralType (str,): 
    _additional_properties (Schema): the definition used for additional properties
        that are not defined in _properties
    _discriminator(cls) -> dict: the key is the required discriminator propertyName
        the value is a dict mapping from a string name to the corresponding Schema class
    """
    @classmethod
    def _get_discriminated_class(cls, _disc_property_name=None, **kwargs):
        return _get_discriminated_class_helper(
            _disc_property_name, __class__._discriminator, super(), **kwargs)

    @cached_property
    def _discriminator():
        lazy_import()
        return {
            'shapeType': {
                'Quadrilateral': Quadrilateral,
                'Triangle': Triangle,
            }
        }

    @cached_property
    def _composed_schemas():
        # we need this here to make our import statements work
        # we must store _composed_schemas in here so the code is only run
        # when we invoke this method. If we kept this at the class
        # level we would get an error because the class level
        # code would be run when this module is imported, and these composed
        # classes don't exist yet because their module has not finished
        # loading
        lazy_import()
        oneOf_0 = NoneSchema
        return {
            'allOf': [
            ],
            'oneOf': [
                oneOf_0,
                Triangle,
                Quadrilateral,
            ],
            'anyOf': [
            ],
        }
