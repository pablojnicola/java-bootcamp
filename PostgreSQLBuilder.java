package com.globant.bootcamp.exercise4;

public class PostgreSQLBuilder implements ConnectionBuilder {

	private DatabaseConnection databaseConnection;

	public PostgreSQLBuilder() {

		databaseConnection = new DatabaseConnection();

	}

	@Override
	public void buildConnectionString() {

		databaseConnection.setConnectionString("jdbc:postgresql://HOST/DATABASE\r\n" + "org.postgresql.Driver");

	}

	@Override
	public DatabaseConnection getDatabaseConnection() {
		return databaseConnection;

	}
}
