package com.globant.bootcamp.exercise4;

public class SQLServerBuilder implements ConnectionBuilder {

	private DatabaseConnection databaseConnection;

	public SQLServerBuilder() {

		databaseConnection = new DatabaseConnection();

	}

	@Override
	public void buildConnectionString() {

		databaseConnection.setConnectionString(
				"jdbc:microsoft:sqlserver://HOST:1433;DatabaseName=DATABASE\r\n" + "com.microsoft.jdbc.sqlserver.SQLServerDriver");

	}

	@Override
	public DatabaseConnection getDatabaseConnection() {
		// TODO Auto-generated method stub
		return databaseConnection;
	}

}
