package com.greatlearning.exceptionhandling;

public class DepartmentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DepartmentException() {
		super();
	}

	public DepartmentException(String message) {
		super(message);
	}

}
