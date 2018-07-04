package com.globant.bootcamp.exercise3;

public class ConnectionProxy {

	SQLServerConnection sqlServerConn;

	public ConnectionProxy() {

		System.out.println("Creating proxy connection...");

	}

	public void connect() {

		if (sqlServerConn == null) {

			sqlServerConn = new SQLServerConnection();

		}

		sqlServerConn.accessConnection();

	}

}
