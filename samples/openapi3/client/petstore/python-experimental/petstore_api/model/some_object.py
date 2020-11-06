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
    ComposedSchema,
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
    date,
    datetime,
)

def lazy_import():
    from petstore_api.model.object_interface import ObjectInterface
    globals()['ObjectInterface'] = ObjectInterface

class SomeObject(ComposedSchema):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
    _additional_properties (Schema): the definition used for additional properties
        that are not defined in _properties
    """

    @cached_property
    def _composed_schemas():
        # we need this here to make our import statements work
        # we must store _composed_schemas in here so the code is only run
        # when we invoke this method. If we kept this at the class
        # level we would get an error beause the class level
        # code would be run when this module is imported, and these composed
        # classes don't exist yet because their module has not finished
        # loading
        lazy_import()
        return {
          'anyOf': [
          ],
          'allOf': [
              ObjectInterface,
          ],
          'oneOf': [
          ],
        }
