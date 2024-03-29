/*
 * KonkodLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.www.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.example.www.*;
import com.example.www.models.*;
import com.example.www.exceptions.*;
import com.example.www.http.client.HttpClient;
import com.example.www.http.client.HttpContext;
import com.example.www.http.request.HttpRequest;
import com.example.www.http.response.HttpResponse;
import com.example.www.http.response.HttpStringResponse;
import com.example.www.http.client.APICallBack;

public class AuthenticationController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static AuthenticationController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the AuthenticationController class 
     */
    public static AuthenticationController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new AuthenticationController();
                }
            }
        }
        return instance;
    }

    /**
     * TODO: type endpoint description here
     * @param    credentials    Optional parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createAuthenticationPOSTAsync(
                final ClientCredentials credentials,
                final APICallBack<JWTToken> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateAuthenticationPOSTRequest(credentials);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            JWTToken returnValue = _handleCreateAuthenticationPOSTResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for createAuthenticationPOST
     */
    private HttpRequest _buildCreateAuthenticationPOSTRequest(
                final ClientCredentials credentials) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/api/v1/authenticate");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("Authorization", Configuration.authorization);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");
        _headers.put("content-type", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(credentials));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for createAuthenticationPOST
     * @return An object of type void
     */
    private JWTToken _handleCreateAuthenticationPOSTResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        JWTToken _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<JWTToken>(){});

        return _result;
    }

}
