package com.globant.bootcamp.builder;

public class MySQLConnectionBuilder implements DataBaseConnectionBuilder {

	private DataBaseConnection connection;

	public MySQLConnectionBuilder() {

		connection = new DataBaseConnection();

	}

	public void buildConnectionString(String connectionString) {

		connection.setConnectionString(connectionString);

	}

	public void buildUser(String user) {

		connection.setUser(user);

	}

	public void buildPassword(String password) {

		connection.setPassword(password);
	}

	public DataBaseConnection getDataBaseConnection() {

		return connection;

	}

}
