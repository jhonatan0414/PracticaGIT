package com.sophossolutions.exceptions;

public class generalDemoException extends AssertionError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public generalDemoException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

}
