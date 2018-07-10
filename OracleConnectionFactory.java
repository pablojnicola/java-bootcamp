package com.globant.bootcamp.abstractFactory;

public class OracleConnectionFactory extends ConnectionFactory {

	public Connection getConnection(String type) {

		if ("Oracle".equalsIgnoreCase(type)) {

			return new OracleConn("Data Source=MyOracleDB;User Id=myUsername;Password=myPassword;\r\n" + "Integrated Security=no;");

		} else if ("MySQL".equalsIgnoreCase(type)) {

			return new MySQLConn("jdbc:mysql://localhost:3306/lineadecodigo");

		} else {

			return null;

		}

	}

}
