package com.globant.bootcamp.exercise4;

public class DatabaseConnection {

	private String connectionString;

	public String getConnectionString() {

		return connectionString;

	}

	public void setConnectionString(String connectionString) {

		this.connectionString = connectionString;

	}

	public String toString() {

		return "Connection String: " + connectionString;

	}

}
