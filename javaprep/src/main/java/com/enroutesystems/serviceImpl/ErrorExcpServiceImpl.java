package com.enroutesystems.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.enroutesystems.modifiers.dto.ErrorExcpDTO;

public class ErrorExcpServiceImpl {

	public List<ErrorExcpDTO> getExample() {
		
		List<ErrorExcpDTO> lstErrorExcp = new ArrayList<ErrorExcpDTO>();
		
		lstErrorExcp.add( testCheckExp() );
		lstErrorExcp.add( testUncheckExp() );
		lstErrorExcp.add( testFinally() );
		
		return lstErrorExcp;
	}
	
	public ErrorExcpDTO testCheckExp() {
		ErrorExcpDTO err = new ErrorExcpDTO();
		
		err.setTestName("Test Checked EXCEPTIONS");
		
		err.setCreatingErrorExcp("Sorrounding with try..catch an Arithmetic Operation divided by zero");
		
		int numerator = 1;
	    int denominator = 0;
	    int result = 0;
	    try {
	    	result = numerator / denominator;
		} catch (ArithmeticException e) {
			err.setErrorMsg( e.getMessage() );
		}    
		
		return err;
	}
	
	public ErrorExcpDTO testUncheckExp() {
		ErrorExcpDTO err = new ErrorExcpDTO();
		
		err.setTestName("Test Unchecked EXCEPTIONS");
		
		err.setCreatingErrorExcp("Do an Arithmetic Operation divided by zero without try..catch");
		
		int numerator = 1;
	    int denominator = 0;
	    int result = 0;
	    try {
	    	result = numerator / denominator;
		} catch (ArithmeticException e) {
			err.setErrorMsg( e.getMessage() );
		}   
		
		return err;
	}
	
	public ErrorExcpDTO testFinally() {
		ErrorExcpDTO err = new ErrorExcpDTO();
		
		err.setTestName("Test Finally");
		
		err.setCreatingErrorExcp("Finally is executed always at the end of try..catch");
		
		int numerator = 1;
	    int denominator = 0;
	    int result = 0;
	    try {
	    	result = numerator / denominator;
		} catch (ArithmeticException e) {
			err.setErrorMsg( e.getMessage() );
		} finally {
			err.setErrorMsg( err.getErrorMsg() + " changed on finally block " );
		}
		
		return err;
	}

}
