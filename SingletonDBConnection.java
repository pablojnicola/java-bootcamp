package com.globant.bootcamp.exercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonDBConnection {

	private static SingletonDBConnection myConnection = null;
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;

	private SingletonDBConnection(String connectionString, String user, String password) {
		try {
			connection = DriverManager.getConnection(connectionString, user, password);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static SingletonDBConnection getInstance(String connectionString, String user, String password) {

		if (myConnection == null) {
			myConnection = new SingletonDBConnection(connectionString, user, password);
		}
		return myConnection;

	}

	public Connection getConnection() {
		return connection;
	}

	public Statement getStatement() {
		return statement;
	}

	public ResultSet getResultSet() {
		return resultSet;
	}

	public void closeResult() {
		try {
			resultSet.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void closeStatement() {
		try {
			statement.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void closeConexion() {
		try {
			if (resultSet != null) {
				closeResult();
			}
			if (statement != null) {
				closeStatement();
			}
			connection.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void executeQuery(String query) {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public int executeInstruction(String instruction) {

		int rows = 0;

		try {
			statement = connection.createStatement();
			rows = statement.executeUpdate(instruction);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return rows;
	}

	public boolean checkExistingValue(String data, String column, String table) {

		boolean exists = false;

		Statement statementAux;
		try {
			statementAux = connection.createStatement();

			ResultSet aux = statementAux
					.executeQuery("select count(*) from " + table + " where upper(" + column + ")='" + data.toUpperCase() + "'");

			aux.next();

			if (aux.getInt(1) >= 1) {
				exists = true;
			}

			aux.close();
			statementAux.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return exists;
	}

}
