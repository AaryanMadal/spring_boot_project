package com.new_project.practice_spring_boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {

    @ExceptionHandler(value ={CloudVendorNotFoundException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException
            (CloudVendorNotFoundException cloudVendorNotFoundException){
        CloudVendorException cloudVendorException=new CloudVendorException(
                cloudVendorNotFoundException.getMessage(),
                cloudVendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(cloudVendorException,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value={CloudVendorGeneralException.class})
    public ResponseEntity<Object>handleCloudVendorGeneralException(CloudVendorGeneralException cloudVendorGeneralException){
        CloudVendorException cloudVendorException=new CloudVendorException(
                cloudVendorGeneralException.getMessage(),
                cloudVendorGeneralException.getCause(),
                HttpStatus.NO_CONTENT
        );
        return new ResponseEntity<>(cloudVendorException,HttpStatus.NO_CONTENT);

    }

}
