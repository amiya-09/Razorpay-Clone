package com.springboot.razorpay.common.exception;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException {
    private final String resourceName;
    private final Object identifier;

    // what resource was not found (resourceName)
    // what identifier was used to search for the resource (identifier)

    public ResourceNotFoundException(String resourceName, Object identifier) {
        super(resourceName+" not found with identifier: "+identifier);
        this.resourceName = resourceName;
        this.identifier = identifier;
    }
}
