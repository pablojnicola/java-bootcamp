package com.globant.bootcamp.Singleton;

public class Singleton {

	public static void main(String[] args) {

		SingletonDBConnection singletonDBConnection = SingletonDBConnection.getInstance("jdbc:mysql://localhost:3306/test", "root", "root");

		singletonDBConnection.executeInstruction("UPDATE Store_Information\r\n" + "SET Sales = 500\r\n"
				+ "WHERE Store_Name = 'Los Angeles'\r\n" + "AND Txn_Date = '08-Jan-1999';");

		singletonDBConnection.closeConexion();

	}

}
