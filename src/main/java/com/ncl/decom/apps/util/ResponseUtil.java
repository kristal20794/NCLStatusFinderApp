package com.ncl.decom.apps.util;

import com.ncl.decom.apps.entity.NCLResponseEntity;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class ResponseUtil<T> extends ResponseEntity<T> {


    public ResponseUtil(HttpStatusCode status) {
        super(status);
    }

    public ResponseUtil(Object body, HttpStatusCode status) {
        super((T) body, status);
    }

    public ResponseUtil(MultiValueMap headers, HttpStatusCode status) {
        super(headers, status);
    }

    public static ResponseEntity<NCLResponseEntity> successRequestResponse(String message,Object responseObject){
        NCLResponseEntity nclResponseEntity=new NCLResponseEntity();
        return ResponseEntity.ok(nclResponseEntity);
    }

}
