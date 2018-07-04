package com.globant.bootcamp.exercise4;

public class ConnectionDirector {

	private ConnectionBuilder connectionBuilder = null;

	public ConnectionDirector(ConnectionBuilder connectionBuilder) {

		this.connectionBuilder = connectionBuilder;

	}

	public void constructConnection() {

		connectionBuilder.buildConnectionString();

	}

	public DatabaseConnection getDatabaseConnection() {

		return connectionBuilder.getDatabaseConnection();

	}

}
