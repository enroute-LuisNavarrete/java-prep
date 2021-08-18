package com.enroutesystems.types;

import java.util.List;

public class StaticClass {
	// variable declare as Static
	static String var = "StaticClass";
	public int publicData = 0;
	static int staticData = 0;

	// Static variable can change value with next Static block
	static {
		var += " Starts";
	}
	
	public StaticClass() {
		publicData++;
		staticData++;
	}
	
	public  static int  getStaticData() {
		return staticData;
	}
	
	public  int  getPublicData() {
		return this.publicData;
	}
 
}
