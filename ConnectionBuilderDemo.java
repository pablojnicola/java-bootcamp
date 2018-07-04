package com.globant.bootcamp.exercise4;

public class ConnectionBuilderDemo {

	public static void main(String[] args) {
		ConnectionBuilder connectionBuilder = new MySQLConnectionBuilder();
		ConnectionDirector connectionDirector = new ConnectionDirector(connectionBuilder);
		connectionDirector.constructConnection();
		DatabaseConnection databaseConnection = connectionDirector.getDatabaseConnection();
		System.out.println(databaseConnection);

		connectionBuilder = new SQLServerBuilder();
		connectionDirector = new ConnectionDirector(connectionBuilder);
		connectionDirector.constructConnection();
		databaseConnection = connectionDirector.getDatabaseConnection();
		System.out.println(databaseConnection);

		connectionBuilder = new PostgreSQLBuilder();
		connectionDirector = new ConnectionDirector(connectionBuilder);
		connectionDirector.constructConnection();
		databaseConnection = connectionDirector.getDatabaseConnection();
		System.out.println(databaseConnection);

	}

}
