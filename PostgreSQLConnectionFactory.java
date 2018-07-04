package com.globant.bootcamp.exercise2;

public class PostgreSQLConnectionFactory implements AbstractConnectionFactory {

	@Override
	public DBConnection getConnection() {

		return new PostgreSQLConnection();
	}

}
