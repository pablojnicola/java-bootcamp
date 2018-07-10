package com.globant.bootcamp.builder;

public interface DataBaseConnectionBuilder {

	public void buildConnectionString(String connectionString);

	public void buildUser(String user);

	public void buildPassword(String password);

	public DataBaseConnection getDataBaseConnection();

}
