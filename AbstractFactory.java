package com.globant.bootcamp.abstractFactory;

public class AbstractFactory {

	public ConnectionFactory getConnectionFactory(String type) {

		if ("Microsoft".equals(type)) {

			return new MicrosoftConnectionFactory();

		} else {

			return new OracleConnectionFactory();

		}

	}

}
