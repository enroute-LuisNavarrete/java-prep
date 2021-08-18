package com.enroutesystems.types;

public class AbstractClass extends TestAbstractClass {

	@Override
	public String abstractMethod() {
		super.abstratVariable = " super.abstratVariable ";
		String stringOriginal =  "Abstract method define the behaviour of subclasses";
		return stringOriginal;
	}

	@Override
	public String retrievingAbstractVariable() {
		super.abstratVariable = " super.abstratVariable ";
		String stringOriginal =  "Abstract variables are accesible from Subclasses with super.abstratVariable=" + super.abstratVariable; 
		String stringAmend = " and its value could be change super.abstratVariable=" + super.abstratVariable;
		return stringOriginal + " " + stringAmend;
	}

	
		
	
}

abstract class TestAbstractClass {

	String abstratVariable;
	
	abstract String retrievingAbstractVariable();
	
	abstract String abstractMethod();
	
}
