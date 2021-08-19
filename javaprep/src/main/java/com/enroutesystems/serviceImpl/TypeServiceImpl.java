package com.enroutesystems.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.enroutesystems.modifiers.dto.TypeDTO;
import com.enroutesystems.types.AbstractClass;
import com.enroutesystems.types.ClassUsingInterface;
import com.enroutesystems.types.FinalClass;
import com.enroutesystems.types.LambdaClass;
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
		
		// LAMBDA EXAMPLE
		response.add(getLambdaExample());

		return response;

	}
	
	/** 
	 * <h1>FINAL EXAMPLE</h1>
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
		List<String>   abstractTest     = new ArrayList<String>();
		TypeDTO        abstractResponse = new TypeDTO();
		
		// Setting the name of test
		abstractResponse.setName( "ABSTRACT EXAMPLE" );
		
		// setting the test cases for this type
		abstractTest.add( " Abstract variable:: " + abstractClass.retrievingAbstractVariable() );
		abstractTest.add( " Abstract method:: " + abstractClass.abstractMethod() );
		
		// line below will add the entire Test to Data Transfer Object
		abstractResponse.setResponse( abstractTest );
		
		return abstractResponse;
	}
	
	/** 
	 * <h1>LAMBDA EXAMPLE</h1>
	 * <b>getLambdaExample</b> will get the test cases about Static keyword
	 * **/
	private TypeDTO getLambdaExample() {
		List< LambdaClass<String, String> > lambdaInterface = new ArrayList< LambdaClass<String, String> >();
//		new LambdaClass<String, String>();
		List<String>   lambdaTest     = new ArrayList<String>();
		TypeDTO        lambdaResponse = new TypeDTO();
		
		// Setting the name of test
		lambdaResponse.setName( "lambda EXAMPLE" );
		
		// setting the test cases for this type
		lambdaTest.add( "Adding lambda values. Size of Lambda Interface list: " + lambdaInterface.size() );
		
		LambdaClass<String, String>  item1 = new LambdaClass<String, String>("item1", "Red"  );
		LambdaClass<String, String>  item2 = new LambdaClass<String, String>("item2", "Blue" );
		LambdaClass<String, String>  item3 = new LambdaClass<String, String>("item3", "Red"  );
		LambdaClass<String, String>  item4 = new LambdaClass<String, String>("item4", "Green");
		
		lambdaInterface.add( item1 );
		lambdaInterface.add( item2 );
		lambdaInterface.add( item3 );
		lambdaInterface.add( item4 );
		
		lambdaTest.add( "Total of lambda values. Size of Lambda Interface list: " + lambdaInterface.size() );
		lambdaInterface.forEach(System.out::println);
		StringBuilder lambdaTmp = new StringBuilder("");
		lambdaInterface.forEach(e -> { lambdaTmp.append( e.toString() ); } );
		lambdaTest.add( "lambdaInterface.forEach(e -> { lambdaTmp.append( e.toString() ); } );  lambdaTmp::" +    lambdaTmp  );
		lambdaTest.add( "lambdaInterface.stream().filter(e -> e.getValue() == \"Red\")  lambdaTmp::" +    lambdaInterface.stream().filter(e -> e.getValue() == "Red")  );
		
		// line below will add the entire Test to Data Transfer Object
		lambdaResponse.setResponse( lambdaTest );
		
		return lambdaResponse;
	}
	
}
