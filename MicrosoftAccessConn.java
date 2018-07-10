package com.globant.bootcamp.abstractFactory;

public class MicrosoftAccessConn extends Connection {

	private String connectionString;

	public MicrosoftAccessConn(String connectionString) {

		this.connectionString = connectionString;

	}

	@Override
	public void connect() {

		System.out.println("Connection to Microsoft Access DataBase established.");

	}

}
