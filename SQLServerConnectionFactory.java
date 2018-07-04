package com.globant.bootcamp.exercise2;

public class SQLServerConnectionFactory implements AbstractConnectionFactory {

	@Override
	public DBConnection getConnection() {

		return new SQLServer();
	}

}
