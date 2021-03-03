/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.client.model.ComplexQuadrilateral;
import org.openapitools.client.model.SimpleQuadrilateral;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = Quadrilateral.QuadrilateralDeserializer.class)
@JsonSerialize(using = Quadrilateral.QuadrilateralSerializer.class)
public class Quadrilateral extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Quadrilateral.class.getName());

    public static class QuadrilateralSerializer extends StdSerializer<Quadrilateral> {
        public QuadrilateralSerializer(Class<Quadrilateral> t) {
            super(t);
        }

        public QuadrilateralSerializer() {
            this(null);
        }

        @Override
        public void serialize(Quadrilateral value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class QuadrilateralDeserializer extends StdDeserializer<Quadrilateral> {
        public QuadrilateralDeserializer() {
            this(Quadrilateral.class);
        }

        public QuadrilateralDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Quadrilateral deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Quadrilateral newQuadrilateral = new Quadrilateral();
            Map<String,Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("quadrilateralType");
            switch (discriminatorValue) {
                case "ComplexQuadrilateral":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ComplexQuadrilateral.class);
                    newQuadrilateral.setActualInstance(deserialized);
                    return newQuadrilateral;
                case "SimpleQuadrilateral":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SimpleQuadrilateral.class);
                    newQuadrilateral.setActualInstance(deserialized);
                    return newQuadrilateral;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for Quadrilateral. Possible values: ComplexQuadrilateral SimpleQuadrilateral", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ComplexQuadrilateral
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ComplexQuadrilateral.class.equals(Integer.class) || ComplexQuadrilateral.class.equals(Long.class) || ComplexQuadrilateral.class.equals(Float.class) || ComplexQuadrilateral.class.equals(Double.class) || ComplexQuadrilateral.class.equals(Boolean.class) || ComplexQuadrilateral.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ComplexQuadrilateral.class.equals(Integer.class) || ComplexQuadrilateral.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ComplexQuadrilateral.class.equals(Float.class) || ComplexQuadrilateral.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ComplexQuadrilateral.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ComplexQuadrilateral.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ComplexQuadrilateral.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ComplexQuadrilateral'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ComplexQuadrilateral'", e);
            }

            // deserialize SimpleQuadrilateral
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SimpleQuadrilateral.class.equals(Integer.class) || SimpleQuadrilateral.class.equals(Long.class) || SimpleQuadrilateral.class.equals(Float.class) || SimpleQuadrilateral.class.equals(Double.class) || SimpleQuadrilateral.class.equals(Boolean.class) || SimpleQuadrilateral.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SimpleQuadrilateral.class.equals(Integer.class) || SimpleQuadrilateral.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SimpleQuadrilateral.class.equals(Float.class) || SimpleQuadrilateral.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SimpleQuadrilateral.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SimpleQuadrilateral.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SimpleQuadrilateral.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SimpleQuadrilateral'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SimpleQuadrilateral'", e);
            }

            if (match == 1) {
                Quadrilateral ret = new Quadrilateral();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for Quadrilateral: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Quadrilateral getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "Quadrilateral cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public Quadrilateral() {
        super("oneOf", Boolean.FALSE);
    }
  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public Quadrilateral putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

    /**
     * Return true if this Quadrilateral object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o) && Objects.equals(this.additionalProperties, ((Quadrilateral)o).additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getActualInstance(), isNullable(), getSchemaType(), additionalProperties);
    }
    public Quadrilateral(ComplexQuadrilateral o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Quadrilateral(SimpleQuadrilateral o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ComplexQuadrilateral", new GenericType<ComplexQuadrilateral>() {
        });
        schemas.put("SimpleQuadrilateral", new GenericType<SimpleQuadrilateral>() {
        });
        JSON.registerDescendants(Quadrilateral.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("ComplexQuadrilateral", ComplexQuadrilateral.class);
        mappings.put("SimpleQuadrilateral", SimpleQuadrilateral.class);
        mappings.put("Quadrilateral", Quadrilateral.class);
        JSON.registerDiscriminator(Quadrilateral.class, "quadrilateralType", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Quadrilateral.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ComplexQuadrilateral, SimpleQuadrilateral
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ComplexQuadrilateral.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SimpleQuadrilateral.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ComplexQuadrilateral, SimpleQuadrilateral");
    }

    /**
     * Get the actual instance, which can be the following:
     * ComplexQuadrilateral, SimpleQuadrilateral
     *
     * @return The actual instance (ComplexQuadrilateral, SimpleQuadrilateral)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ComplexQuadrilateral`. If the actual instanct is not `ComplexQuadrilateral`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ComplexQuadrilateral`
     * @throws ClassCastException if the instance is not `ComplexQuadrilateral`
     */
    public ComplexQuadrilateral getComplexQuadrilateral() throws ClassCastException {
        return (ComplexQuadrilateral)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SimpleQuadrilateral`. If the actual instanct is not `SimpleQuadrilateral`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SimpleQuadrilateral`
     * @throws ClassCastException if the instance is not `SimpleQuadrilateral`
     */
    public SimpleQuadrilateral getSimpleQuadrilateral() throws ClassCastException {
        return (SimpleQuadrilateral)super.getActualInstance();
    }

}

