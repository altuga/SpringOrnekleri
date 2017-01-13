package com.kodcu.com.kodcu.converter;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.StringReader;

/**
 * Created by hakdogan on 24/07/15.
 */
@Converter(autoApply = true)
public class AccessoryConverter implements AttributeConverter<JsonArray, String> {

    @Override
    public String convertToDatabaseColumn(JsonArray attribute) {

        if (attribute == null)
            return "[]";

        return attribute.toString();
    }

    @Override
    public JsonArray convertToEntityAttribute(String dbData) {

        if (dbData == null)
            return Json.createArrayBuilder().build();

        JsonArray jsonArray=null;
        try(StringReader stringReader = new StringReader(dbData);
            JsonReader jsonReader = Json.createReader(stringReader)) {
            jsonArray = jsonReader.readArray();
        }

        return jsonArray;
    }
}
