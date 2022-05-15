package com.sportshoes.demo.exception;

public class MyResourceNotCreatedException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3183223791701600178L;

	public MyResourceNotCreatedException(String errorMessage) {
		super(errorMessage);
	}
}
