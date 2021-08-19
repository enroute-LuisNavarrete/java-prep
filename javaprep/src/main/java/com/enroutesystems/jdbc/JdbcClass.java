package com.enroutesystems.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public class JdbcClass {

	final String USER = "root";
	final String PSWD = "";
	
	Connection conexion;

	public Connection getConnection() {
		String JdbcURL = "jdbc:mysql://localhost:3306/jdbc_connection";
		conexion = null;
		try {
			conexion = DriverManager.getConnection(JdbcURL, this.USER, this.PSWD);
	         System.out.println("Connected to MySQL database");
		} catch (SQLException e) {  
			      e.printStackTrace();
		}
		return conexion;
	}
	
	public String connection() {
		String status = "not connected";
		String JdbcURL = "jdbc:mysql://localhost:3306/jdbc_connection";
		conexion = null;
		try {
			conexion = DriverManager.getConnection(JdbcURL, this.USER, this.PSWD);
			 status = "connected";
		} catch (SQLException e) {  
			      e.printStackTrace();
		}
		return status;
	}
	
	public String statement(String field, String id) {
		Connection conn = this.getConnection();
		boolean rs = false;
		String sqlInstruction = "";
		try {
			
			Statement st = conn.createStatement();
			sqlInstruction = "update sample set field = '" + field + "' where id = " + id + " "; 
			rs = st.execute(sqlInstruction);
		} catch (SQLException e) {  
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return "Executing " + sqlInstruction;
	}
	
	public String preparedStatement(String field, int id) {
		Connection conn = this.getConnection();
		boolean rs = false;
		Map<Integer, String> readTable = null;
		String sqlInstruction = "";
		sqlInstruction = "update sample set field = ? where id = ? ";
		try {
			
			PreparedStatement st = conn.prepareStatement(sqlInstruction);
			st.setString(1, field);
			st.setInt(2, id   );
			rs = st.execute();
		} catch (SQLException e) {  
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return "Executing " + sqlInstruction;
	}
	
	public Map<Integer, String> ResultSet() {
		Connection conn = this.getConnection();
		
		Map<Integer, String> readTable = null;
		try {
			Statement st = conn.createStatement();
			readTable = new HashMap<Integer, String>();
			ResultSet rs = st.executeQuery("sELECT * FROM sample");
			 
			while(rs.next()) {
				int id = rs.getInt("id");
				String field = rs.getString("field");
				System.out.print(id + " " + field);
				readTable.put(id, field);
			}
			
		} catch (SQLException e) {  
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return readTable;
	}
	
	public String ResultSetMetaData() {
		Connection conn = this.getConnection();
		
		int numberOfColumns = 0;
		boolean b = false; 
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM sample");
			
		    ResultSetMetaData rsmd = rs.getMetaData();
		    numberOfColumns = rsmd.getColumnCount();
		} catch (SQLException e) {  
			 e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return "Result Set Meta Data could get info about tables, such as the number of columns " + numberOfColumns; 
	}

}
