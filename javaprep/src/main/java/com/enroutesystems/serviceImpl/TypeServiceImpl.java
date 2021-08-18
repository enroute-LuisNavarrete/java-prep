package com.enroutesystems.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.enroutesystems.modifiers.dto.TypeDTO;
import com.enroutesystems.types.AbstractClass;
import com.enroutesystems.types.ClassUsingInterface;
import com.enroutesystems.types.FinalClass;
import com.enroutesystems.types.StaticClass;

public class TypeServiceImpl {
	
	/*
	 * 
	 * */
	public List<TypeDTO> getTypeExample() {

		List<TypeDTO> response = new ArrayList<TypeDTO>();

		// STATIC EXAMPLE
		response.add(getStaticExample());

		// FINAL EXAMPLE
		response.add(getFinalExample());

		// STATIC EXAMPLE
		response.add(getInterfaceExample());

		// FINAL EXAMPLE
		response.add(getAbstractExample());

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

	/** 
	 * <h1>INTERFACE EXAMPLE</h1>
	 * <b>getInterfaceExample</b> will get the test cases about Static keyword
	 * **/
	private TypeDTO getInterfaceExample() {
		ClassUsingInterface  interfaceiClass    = new ClassUsingInterface(); 
		List<String> interfaceTest     = new ArrayList<String>();
		TypeDTO      interfaceResponse = new TypeDTO();
		
		// Setting the name of test
		interfaceResponse.setName( "INTERFACE EXAMPLE" );
		
		// setting the test cases for this type
		interfaceTest.add( " Method from interface:: " + interfaceiClass.interfacMethod() );
		
		// line below will add the entire Test to Data Transfer Object
		interfaceResponse.setResponse( interfaceTest );
		
		return interfaceResponse;
	}
	
	/** 
	 * <h1>ABSTRACT EXAMPLE</h1>
	 * <b>getAbstractExample</b> will get the test cases about Static keyword
	 * **/
	private TypeDTO getAbstractExample() {
		AbstractClass  abstractClass    = new AbstractClass(); 
		List<String> abstractTest     = new ArrayList<String>();
		TypeDTO      abstractResponse = new TypeDTO();
		
		// Setting the name of test
		abstractResponse.setName( "ABSTRACT EXAMPLE" );
		
		// setting the test cases for this type
		abstractTest.add( " Abstract variable:: " + abstractClass.retrievingAbstractVariable() );
		abstractTest.add( " Abstract method:: " + abstractClass.abstractMethod() );
		
		// line below will add the entire Test to Data Transfer Object
		abstractResponse.setResponse( abstractTest );
		
		return abstractResponse;
	}
	
}
