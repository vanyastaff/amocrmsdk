package com.amocrm.amocrmsdk.client;

import java.io.File;
import java.io.IOException;
import org.apache.http.Header;

public interface TransportClient {

    ApiResponse post(String url) throws IOException;

    ApiResponse post(String url, String params) throws IOException;

    ApiResponse post(String url, String params, String body) throws IOException;

    ApiResponse post(String url, String params, String body, String contentType) throws IOException;

    ApiResponse post(String url, String params, String body, Header[] headers) throws IOException;


    ApiResponse get(String url) throws IOException;

    ApiResponse get(String url, String params) throws IOException;

    ApiResponse get(String url, String param, String contentType) throws IOException;

    ApiResponse get(String url, String params, Header[] headers) throws IOException;


    ApiResponse patch(String url ) throws  IOException;
    ApiResponse patch(String url, String params) throws  IOException;

    ApiResponse patch(String url, String params, String body) throws  IOException;

    ApiResponse patch(String url, String params, String body, String contentType) throws IOException;

    ApiResponse patch(String url, String params, String body, Header[] headers) throws IOException;


    ApiResponse delete(String url) throws IOException;
    ApiResponse delete(String url, String params) throws IOException;

    ApiResponse delete(String url, String params, String body) throws IOException;

    ApiResponse delete(String url, String params, String body, String contentType) throws IOException;

    ApiResponse delete(String url, String params, String body, Header[] headers) throws IOException;
}
