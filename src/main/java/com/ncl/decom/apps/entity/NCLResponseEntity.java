package com.ncl.decom.apps.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class NCLResponseEntity {

    public HttpStatus status;
    public Integer statusCode;
    public String message;
    public Object responseObject;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(Object responseObject) {
        this.responseObject = responseObject;
    }





    @Override
    public String toString() {
        return "ResponseEntity "+
                "Status "+status +
                "Status Code"+statusCode +
                "Message "+message+
                "ResponseObject "+responseObject;
    }
}
