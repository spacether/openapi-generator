/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen;

import java.util.*;

/**
 * Describes a single operation parameter in the OAS specification.
 * A unique parameter is defined by a combination of a name and location.
 * Parameters may be located in a path, query, header or cookie.
 */
public class CodegenParameter implements IJsonSchemaValidationProperties {
    public boolean isFormParam, isQueryParam, isPathParam, isHeaderParam,
            isCookieParam, isBodyParam, hasMore, isContainer,
            secondaryParam, isCollectionFormatMulti, isPrimitiveType, isModel, isExplode;
    public String baseName, paramName, dataType, datatypeWithEnum, dataFormat, contentType,
            collectionFormat, description, unescapedDescription, baseType, defaultValue, enumName, style;

    public String nameInLowerCase; // property name in lower case
    public String example; // example value (x-example)
    public String jsonSchema;
    public String indent;
    public boolean isString, isNumeric, isInteger, isLong, isNumber, isFloat, isDouble, isDecimal, isByteArray, isBinary,
            isBoolean, isDate, isDateTime, isUuid, isUri, isEmail, isFreeFormObject, isAnyType;
    public boolean isArray, isMap;
    public boolean isFile;
    public boolean isEnum;
    public List<String> _enum;
    public Map<String, Object> allowableValues;
    public CodegenProperty items;
    public CodegenProperty additionalProperties;
    public List<CodegenProperty> vars = new ArrayList<CodegenProperty>(); // all properties (without parent's properties)
    public List<CodegenProperty> requiredVars = new ArrayList<CodegenProperty>();
    public CodegenProperty mostInnerItems;
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    public boolean hasValidation;
    public boolean isNullable;
    /**
     * Determines whether this parameter is mandatory. If the parameter is in "path",
     * this property is required and its value MUST be true. Otherwise, the property
     * MAY be included and its default value is false.
     */
    public boolean required;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor17.
     */
    public String maximum;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor17
     */
    public boolean exclusiveMaximum;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor21
     */
    public String minimum;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor21
     */
    public boolean exclusiveMinimum;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor26
     */
    public Integer maxLength;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor29
     */
    public Integer minLength;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor33
     */
    public String pattern;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor42
     */
    public Integer maxItems;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor45
     */
    public Integer minItems;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor49
     */
    public boolean uniqueItems;
    /**
     * See http://json-schema.org/latest/json-schema-validation.html#anchor14
     */
    public Number multipleOf;
    private Integer maxProperties;
    private Integer minProperties;

    public CodegenParameter copy() {
        CodegenParameter output = new CodegenParameter();
        output.isFile = this.isFile;
        output.hasMore = this.hasMore;
        output.isContainer = this.isContainer;
        output.secondaryParam = this.secondaryParam;
        output.baseName = this.baseName;
        output.paramName = this.paramName;
        output.dataType = this.dataType;
        output.datatypeWithEnum = this.datatypeWithEnum;
        output.enumName = this.enumName;
        output.dataFormat = this.dataFormat;
        output.collectionFormat = this.collectionFormat;
        output.isCollectionFormatMulti = this.isCollectionFormatMulti;
        output.isPrimitiveType = this.isPrimitiveType;
        output.isModel = this.isModel;
        output.description = this.description;
        output.unescapedDescription = this.unescapedDescription;
        output.baseType = this.baseType;
        output.isFormParam = this.isFormParam;
        output.isQueryParam = this.isQueryParam;
        output.isPathParam = this.isPathParam;
        output.isHeaderParam = this.isHeaderParam;
        output.isCookieParam = this.isCookieParam;
        output.isBodyParam = this.isBodyParam;
        output.required = this.required;
        output.maximum = this.maximum;
        output.exclusiveMaximum = this.exclusiveMaximum;
        output.minimum = this.minimum;
        output.exclusiveMinimum = this.exclusiveMinimum;
        output.maxLength = this.maxLength;
        output.minLength = this.minLength;
        output.pattern = this.pattern;
        output.maxItems = this.maxItems;
        output.minItems = this.minItems;
        output.uniqueItems = this.uniqueItems;
        output.multipleOf = this.multipleOf;
        output.jsonSchema = this.jsonSchema;
        output.defaultValue = this.defaultValue;
        output.example = this.example;
        output.isEnum = this.isEnum;
        output.maxProperties = this.maxProperties;
        output.minProperties = this.minProperties;
        output.maximum = this.maximum;
        output.minimum = this.minimum;
        output.pattern = this.pattern;
        output.additionalProperties = this.additionalProperties;
        output.indent = this.indent;

        if (this._enum != null) {
            output._enum = new ArrayList<String>(this._enum);
        }
        if (this.allowableValues != null) {
            output.allowableValues = new HashMap<String, Object>(this.allowableValues);
        }
        if (this.items != null) {
            output.items = this.items;
        }
        if (this.vars != null) {
            output.vars = this.vars;
        }
        if (this.requiredVars != null) {
            output.requiredVars = this.requiredVars;
        }
        if (this.mostInnerItems != null) {
            output.mostInnerItems = this.mostInnerItems;
        }
        if (this.vendorExtensions != null) {
            output.vendorExtensions = new HashMap<String, Object>(this.vendorExtensions);
        }
        output.hasValidation = this.hasValidation;
        output.isNullable = this.isNullable;
        output.isBinary = this.isBinary;
        output.isByteArray = this.isByteArray;
        output.isString = this.isString;
        output.isNumeric = this.isNumeric;
        output.isInteger = this.isInteger;
        output.isLong = this.isLong;
        output.isDouble = this.isDouble;
        output.isDecimal = this.isDecimal;
        output.isFloat = this.isFloat;
        output.isNumber = this.isNumber;
        output.isBoolean = this.isBoolean;
        output.isDate = this.isDate;
        output.isDateTime = this.isDateTime;
        output.isUuid = this.isUuid;
        output.isUri = this.isUri;
        output.isEmail = this.isEmail;
        output.isFreeFormObject = this.isFreeFormObject;
        output.isAnyType = this.isAnyType;
        output.isArray = this.isArray;
        output.isMap = this.isMap;
        output.isExplode = this.isExplode;
        output.style = this.style;
        output.contentType = this.contentType;

        return output;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFormParam, isQueryParam, isPathParam, isHeaderParam, isCookieParam, isBodyParam, hasMore, isContainer, secondaryParam, isCollectionFormatMulti, isPrimitiveType, isModel, isExplode, baseName, paramName, dataType, datatypeWithEnum, dataFormat, collectionFormat, description, unescapedDescription, baseType, defaultValue, enumName, style, example, jsonSchema, isString, isNumeric, isInteger, isLong, isNumber, isFloat, isDouble, isDecimal, isByteArray, isBinary, isBoolean, isDate, isDateTime, isUuid, isUri, isEmail, isFreeFormObject, isAnyType, isArray, isMap, isFile, isEnum, _enum, allowableValues, items, mostInnerItems, additionalProperties, vars, requiredVars, vendorExtensions, hasValidation, getMaxProperties(), getMinProperties(), isNullable, required, getMaximum(), getExclusiveMaximum(), getMinimum(), getExclusiveMinimum(), getMaxLength(), getMinLength(), getPattern(), getMaxItems(), getMinItems(), getUniqueItems(), contentType, multipleOf, indent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenParameter)) return false;
        CodegenParameter that = (CodegenParameter) o;
        return isFormParam == that.isFormParam &&
                isQueryParam == that.isQueryParam &&
                isPathParam == that.isPathParam &&
                isHeaderParam == that.isHeaderParam &&
                isCookieParam == that.isCookieParam &&
                isBodyParam == that.isBodyParam &&
                hasMore == that.hasMore &&
                isContainer == that.isContainer &&
                secondaryParam == that.secondaryParam &&
                isCollectionFormatMulti == that.isCollectionFormatMulti &&
                isPrimitiveType == that.isPrimitiveType &&
                isModel == that.isModel &&
                isExplode == that.isExplode &&
                isString == that.isString &&
                isNumeric == that.isNumeric &&
                isInteger == that.isInteger &&
                isLong == that.isLong &&
                isNumber == that.isNumber &&
                isFloat == that.isFloat &&
                isDouble == that.isDouble &&
                isDecimal == that.isDecimal &&
                isByteArray == that.isByteArray &&
                isBinary == that.isBinary &&
                isBoolean == that.isBoolean &&
                isDate == that.isDate &&
                isDateTime == that.isDateTime &&
                isUuid == that.isUuid &&
                isUri == that.isUri &&
                isEmail == that.isEmail &&
                isFreeFormObject == that.isFreeFormObject &&
                isAnyType == that.isAnyType &&
                isArray == that.isArray &&
                isMap == that.isMap &&
                isFile == that.isFile &&
                isEnum == that.isEnum &&
                hasValidation == that.hasValidation &&
                isNullable == that.isNullable &&
                required == that.required &&
                getExclusiveMaximum() == that.getExclusiveMaximum() &&
                getExclusiveMinimum() == that.getExclusiveMinimum() &&
                getUniqueItems() == that.getUniqueItems() &&
                Objects.equals(indent, that.indent) &&
                Objects.equals(baseName, that.baseName) &&
                Objects.equals(paramName, that.paramName) &&
                Objects.equals(dataType, that.dataType) &&
                Objects.equals(datatypeWithEnum, that.datatypeWithEnum) &&
                Objects.equals(dataFormat, that.dataFormat) &&
                Objects.equals(collectionFormat, that.collectionFormat) &&
                Objects.equals(description, that.description) &&
                Objects.equals(unescapedDescription, that.unescapedDescription) &&
                Objects.equals(baseType, that.baseType) &&
                Objects.equals(defaultValue, that.defaultValue) &&
                Objects.equals(enumName, that.enumName) &&
                Objects.equals(style, that.style) &&
                Objects.equals(example, that.example) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(_enum, that._enum) &&
                Objects.equals(allowableValues, that.allowableValues) &&
                Objects.equals(items, that.items) &&
                Objects.equals(additionalProperties, that.additionalProperties) &&
                Objects.equals(vars, that.vars) &&
                Objects.equals(requiredVars, that.requiredVars) &&
                Objects.equals(mostInnerItems, that.mostInnerItems) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(getMaxProperties(), that.getMaxProperties()) &&
                Objects.equals(getMinProperties(), that.getMinProperties()) &&
                Objects.equals(getMaximum(), that.getMaximum()) &&
                Objects.equals(getMinimum(), that.getMinimum()) &&
                Objects.equals(getMaxLength(), that.getMaxLength()) &&
                Objects.equals(getMinLength(), that.getMinLength()) &&
                Objects.equals(getPattern(), that.getPattern()) &&
                Objects.equals(getMaxItems(), that.getMaxItems()) &&
                Objects.equals(getMinItems(), that.getMinItems()) &&
                Objects.equals(contentType, that.contentType) &&
                Objects.equals(multipleOf, that.multipleOf);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenParameter{");
        sb.append("isFormParam=").append(isFormParam);
        sb.append(", isQueryParam=").append(isQueryParam);
        sb.append(", isPathParam=").append(isPathParam);
        sb.append(", isHeaderParam=").append(isHeaderParam);
        sb.append(", isCookieParam=").append(isCookieParam);
        sb.append(", isBodyParam=").append(isBodyParam);
        sb.append(", hasMore=").append(hasMore);
        sb.append(", isContainer=").append(isContainer);
        sb.append(", secondaryParam=").append(secondaryParam);
        sb.append(", isCollectionFormatMulti=").append(isCollectionFormatMulti);
        sb.append(", isPrimitiveType=").append(isPrimitiveType);
        sb.append(", isModel=").append(isModel);
        sb.append(", isExplode=").append(isExplode);
        sb.append(", baseName='").append(baseName).append('\'');
        sb.append(", paramName='").append(paramName).append('\'');
        sb.append(", dataType='").append(dataType).append('\'');
        sb.append(", datatypeWithEnum='").append(datatypeWithEnum).append('\'');
        sb.append(", dataFormat='").append(dataFormat).append('\'');
        sb.append(", collectionFormat='").append(collectionFormat).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
        sb.append(", baseType='").append(baseType).append('\'');
        sb.append(", defaultValue='").append(defaultValue).append('\'');
        sb.append(", enumName='").append(enumName).append('\'');
        sb.append(", style='").append(style).append('\'');
        sb.append(", example='").append(example).append('\'');
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", isString=").append(isString);
        sb.append(", isNumeric=").append(isNumeric);
        sb.append(", isInteger=").append(isInteger);
        sb.append(", isLong=").append(isLong);
        sb.append(", isNumber=").append(isNumber);
        sb.append(", isFloat=").append(isFloat);
        sb.append(", isDouble=").append(isDouble);
        sb.append(", isDecimal=").append(isDecimal);
        sb.append(", isByteArray=").append(isByteArray);
        sb.append(", isBinary=").append(isBinary);
        sb.append(", isBoolean=").append(isBoolean);
        sb.append(", isDate=").append(isDate);
        sb.append(", isDateTime=").append(isDateTime);
        sb.append(", isUuid=").append(isUuid);
        sb.append(", isUri=").append(isUri);
        sb.append(", isEmail=").append(isEmail);
        sb.append(", isFreeFormObject=").append(isFreeFormObject);
        sb.append(", isAnyType=").append(isAnyType);
        sb.append(", isArray=").append(isArray);
        sb.append(", isMap=").append(isMap);
        sb.append(", isFile=").append(isFile);
        sb.append(", isEnum=").append(isEnum);
        sb.append(", _enum=").append(_enum);
        sb.append(", allowableValues=").append(allowableValues);
        sb.append(", items=").append(items);
        sb.append(", mostInnerItems=").append(mostInnerItems);
        sb.append(", additionalProperties=").append(additionalProperties);
        sb.append(", vars=").append(vars);
        sb.append(", requiredVars=").append(requiredVars);
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", hasValidation=").append(hasValidation);
        sb.append(", maxProperties=").append(maxProperties);
        sb.append(", minProperties=").append(minProperties);
        sb.append(", isNullable=").append(isNullable);
        sb.append(", required=").append(required);
        sb.append(", maximum='").append(maximum).append('\'');
        sb.append(", exclusiveMaximum=").append(exclusiveMaximum);
        sb.append(", minimum='").append(minimum).append('\'');
        sb.append(", exclusiveMinimum=").append(exclusiveMinimum);
        sb.append(", maxLength=").append(maxLength);
        sb.append(", minLength=").append(minLength);
        sb.append(", pattern='").append(pattern).append('\'');
        sb.append(", maxItems=").append(maxItems);
        sb.append(", minItems=").append(minItems);
        sb.append(", uniqueItems=").append(uniqueItems);
        sb.append(", contentType=").append(contentType);
        sb.append(", multipleOf=").append(multipleOf);
        sb.append(", indent=").append(indent);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getPattern() {
        return pattern;
    }

    @Override
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String getMaximum() {
        return maximum;
    }

    @Override
    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    @Override
    public String getMinimum() {
        return minimum;
    }

    @Override
    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    @Override
    public boolean getExclusiveMaximum() {
        return exclusiveMaximum;
    }

    @Override
    public void setExclusiveMaximum(boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    @Override
    public boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    @Override
    public void setExclusiveMinimum(boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    @Override
    public Integer getMinLength() {
        return minLength;
    }

    @Override
    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    @Override
    public Integer getMaxLength() {
        return maxLength;
    }

    @Override
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Integer getMinItems() {
        return minItems;
    }

    @Override
    public void setMinItems(Integer minItems) {
        this.minItems = minItems;
    }

    @Override
    public Integer getMaxItems() {
        return maxItems;
    }

    @Override
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    @Override
    public boolean getUniqueItems() {
        return uniqueItems;
    }

    @Override
    public void setUniqueItems(boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }

    @Override
    public Integer getMinProperties() {
        return minProperties;
    }

    @Override
    public void setMinProperties(Integer minProperties) {
        this.minProperties = minProperties;
    }

    @Override
    public Integer getMaxProperties() {
        return maxProperties;
    }

    @Override
    public void setMaxProperties(Integer maxProperties) {
        this.maxProperties = maxProperties;
    }

    @Override
    public Number getMultipleOf() {
        return multipleOf;
    }

    @Override
    public void setMultipleOf(Number multipleOf) {
        this.multipleOf = multipleOf;
    }

    @Override
    public CodegenProperty getItems() {
        return items;
    }

    @Override
    public void setItems(CodegenProperty items) {
        this.items = items;
    }

    @Override
    public boolean getIsModel() { return isModel; }

    @Override
    public void setIsModel(boolean isModel)  {
        this.isModel = isModel;
    }

    @Override
    public boolean getIsDate() { return isDate; }

    @Override
    public void setIsDate(boolean isDate)   {
        this.isDate = isDate;
    }

    @Override
    public boolean getIsDateTime() { return isDateTime; }

    @Override
    public void setIsDateTime(boolean isDateTime)   {
        this.isDateTime = isDateTime;
    }

    @Override
    public boolean getIsMap() { return isMap; }

    @Override
    public void setIsMap(boolean isMap)  {
        this.isMap = isMap;
    }

    @Override
    public boolean getIsArray() { return isArray; }

    @Override
    public void setIsArray(boolean isArray)  {
        this.isArray = isArray;
    }

    @Override
    public CodegenProperty getAdditionalProperties() { return additionalProperties; }

    @Override
    public void setAdditionalProperties(CodegenProperty additionalProperties)  {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public List<CodegenProperty> getVars() {
        return vars;
    }

    @Override
    public void setVars(List<CodegenProperty> vars) {
        this.vars = vars;
    }

    @Override
    public List<CodegenProperty> getRequiredVars() {
        return requiredVars;
    }

    @Override
    public void setRequiredVars(List<CodegenProperty> requiredVars) {
        this.requiredVars = requiredVars;
    }

    @Override
    public String getIndent() {
        return indent;
    }

    @Override
    public void setIndent(String indent) {
        this.indent = indent;
    }

    @Override
    public boolean getHasVars() {
        if (this.vars != null && this.vars.size() > 0) {
            return true;
        }
        return false;
    };

    @Override
    public boolean getHasRequiredVars() {
        if (this.requiredVars != null && this.requiredVars.size() > 0) {
            return true;
        }
        return false;
    };
}

