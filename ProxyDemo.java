package com.globant.bootcamp.proxy;

public class ProxyDemo {

	public static void main(String[] args) {

		Proxy proxy = new Proxy();

		MySQLAccess mysqlAccess = new MySQLAccess();
		mysqlAccess.accessDataBase();

		proxy.accessDataBase();

	}

}
