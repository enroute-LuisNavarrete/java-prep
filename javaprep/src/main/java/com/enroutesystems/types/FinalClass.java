package com.enroutesystems.types;

/**
 * This class contains all the test for final clases
 * Attributes for this class
 * <b>neverChange</b> final String <i>This variable cant change its value</i>
 * **/
public class FinalClass  {
	
	/**
	 * <b>Variable neverChange</b> its value never change
	 * */
	final String  neverChange = "This variable cant change its value";

	/**
	 * final Method stop the process for overriding 
	 * */
	final String method() {
		return "This method can't be override";
	}
	
	public String getFinalVariable() {
		return neverChange + "\n Final Variables could be visibles with public method ";
	}
	
	public String getFinalMethod() {
		return method() + "\n Final methods could be visibles with public method ";
	}
}

/**
 * The Class below is not Possible To be Heritaged 
 * */
final class NotPossibleToHeritage{
	
}