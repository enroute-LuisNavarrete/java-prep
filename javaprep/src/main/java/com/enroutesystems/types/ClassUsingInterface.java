package com.enroutesystems.types;

public class ClassUsingInterface implements InterfaceTest {

	@Override
	public String interfacMethod() {
		// TODO Auto-generated method stub
		return "Method have specific functions but is defined on InterfaceTest";
	}
	
	
	
	
}


interface InterfaceTest {
	
	
	public String interfacMethod();
		
}