package com.enroutesystems.classloader;

import java.util.ArrayList;

import com.sun.javafx.util.Logging;

public class ClassloaderDemo {
	
	public static void main(String varargs[]) {
		try {
			printClassLoaders();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void printClassLoaders() throws ClassNotFoundException {

	    System.out.println("[classpath files] Classloader of this class:"
	        + ClassloaderDemo.class.getClassLoader());

	    System.out.println("[Extensions] Classloader of Logging:"
	        + Logging.class.getClassLoader());

	    System.out.println("[Bootstrap] Classloader of ArrayList:"
	        + ArrayList.class.getClassLoader());
	    
	    
	}
}

