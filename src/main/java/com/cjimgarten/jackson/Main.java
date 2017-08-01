package com.cjimgarten.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.File;
import java.io.IOException;

/**
 * Created by chris on 7/31/17.
 */
public class Main {

    private static Person personObj = new Person(1, "John", "Doe", "1/1/2000");
    private static String jsonString = "{\"id\":1,\"firstName\":\"John\",\"lastName\":\"Doe\"," +
            "\"dateOfBirth\":\"1/1/2000\"}";
    private static String xmlString = "<Person><id>1</id><firstName>John</firstName>" +
            "<lastName>Doe</lastName><dateOfBirth>1/1/2000</dateOfBirth></Person>";
    private static String jsonPathname = "src/main/resources/person.json";
    private static String xmlPathname = "src/main/resources/person.xml";

    public static void main(String[] args) throws IOException {

        // JSON conversions
        System.out.println("JSON conversions:");
        personObjectToJsonString();
        jsonStringToPersonObject();
        jsonFileToPersonObject();

        // XML conversions
        System.out.println("\nXML conversions:");
        personObjectToXmlString();
        xmlStringToPersonObject();
        xmlFileToPersonObject();

    }

    public static void personObjectToJsonString() throws JsonProcessingException {

        // convert Person object into JSON string
        String json = Conversions.objectToJsonString(personObj);

        // print out the JSON string
        System.out.println(json);

    }

    public static void jsonStringToPersonObject() throws IOException {

        // convert a JSON string into an object
        Person obj = Conversions.jsonStringToObject(jsonString);

        // print out the Java object
        System.out.println(obj);

    }

    public static void jsonFileToPersonObject() throws IOException {

        // convert a JSON file into an object
        Person obj = Conversions.jsonFileToObject(new File(jsonPathname));

        // print out the Java object
        System.out.println(obj);

    }

    public static void personObjectToXmlString() throws JsonProcessingException {

        // convert Person object into XML string
        String xml = Conversions.objectToXmlString(personObj);

        // print out the XML string
        System.out.println(xml);

    }

    public static void xmlStringToPersonObject() throws IOException {

        // convert XML string into an object
        Person obj = Conversions.xmlStringToObject(xmlString);

        // print out the Java object
        System.out.println(obj);

    }

    public static void xmlFileToPersonObject() throws IOException {

        // convert XML file into an object
        Person obj = Conversions.xmlFileToObject(new File(xmlPathname));

        // print out the Java object
        System.out.println(obj);

    }

}
