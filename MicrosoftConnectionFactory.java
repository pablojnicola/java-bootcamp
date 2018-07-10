package com.globant.bootcamp.abstractFactory;

public class MicrosoftConnectionFactory extends ConnectionFactory {

	public Connection getConnection(String type) {

		if ("SQLServer".equalsIgnoreCase(type)) {

			return new SQLServerConn("data source=\"(local)\";initial catalog=AdventureWorks");

		} else if ("MicrosoftAccess".equalsIgnoreCase(type)) {

			return new MicrosoftAccessConn("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\\myFolder\\myAccessFile.accdb;\r\n"
					+ "Jet OLEDB:Database Password=MyDbPassword;");

		} else {

			return null;

		}

	}

}
