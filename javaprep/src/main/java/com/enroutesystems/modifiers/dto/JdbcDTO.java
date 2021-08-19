package com.enroutesystems.modifiers.dto;

import java.util.Map;

import lombok.Data;

@Data
public class JdbcDTO {

	String testName;
	String queryResponse;
	Map<Integer, String> records;
	
}
