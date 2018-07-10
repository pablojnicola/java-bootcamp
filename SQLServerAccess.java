package com.globant.bootcamp.proxy;

public class SQLServerAccess extends DataBaseAccess {

	public SQLServerAccess() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
