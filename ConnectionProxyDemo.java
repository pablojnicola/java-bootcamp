package com.globant.bootcamp.exercise3;

public class ConnectionProxyDemo {

	public static void main(String[] args) {

		ConnectionProxy connectionProxy = new ConnectionProxy();
		MySQLConnection mySQLConnection = new MySQLConnection();

		connectionProxy.connect();

	}

}
