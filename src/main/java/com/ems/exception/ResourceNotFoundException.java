package com.ems.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String resourceName;
	private String fieldName;
	private Object filedValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, Object filedValue) {
		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, filedValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.filedValue = filedValue;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	
	public String getFiledName() {
		return fieldName;
	}
	
	public Object getFiledValue() {
		return filedValue;
	}
	
}
