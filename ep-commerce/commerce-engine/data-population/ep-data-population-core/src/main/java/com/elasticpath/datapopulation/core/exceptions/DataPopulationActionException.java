/*
 * Copyright (c) Elastic Path Software Inc., 2018
 */
package com.elasticpath.datapopulation.core.exceptions;

/**
 * A {@link RuntimeException} subclass used by the Data Population service to indicate an exception occurred.
 */
public class DataPopulationActionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DataPopulationActionException() {
		super();
	}

	/**
	 * Constructor taking in a specific exception message.
	 *
	 * @param message the message to use.
	 */
	public DataPopulationActionException(final String message) {
		super(message);
	}

	/**
	 * Constructor taking in the nested cause.
	 *
	 * @param cause the nested cause of the exception.
	 */
	public DataPopulationActionException(final Throwable cause) {
		super(cause);
	}

	/**
	 * Constructor taking in a specific exception message and nested cause.
	 *
	 * @param message the message to use
	 * @param cause   the nested cause of the exception.
	 */
	public DataPopulationActionException(final String message, final Throwable cause) {
		super(message, cause);
	}
}