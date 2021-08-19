package com.enroutesystems.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.enroutesystems.jdbc.JdbcClass;
import com.enroutesystems.modifiers.dto.JdbcDTO;

public class JdbcServiceImpl {
	
	public List<JdbcDTO> getExampleJdbc(){
		List<JdbcDTO> response = new ArrayList<JdbcDTO>();

		response.add( this.testConnection() );
		
		response.add( this.testResultSet() );
		
		response.add( this.testPreparedStatement() );
		
		response.add( this.testResultSet() );
		
		response.add( this.testStatement() );
		
		response.add( this.testResultSet() );
		
		response.add( this.testResultSetMetaData() );
		
		return response;
	}
	
	private JdbcDTO testConnection() {
		JdbcDTO resp = new JdbcDTO();
		JdbcClass jdbcClass = new JdbcClass();
		
		resp.setTestName("Testing connection");
		
		resp.setQueryResponse( jdbcClass.connection() );
		
		return resp;
	}
	
	private JdbcDTO testStatement() {
		JdbcDTO   resp      = new JdbcDTO();
		JdbcClass jdbcClass = new JdbcClass();
		
		String id = "1 or 1=1";
		String field = "val x";
		
		resp.setTestName("Testing Statement");
		resp.setQueryResponse( jdbcClass.statement(field, id) );
		
		return resp;
	}
	
	private JdbcDTO testPreparedStatement() {
		JdbcDTO   resp      = new JdbcDTO();
		JdbcClass jdbcClass = new JdbcClass();
		
		int id =  1;
		String field = "val x";
		
		resp.setTestName("Testing Prepared Statement");
		resp.setQueryResponse( jdbcClass.preparedStatement(field, id) );
		
		return resp;
	}
	
	private JdbcDTO testResultSet() {
		JdbcDTO resp = new JdbcDTO();
		JdbcClass jdbcClass = new JdbcClass();
		
		resp.setTestName("Testing Result Set");
		
		resp.setRecords( jdbcClass.ResultSet() );
		
		return resp;
	}
	
	private JdbcDTO testResultSetMetaData() {
		JdbcDTO resp = new JdbcDTO();
		JdbcClass jdbcClass = new JdbcClass();
		
		resp.setTestName("Testing Result Set Meta Data");
		
		resp.setQueryResponse( jdbcClass.ResultSetMetaData() );
		
		return resp;
	}
	
	

}
