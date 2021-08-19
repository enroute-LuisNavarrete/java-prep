package com.enroutesystems.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enroutesystems.modifiers.dto.ErrorExcpDTO;
import com.enroutesystems.modifiers.dto.JdbcDTO;
import com.enroutesystems.modifiers.dto.KeywordsDTO;
import com.enroutesystems.modifiers.dto.TypeDTO;
import com.enroutesystems.serviceImpl.ErrorExcpServiceImpl;
import com.enroutesystems.serviceImpl.JdbcServiceImpl;
import com.enroutesystems.serviceImpl.KeywordServiceImpl;
import com.enroutesystems.serviceImpl.ModifiersServiceImpl;
import com.enroutesystems.serviceImpl.TypeServiceImpl;

@RestController
@RequestMapping("/java-prep")
public class javaPrepController {

	
	@GetMapping("/modifiers")
	public ResponseEntity<List<String>> getAllPositionsByRoom() {
		ResponseEntity<List<String>> response = null;
		
		ModifiersServiceImpl modifiersServiceImpl = new ModifiersServiceImpl();
		List<String> greetings = modifiersServiceImpl.getModifiers();
		
		if (greetings.isEmpty()) {
			response = ResponseEntity.noContent().build();
		} else {
			response = ResponseEntity.ok(greetings);
		}
		
		return response;
	}

	@GetMapping("/types")
	public ResponseEntity<List<TypeDTO>> getTypes() {
        ResponseEntity<List<TypeDTO>> response = null;
		
		TypeServiceImpl typeServiceImpl = new TypeServiceImpl();
		
		List<TypeDTO> 	tests 	= typeServiceImpl.getTypeExample();
		
		if (tests.isEmpty()) {
			response = ResponseEntity.noContent().build();
		} else {
			response = ResponseEntity.ok(tests);
		}
		
		return response;
	}
	
	@GetMapping("/keywords")
	public ResponseEntity<List<KeywordsDTO>> getKeywords() {
        ResponseEntity<List<KeywordsDTO>> response = null;
		
		KeywordServiceImpl keywordsServiceImpl = new KeywordServiceImpl();
		List<KeywordsDTO> keyword = keywordsServiceImpl.getKeywordExample();
		
		if (keyword.isEmpty()) {
			response = ResponseEntity.noContent().build();
		} else {
			response = ResponseEntity.ok(keyword);
		}
		
		return response;
	}
	

	@GetMapping("/jdbc")
	public ResponseEntity<List<JdbcDTO>> getJDBC() {
		ResponseEntity<List<JdbcDTO>> response = null;
		
		JdbcServiceImpl jdbcServiceImpl = new JdbcServiceImpl();
		List<JdbcDTO> test = jdbcServiceImpl.getExampleJdbc();
		
		if (test.isEmpty()) {
			response = ResponseEntity.noContent().build();
		} else {
			response = ResponseEntity.ok(test);
		}
		
		return response;
	}	

	@GetMapping("/errors")
	public ResponseEntity<List<ErrorExcpDTO>> getErrors() {
        ResponseEntity<List<ErrorExcpDTO>> response = null;
		
        ErrorExcpServiceImpl errExpServiceImpl = new ErrorExcpServiceImpl();
		List<ErrorExcpDTO> test = errExpServiceImpl.getExample();
		
		if (test.isEmpty()) {
			response = ResponseEntity.noContent().build();
		} else {
			response = ResponseEntity.ok(test);
		}
		
		return response;
	}
	
}
