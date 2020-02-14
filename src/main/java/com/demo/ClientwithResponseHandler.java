package com.demo;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


/**
 * This example demonstrates the use of the {@link ResponseHandler} to simplify
 * the process of processing the HTTP response and releasing associated resources.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientwithResponseHandler {
    @JsonProperty("status")
    private Integer status;
    /*@JsonProperty("getLicensesSrvUrl")
    private String getLicensesSrvUrl;
    @JsonProperty("status")
    private String status;
    @JsonProperty("user")
    private String uId;
    @JsonProperty("clientContext")
    private String clientContext;
    @JsonProperty("expirationMillis")
    private String expirationMillis;*/

    public String function1(String aid,String sno) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {


            HttpGet httpget = new HttpGet( "https://vpp.itunes.apple.com/mdm/manageVPPLicensesByAdamIdSrv?sToken=eyJleHBEYXRlIjoiMjAyMC0wOS0xNVQyMzo1Njo0NC0wNzAwIiwidG9rZW4iOiI5c3RtRTcvbWFuckxJZExqcU1DeXpjaXM2S1BxZ0p3blVha1JMditVN0swODFzZGRkRnlLcFd5NGJicnFjV2pVTG04QkRSVDBFWlJYN254UEVMS05BWXk3WEViS0s3cjFqZFVyb01sL1ppcnlFWlpXS010bndiNzFnYkFXQ00xVzBJZ2Y0YzM1ZzA2V254YWJwalc2SVE9PSIsIm9yZ05hbWUiOiJOb3ZlbGwifQ==&associateSerialNumbers="+sno+"&adamIdStr="+aid+"&pricingParam=STDQ");
            System.out.println("Executing request " + httpget.getRequestLine());
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            System.out.println("----------------------------------------");
            System.out.println(responseBody);

            parser p=new parser();
            String a=p.parsefn(responseBody);






        return a;
        } finally {
            httpclient.close();
        }

    }
    public String function2(String aid,String sno) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {


            HttpGet httpget = new HttpGet( "https://vpp.itunes.apple.com/mdm/manageVPPLicensesByAdamIdSrv?sToken=eyJleHBEYXRlIjoiMjAyMC0wOS0xNVQyMzo1Njo0NC0wNzAwIiwidG9rZW4iOiI5c3RtRTcvbWFuckxJZExqcU1DeXpjaXM2S1BxZ0p3blVha1JMditVN0swODFzZGRkRnlLcFd5NGJicnFjV2pVTG04QkRSVDBFWlJYN254UEVMS05BWXk3WEViS0s3cjFqZFVyb01sL1ppcnlFWlpXS010bndiNzFnYkFXQ00xVzBJZ2Y0YzM1ZzA2V254YWJwalc2SVE9PSIsIm9yZ05hbWUiOiJOb3ZlbGwifQ==&disassociateSerialNumbers="+sno+"&adamIdStr="+aid+"&pricingParam=STDQ");
            System.out.println("Executing request " + httpget.getRequestLine());
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            System.out.println("----------------------------------------");
            System.out.println(responseBody);

            parser p=new parser();
            String a=p.parsefn(responseBody);






            return a;
        } finally {
            httpclient.close();
        }

    }


}