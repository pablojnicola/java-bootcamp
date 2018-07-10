package com.globant.bootcamp.builder;

public class DataBaseConnection {

	private String connectionString;
	private String user;
	private String password;

	public String getConnectionString() {

		return connectionString;

	}

	public void setConnectionString(String connectionString) {

		this.connectionString = connectionString;

	}

	public String getUser() {

		return user;

	}

	public void setUser(String user) {

		this.user = user;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	public String toString() {

		return "Connection string: " + connectionString + "\nUser: " + user + "\nPassword: " + password;

	}
}
