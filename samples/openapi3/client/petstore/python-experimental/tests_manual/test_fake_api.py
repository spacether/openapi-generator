# # coding: utf-8
#
# """
#     OpenAPI Petstore
#
#     This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
#
#     The version of the OpenAPI document: 1.0.0
#     Generated by: https://openapi-generator.tech
# """
#
# import sys
# from collections import namedtuple
# import unittest
# import json
# from unittest.mock import patch
#
# import petstore_api
# from petstore_api.api.fake_api import FakeApi  # noqa: E501
# from petstore_api.rest import RESTClientObject, RESTResponse
#
# HTTPResponse = namedtuple(
#     'urllib3_response_HTTPResponse',
#     ['status', 'reason', 'data', 'getheaders', 'getheader']
# )
#
# headers = {'Content-Type': 'application/json'}
# def get_headers():
#     return {}
# def get_header(name, default=None):
#     return {}.get(name, default)
#
#
# class TestFakeApi(unittest.TestCase):
#     """FakeApi unit test stubs"""
#
#     def setUp(self):
#         self.api = FakeApi()  # noqa: E501
#
#     def tearDown(self):
#         pass
#
#     @staticmethod
#     def mock_response(body_value):
#         http_response = HTTPResponse(
#             status=200,
#             reason='OK',
#             data=json.dumps(body_value).encode('utf-8'),
#             getheaders=get_headers,
#             getheader=get_header
#         )
#         return RESTResponse(http_response)
#
#     @staticmethod
#     def assert_request_called_with(mock_method, url, value):
#         mock_method.assert_called_with(
#             'POST',
#             url,
#             _preload_content=True,
#             _request_timeout=None,
#             body=value,
#             headers={
#                 'Accept': 'application/json',
#                 'User-Agent': 'OpenAPI-Generator/1.0.0/python',
#                 'Content-Type': 'application/json'
#             },
#             post_params=[],
#             query_params=[]
#         )
#
#
#     def test_array_model(self):
#         """Test case for array_model
#
#         """
#         from petstore_api.model import animal_farm, animal
#         endpoint = self.api.array_model
#         assert endpoint.openapi_types['body'] == (animal_farm.AnimalFarm,)
#         assert endpoint.settings['response_type'] == (animal_farm.AnimalFarm,)
#
#         # serialization + deserialization works
#         with patch.object(RESTClientObject, 'request') as mock_method:
#             cat = animal.Animal(class_name="Cat", color="black")
#             body = animal_farm.AnimalFarm([cat])
#             json_data = [{"className": "Cat", "color": "black"}]
#             mock_method.return_value = self.mock_response(json_data)
#
#             response = endpoint(body=body)
#             self.assert_request_called_with(mock_method, 'http://petstore.swagger.io:80/v2/fake/refs/arraymodel', json_data)
#
#             assert isinstance(response, animal_farm.AnimalFarm)
#             assert response == body
#
#     def test_boolean(self):
#         """Test case for boolean
#
#         """
#         endpoint = self.api.boolean
#         assert endpoint.openapi_types['body'] == (bool,)
#         assert endpoint.settings['response_type'] == (bool,)
#
#     def test_recursionlimit(self):
#         """Test case for recursionlimit
#
#         """
#         assert sys.getrecursionlimit() == 1234
#
#     def test_fake_health_get(self):
#         """Test case for fake_health_get
#
#         Health check endpoint  # noqa: E501
#         """
#         pass
#
#     def test_additional_properties_with_array_of_enums(self):
#         """Test case for additional_properties_with_array_of_enums
#
#         Additional Properties with Array of Enums  # noqa: E501
#         """
#         pass
#
#     def test_array_of_enums(self):
#         """Test case for array_of_enums
#
#         Array of Enums  # noqa: E501
#         """
#         from petstore_api.model import array_of_enums, string_enum
#         endpoint = self.api.array_of_enums
#         assert endpoint.openapi_types['array_of_enums'] == (array_of_enums.ArrayOfEnums,)
#         assert endpoint.settings['response_type'] == (array_of_enums.ArrayOfEnums,)
#
#         # serialization + deserialization works
#         with patch.object(RESTClientObject, 'request') as mock_method:
#             value = [string_enum.StringEnum("placed")]
#             body = array_of_enums.ArrayOfEnums(value)
#             value_simple = ["placed"]
#             mock_method.return_value = self.mock_response(value_simple)
#
#             response = endpoint(array_of_enums=body)
#             self.assert_request_called_with(mock_method, 'http://petstore.swagger.io:80/v2/fake/refs/array-of-enums', value_simple)
#
#             assert isinstance(response, array_of_enums.ArrayOfEnums)
#             assert response == value
#
#     def test_number_with_validations(self):
#         """Test case for number_with_validations
#
#         """
#         from petstore_api.model import number_with_validations
#         endpoint = self.api.number_with_validations
#         assert endpoint.openapi_types['body'] == (number_with_validations.NumberWithValidations,)
#         assert endpoint.settings['response_type'] == (number_with_validations.NumberWithValidations,)
#
#         # serialization + deserialization works
#         with patch.object(RESTClientObject, 'request') as mock_method:
#             value = 10.0
#             body = number_with_validations.NumberWithValidations(value)
#             mock_method.return_value = self.mock_response(value)
#
#             response = endpoint(body=body)
#             self.assert_request_called_with(mock_method, 'http://petstore.swagger.io:80/v2/fake/refs/number', value)
#
#             assert isinstance(response, number_with_validations.NumberWithValidations)
#             assert response == value
#
#     def test_object_model_with_ref_props(self):
#         """Test case for object_model_with_ref_props
#
#         """
#         from petstore_api.model import object_model_with_ref_props
#         endpoint = self.api.object_model_with_ref_props
#         assert endpoint.openapi_types['body'] == (object_model_with_ref_props.ObjectModelWithRefProps,)
#         assert endpoint.settings['response_type'] == (object_model_with_ref_props.ObjectModelWithRefProps,)
#
#     def test_composed_one_of_number_with_validations(self):
#         """Test case for composed_one_of_number_with_validations
#
#         """
#         from petstore_api.model import animal, composed_one_of_number_with_validations, number_with_validations
#         endpoint = self.api.composed_one_of_number_with_validations
#         assert endpoint.openapi_types['composed_one_of_number_with_validations'] == (
#             composed_one_of_number_with_validations.ComposedOneOfNumberWithValidations,)
#         assert endpoint.settings['response_type'] == (
#             composed_one_of_number_with_validations.ComposedOneOfNumberWithValidations,)
#
#         # serialization + deserialization works
#         num_with_validations = number_with_validations.NumberWithValidations(10.0)
#         cat_in_composed = composed_one_of_number_with_validations.ComposedOneOfNumberWithValidations(
#             class_name="Cat", color="black"
#         )
#         import datetime
#         date = datetime.date(1970, 1, 1)
#         body_value_simple = [
#             (num_with_validations, 10.0),
#             (cat_in_composed, {"className": "Cat", "color": "black"}),
#             (None, None),
#             (date, '1970-01-01'),
#         ]
#         for (body, value_simple) in body_value_simple:
#             with patch.object(RESTClientObject, 'request') as mock_method:
#                 mock_method.return_value = self.mock_response(value_simple)
#
#                 response = endpoint(composed_one_of_number_with_validations=body)
#                 self.assert_request_called_with(
#                     mock_method,
#                     'http://petstore.swagger.io:80/v2/fake/refs/composed_one_of_number_with_validations',
#                     value_simple
#                 )
#
#                 assert isinstance(response, body.__class__)
#                 assert response == body
#
#     def test_string(self):
#         """Test case for string
#
#         """
#         endpoint = self.api.string
#         assert endpoint.openapi_types['body'] == (str,)
#         assert endpoint.settings['response_type'] == (str,)
#
#         # serialization + deserialization works
#         with patch.object(RESTClientObject, 'request') as mock_method:
#             body = "blah"
#             value_simple = body
#             mock_method.return_value = self.mock_response(value_simple)
#
#             response = endpoint(body=body)
#             self.assert_request_called_with(mock_method, 'http://petstore.swagger.io:80/v2/fake/refs/string', value_simple)
#
#             assert isinstance(response, str)
#             assert response == value_simple
#
#     def test_string_enum(self):
#         """Test case for string_enum
#
#         """
#         from petstore_api.model import string_enum
#         endpoint = self.api.string_enum
#         assert endpoint.openapi_types['body'] == (string_enum.StringEnum,)
#         assert endpoint.settings['response_type'] == (string_enum.StringEnum,)
#
#         # serialization + deserialization works
#         from petstore_api.rest import RESTClientObject, RESTResponse
#         with patch.object(RESTClientObject, 'request') as mock_method:
#             value = "placed"
#             body = string_enum.StringEnum(value)
#             mock_method.return_value = self.mock_response(value)
#
#             response = endpoint(body=body)
#             self.assert_request_called_with(mock_method, 'http://petstore.swagger.io:80/v2/fake/refs/enum', value)
#
#             assert isinstance(response, string_enum.StringEnum)
#             assert response == value
#
#     def test_test_body_with_file_schema(self):
#         """Test case for test_body_with_file_schema
#
#         """
#         pass
#
#     def test_test_body_with_query_params(self):
#         """Test case for test_body_with_query_params
#
#         """
#         pass
#
#     def test_test_client_model(self):
#         """Test case for test_client_model
#
#         To test \"client\" model  # noqa: E501
#         """
#         pass
#
#     def test_test_endpoint_parameters(self):
#         """Test case for test_endpoint_parameters
#
#         Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트   # noqa: E501
#         """
#         pass
#
#     def test_test_enum_parameters(self):
#         """Test case for test_enum_parameters
#
#         To test enum parameters  # noqa: E501
#         """
#         pass
#
#     def test_test_group_parameters(self):
#         """Test case for test_group_parameters
#
#         Fake endpoint to test group parameters (optional)  # noqa: E501
#         """
#         pass
#
#     def test_test_inline_additional_properties(self):
#         """Test case for test_inline_additional_properties
#
#         test inline additionalProperties  # noqa: E501
#         """
#         pass
#
#     def test_test_json_form_data(self):
#         """Test case for test_json_form_data
#
#         test json serialization of form data  # noqa: E501
#         """
#         pass
#
#     def test_test_query_parameter_collection_format(self):
#         """Test case for test_query_parameter_collection_format
#
#         """
#         pass
#
#
# if __name__ == '__main__':
#     unittest.main()
