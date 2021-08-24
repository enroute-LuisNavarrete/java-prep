package com.enroutesystems.annotations;

 
/**
 * @engineerRequest
 * This annotation aims to specify the correct Engineer request 
 * */
public @interface EngineerRequest {
	int id();
	String synopsis();
	String engineer() default "Unassigned";
	String date() default "Unkwon";
}
