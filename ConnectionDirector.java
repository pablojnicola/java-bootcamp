package com.globant.bootcamp.builder;

public class ConnectionDirector {

	private DataBaseConnectionBuilder connectionBuilder = null;

	public ConnectionDirector(DataBaseConnectionBuilder connectionBuilder) {

		this.connectionBuilder = connectionBuilder;

	}

	public void constructConnection(String connectionString, String user, String password) {

		connectionBuilder.buildConnectionString(connectionString);
		connectionBuilder.buildUser(user);
		connectionBuilder.buildPassword(password);

	}

	public DataBaseConnection getDataBaseConnection() {

		return connectionBuilder.getDataBaseConnection();

	}

}
