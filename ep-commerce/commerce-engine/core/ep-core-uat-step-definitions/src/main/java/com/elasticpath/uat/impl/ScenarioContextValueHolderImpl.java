/**
 * Copyright (c) Elastic Path Software Inc., 2014
 */
package com.elasticpath.uat.impl;

import com.elasticpath.uat.ScenarioContextValueHolder;

/**
 * POJO implementation of {@link ScenarioContextValueHolder}.
 *
 * @param <T> the type to be set and provided
 */
public class ScenarioContextValueHolderImpl<T> implements ScenarioContextValueHolder<T> {

	private T value;

	/**
	 * Default constructor.
	 */
	public ScenarioContextValueHolderImpl() {
	}

	/**
	 * Constructor with initial value.
	 *
	 * @param value initial value
	 */
	public ScenarioContextValueHolderImpl(final T value) {
		this.value = value;
	}

	@Override
	public void set(final T value) {
		this.value = value;
	}

	@Override
	public T get() {
		return value;
	}

}
