package com.globant.bootcamp.exercise2;

public class PostgreSQLConnection implements DBConnection {

	@Override
	public void establishConnection() {

		System.out.println("Establishing connection to PostgreSQL...\nPlease wait until it is done.");

	}

}
