package com.cjimgarten.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by chris on 7/31/17.
 */
public class Conversions {

    // create an ObjectMapper for data-binding
    private static ObjectMapper mapper = new ObjectMapper();

    // create XmlMapper for XML data-binding
    private static XmlMapper xmlMapper = new XmlMapper();

    /*
     * Java object to JSON string
     */
    public static String objectToJsonString(Object obj) throws JsonProcessingException {

        // convert Java object into JSON string using ObjectMapper
        String json = mapper.writeValueAsString(obj);

        // return JSON string
        return json;

    }

    /*
     * JSON string to Java object
     */
    public static Person jsonStringToObject(String json) throws IOException {

        // convert JSON string into Java object using ObjectMapper
        Person obj = mapper.readValue(json, Person.class);

        // return Java object
        return obj;

    }

    /*
     * JSON file to Java object
     */
    public static Person jsonFileToObject(File json) throws IOException {

        // convert JSON file into Java object using ObjectMapper
        Person obj = mapper.readValue(json, Person.class);

        // return Java object
        return obj;

    }

    /*
     * Java object to XML string
     */
    public static String objectToXmlString(Object obj) throws JsonProcessingException {

        // convert Java object into XML string using XmlMapper
        String xml = xmlMapper.writeValueAsString(obj);

        // return XML string
        return xml;

    }

    /*
     * XML string to Java object
     */
    public static Person xmlStringToObject(String xml) throws IOException {

        // convert XML string into Java object using XmlMapper
        Person obj = xmlMapper.readValue(xml, Person.class);

        // return Java object
        return obj;

    }

    /*
     * XML file to Java object
     */
    public static Person xmlFileToObject(File xml) throws IOException {

        // convert XML file into Java object using XmlMapper
        Person obj = xmlMapper.readValue(xml, Person.class);

        // return Java object
        return obj;

    }

}
