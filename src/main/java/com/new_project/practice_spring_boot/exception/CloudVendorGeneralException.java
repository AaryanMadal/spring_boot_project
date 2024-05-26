package com.new_project.practice_spring_boot.exception;

public class CloudVendorGeneralException extends RuntimeException{

    public CloudVendorGeneralException(String message) {
        super(message);
    }

    public CloudVendorGeneralException(String message, Throwable cause) {
        super(message, cause);
    }
}
