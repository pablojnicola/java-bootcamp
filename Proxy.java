package com.globant.bootcamp.proxy;

import java.util.*;

public class Proxy {

	SQLServerAccess sqlAccess;

	public Proxy() {

		System.out.println("Creating proxy for DataBase Accessor Class at: " + new Date());

	}

	public void accessDataBase() {
		if (sqlAccess == null) {
			sqlAccess = new SQLServerAccess();
		}
		sqlAccess.accessDataBase();
	}

}
