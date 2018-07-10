package com.globant.bootcamp.builder;

public class BuilderDemo {

	public static void main(String[] args) {

		DataBaseConnectionBuilder connectionBuilder1 = new MySQLConnectionBuilder();
		ConnectionDirector connectionDirector = new ConnectionDirector(connectionBuilder1);
		connectionDirector.constructConnection("jdbc:mysql://localhost:3306/lineadecodigo", "root", "root");
		DataBaseConnection dataBaseConnection = connectionDirector.getDataBaseConnection();
		System.out.println("Connection: " + dataBaseConnection);

	}

}
