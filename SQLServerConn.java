package com.globant.bootcamp.abstractFactory;

public class SQLServerConn extends Connection {

	private String connectionString;

	public SQLServerConn(String connectionString) {

		this.connectionString = connectionString;

	}

	@Override
	public void connect() {

		System.out.println("Connection to SQLServer DataBase established.");

	}

}
