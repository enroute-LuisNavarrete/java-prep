package com.enroutesystems.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.enroutesystems.modifiers.DefaultClass;
import com.enroutesystems.modifiers.PrivateClass;
import com.enroutesystems.modifiers.PublicClass;
import com.enroutesystems.modifiers.ProtectedClass;

public class ModifiersServiceImpl {
	
	public List<String> getModifiers(){
		List<String> greetings = new ArrayList<String>();
		
		
		PublicClass publicClass = new PublicClass(); 
		
		greetings.add( "PUBLIC ACCESS" );
		greetings.add( publicClass.access2Sameclass() );
		greetings.add( publicClass.access2SamePackage() );
		greetings.add( publicClass.access2Subclass() );
		greetings.add( publicClass.access2Anywhere() );
		
		
		PrivateClass privateClass = new PrivateClass(); 
		
		greetings.add( "PRIVATE ACCESS" );
		greetings.add( privateClass.access2Sameclass() );
		greetings.add( privateClass.access2SamePackage() );
		greetings.add( privateClass.access2Subclass() );
		greetings.add( privateClass.access2Anywhere() );
		
		DefaultClass defaultClass = new DefaultClass(); 
		
		greetings.add( "DEFAULT ACCESS" );
		greetings.add( defaultClass.access2Sameclass() );
		greetings.add( defaultClass.access2SamePackage() );
		greetings.add( defaultClass.access2Subclass() );
		greetings.add( defaultClass.access2Anywhere() );
		
		ProtectedClass protectedClass = new ProtectedClass(); 
		
		greetings.add( "PROTECTED ACCESS" );
		greetings.add( protectedClass.access2Sameclass() );
		greetings.add( protectedClass.access2SamePackage() );
		greetings.add( protectedClass.access2Subclass() );
		greetings.add( protectedClass.access2Anywhere() );
		
		
		return greetings;
	}
	
	
	
	
}
