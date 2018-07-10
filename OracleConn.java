package com.globant.bootcamp.abstractFactory;

public class OracleConn extends Connection {

	private String connectionString;

	public OracleConn(String connectionString) {

		this.connectionString = connectionString;

	}

	@Override
	public void connect() {

		System.out.println("Connection to Oracle DataBase established.");

	}

}
