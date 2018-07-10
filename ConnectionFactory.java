package com.globant.bootcamp.abstractFactory;

public abstract class ConnectionFactory {

	public abstract Connection getConnection(String type);

}
