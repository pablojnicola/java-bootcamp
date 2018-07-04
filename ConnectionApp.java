package com.globant.bootcamp.exercise2;

public class ConnectionApp {

	private final AbstractConnectionFactory connectionFactory;

	public ConnectionApp(AbstractConnectionFactory connectionFactory) {

		this.connectionFactory = connectionFactory;

	}

	public void startExecution() {

		DBConnection dbConnection = connectionFactory.getConnection();
		dbConnection.establishConnection();

	}

}
