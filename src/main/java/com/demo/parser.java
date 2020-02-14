package com.demo;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class parser {

    public String ss1,ss2;
    public String fieldName;
    public String parsefn(String responseBody) {
        System.out.println("In parser");
        ObjectMapper objectMapper = new ObjectMapper();

        try {



            ClientwithResponseHandler car = objectMapper.readValue(responseBody, ClientwithResponseHandler.class);
            System.out.println(car);
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
            System.out.println(json);

            JsonFactory factory = new JsonFactory();
            JsonParser parser = factory.createParser(json);

            //Car car = new Car();
            while (!parser.isClosed()) {
                JsonToken jsonToken = parser.nextToken();

                if (JsonToken.FIELD_NAME.equals(jsonToken)) {
                    fieldName = parser.getCurrentName();
                    System.out.println("fieldName");
                    System.out.println(fieldName);
                    jsonToken = parser.nextToken();

                    if ("status".equals(fieldName)) {
                        ss1 = parser.getValueAsString();
                        System.out.println("ss1 = "+ss1);
                    }
                }
            }
            if(ss1.equals("0"))
            {
                ss2= "successful";
            }
            if(ss1.equals("-1"))
            {
                ss2= "unsuccessful";
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*dbconnect d=new dbconnect();
        d.connect(fieldName,ss1);*/
        return ss2;

    }


    public String parsefnfile(File fileReader) {
        System.out.println("In parser file");
        ObjectMapper objectMapper = new ObjectMapper();
        URL url = null;
        try {
            //url = new URL("https://vpp.itunes.apple.com/WebObjects/MZFinance.woa/wa/VPPServiceConfigSrv/");


            ClientwithResponseHandler car = objectMapper.readValue(fileReader, ClientwithResponseHandler.class);
            System.out.println(car);
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
            System.out.println(json);

            JsonFactory factory = new JsonFactory();
            JsonParser parser = factory.createParser(json);

            //Car car = new Car();
            while (!parser.isClosed()) {
                JsonToken jsonToken = parser.nextToken();

                if (JsonToken.FIELD_NAME.equals(jsonToken)) {
                    fieldName = parser.getCurrentName();
                    System.out.println("fieldName");
                    System.out.println(fieldName);
                    jsonToken = parser.nextToken();

                    if ("getUsersSrvUrl".equals(fieldName)) {
                        ss2 = parser.getValueAsString();
                        System.out.println("ss2 = "+ss2);
                    }
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*dbconnect d=new dbconnect();
        d.connect(fieldName,ss1);
*/
        return ss2;
    }
    public String outputfn()
    {
        return ss1;
    }
}

