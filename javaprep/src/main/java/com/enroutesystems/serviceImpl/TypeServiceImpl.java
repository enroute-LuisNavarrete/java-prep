package com.enroutesystems.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.enroutesystems.modifiers.dto.TypeDTO;
import com.enroutesystems.types.FinalClass;
import com.enroutesystems.types.StaticClass;

public class TypeServiceImpl {
	
	/*
	 * 
	 * */
	public List<TypeDTO> getTypeExample(){
		
		List<TypeDTO> response = new ArrayList<TypeDTO>();
		
		// STATIC EXAMPLE 
		response.add(getStaticExample());
		
		// FINAL EXAMPLE 		
		response.add(getFinalExample());
		
		
		
		
		return response;
		
	}
	
	/** 
	 * <h1>Final EXAMPLE</h1>
	 * <b>getFinalExample</b> will get the test cases about Final keyword
	 * **/
	private TypeDTO getFinalExample() {
		FinalClass   finalClass 	   = new FinalClass(); 
		List<String> finalClassTestLst = new ArrayList<String>();
		TypeDTO      finalResponse 	   = new TypeDTO();
		
		// Setting the name of test
		finalResponse.setName( "FINAL EXAMPLE" );
		finalClassTestLst.add("Final Class " + finalClass);
		
		// setting the test cases for this type
		finalClassTestLst.add("Final Variables " + finalClass.getFinalVariable() );
		finalClassTestLst.add("Final Variables " + finalClass.getFinalMethod() );
		
		// line below will add the entire Test to Data Transfer Object
		finalResponse.setResponse(finalClassTestLst);
		
		return finalResponse;
	}

	/** 
	 * <h1>STATIC EXAMPLE</h1>
	 * <b>getStaticExample</b> will get the test cases about Static keyword
	 * **/
	private TypeDTO getStaticExample() {
		StaticClass  staticClass    = new StaticClass(); 
		List<String> staticTest     = new ArrayList<String>();
		TypeDTO      staticResponse = new TypeDTO();
		
		// Setting the name of test
		staticResponse.setName( "STATIC EXAMPLE" );
		
		// setting the test cases for this type
		staticTest.add( " Public variable " + staticClass.publicData );
		StaticClass firstInstanceStaticClass = new StaticClass(); 
		StaticClass secondInstanceStaticClass = new StaticClass(); 
		StaticClass thirdInstanceStaticClass = new StaticClass();
		staticTest.add(" Public variable " + firstInstanceStaticClass.getPublicData() );
		staticTest.add(" Public variable " + secondInstanceStaticClass.getPublicData() );
		staticTest.add(" Public variable " + thirdInstanceStaticClass.getPublicData() );
		staticTest.add(" STATIC variable " + StaticClass.getStaticData() );
		
		// line below will add the entire Test to Data Transfer Object
		staticResponse.setResponse( staticTest );
		
		return staticResponse;
	}

}