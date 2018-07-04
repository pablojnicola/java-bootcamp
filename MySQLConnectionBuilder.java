package com.globant.bootcamp.exercise4;

public class MySQLConnectionBuilder implements ConnectionBuilder {

	private DatabaseConnection databaseConnection;

	public MySQLConnectionBuilder() {

		databaseConnection = new DatabaseConnection();

	}

	@Override
	public void buildConnectionString() {
		databaseConnection.setConnectionString("jdbc:mysql://HOST/DATABASE\r\n" + "com.mysql.jdbc.Driver");

	}

	@Override
	public DatabaseConnection getDatabaseConnection() {
		return databaseConnection;
	}

}
