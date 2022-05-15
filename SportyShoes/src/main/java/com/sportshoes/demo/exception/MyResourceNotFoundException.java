package com.sportshoes.demo.exception;

public class MyResourceNotFoundException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1672922237528370729L;

	public MyResourceNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}