package com.sportshoes.demo.exception;

public class MyResourceNotUpdatedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6541956361581688502L;
	
	public MyResourceNotUpdatedException(String errorMessage) {
		super(errorMessage);
	}

}