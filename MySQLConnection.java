package com.globant.bootcamp.exercise2;

public class MySQLConnection implements DBConnection {

	@Override
	public void establishConnection() {

		System.out.println("Establishing connection to MySQL...\nPlease wait until it is done.");

	}

}
