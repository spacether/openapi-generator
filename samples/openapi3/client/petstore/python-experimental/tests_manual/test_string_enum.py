# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import petstore_api
from petstore_api.model.string_enum import StringEnum


class TestStringEnum(unittest.TestCase):
    """StringEnum unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testStringEnum(self):
        """Test StringEnum"""
        inst = StringEnum(None)
        assert isinstance(inst, StringEnum)
        assert inst.value is None

        inst = StringEnum('approved')
        assert isinstance(inst, StringEnum)
        assert inst == "approved"

        with self.assertRaises(petstore_api.ApiValueError):
            StringEnum('garbage')

        # make sure that we can access its allowed_values
        assert StringEnum.NONE.value == None
        assert StringEnum.PLACED.value == "placed"
        assert StringEnum.APPROVED.value == "approved"
        assert StringEnum.DELIVERED.value == "delivered"
        assert StringEnum.DOUBLE_QUOTE_WITH_NEWLINE.value == "double quote \n with newline"
        assert StringEnum.MULTIPLE_LINES.value == "multiple\nlines"
        assert StringEnum.SINGLE_QUOTED.value == "single quoted"


if __name__ == '__main__':
    unittest.main()
