package com.celcom.web.ws;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.RequestAttributes;


public class DefaultExceptionAttributes implements ExceptionAttributes {

    /**
     * The timestamp attribute key.
     */
    public static final String TIMESTAMP = "timestamp";
    /**
     * The status attribute key.
     */
    public static final String STATUS = "status";
    /**
     * The error attribute key.
     */
    public static final String ERROR = "error";
    /**
     * The exception attribute key.
     */
    public static final String EXCEPTION = "exception";
    /**
     * The message attribute key.
     */
    public static final String MESSAGE = "message";
    /**
     * The path attribute key.
     */
    public static final String PATH = "path";

    @Override
    public Map<String, Object> getExceptionAttributes(Exception exception,
            HttpServletRequest httpRequest, HttpStatus httpStatus) {

        Map<String, Object> exceptionAttributes = new LinkedHashMap<String, Object>();

        exceptionAttributes.put(TIMESTAMP, new Date());
        addHttpStatus(exceptionAttributes, httpStatus);
        addExceptionDetail(exceptionAttributes, exception);
        addPath(exceptionAttributes, httpRequest);

        return exceptionAttributes;
    }

    private void addHttpStatus(Map<String, Object> exceptionAttributes,
            HttpStatus httpStatus) {
        exceptionAttributes.put(STATUS, httpStatus.value());
        exceptionAttributes.put(ERROR, httpStatus.getReasonPhrase());
    }


    private void addExceptionDetail(Map<String, Object> exceptionAttributes,
            Exception exception) {
        exceptionAttributes.put(EXCEPTION, exception.getClass().getName());
        exceptionAttributes.put(MESSAGE, exception.getMessage());
    }


    private void addPath(Map<String, Object> exceptionAttributes,
            HttpServletRequest httpRequest) {
        exceptionAttributes.put(PATH, httpRequest.getServletPath());
    }

}
