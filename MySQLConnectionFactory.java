package com.globant.bootcamp.exercise2;

public class MySQLConnectionFactory implements AbstractConnectionFactory {

	@Override
	public DBConnection getConnection() {

		return new MySQLConnection();
	}

}
