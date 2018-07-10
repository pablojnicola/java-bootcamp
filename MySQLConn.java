package com.globant.bootcamp.abstractFactory;

public class MySQLConn extends Connection {

	private String connectionString;

	public MySQLConn(String connectionString) {

		this.connectionString = connectionString;

	}

	@Override
	public void connect() {

		System.out.println("Connection to MySQL DataBase established.");

	}

}
