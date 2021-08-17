package com.enroutesystems.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enroutesystems.serviceImpl.ModifiersServiceImpl;

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
	public ResponseEntity<List<String>> getTypes() {
		ResponseEntity<List<String>> response = null;
		
		return response;
	}
	
	@GetMapping("/keywords")
	public ResponseEntity<List<String>> getKeywords() {
		ResponseEntity<List<String>> response = null;
		
		return response;
	}
	

	@GetMapping("/jdbc")
	public ResponseEntity<List<String>> getJDBC() {
		ResponseEntity<List<String>> response = null;
		
		return response;
	}	

	@GetMapping("/errors")
	public ResponseEntity<List<String>> getErrors() {
		ResponseEntity<List<String>> response = null;
		
		return response;
	}
	
}
