package com.code.api.exception;



	public class ResourceNotFoundException extends RuntimeException{
	    public ResourceNotFoundException() {
	    }
	    public ResourceNotFoundException(String message) {
	        super(message);//calling the constructor of the super class
	    }
	}