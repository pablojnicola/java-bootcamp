package com.globant.bootcamp.abstractFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {

		AbstractFactory absFact = new AbstractFactory();

		ConnectionFactory connection1 = absFact.getConnectionFactory("Microsoft");
		Connection c1 = connection1.getConnection("SQLServer");
		c1.connect();

		ConnectionFactory connection2 = absFact.getConnectionFactory("Microsoft");
		Connection c2 = connection2.getConnection("MicrosoftAccess");
		c2.connect();

		ConnectionFactory connection3 = absFact.getConnectionFactory("Oracle");
		Connection c3 = connection3.getConnection("Oracle");
		c3.connect();

		ConnectionFactory connection4 = absFact.getConnectionFactory("Oracle");
		Connection c4 = connection4.getConnection("MySQL");
		c4.connect();

	}

}
