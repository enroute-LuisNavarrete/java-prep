package com.enroutesystems.annotations;


public class AnnotationsDemo {
	
	
	public static void main(String... args) {
		System.out.println("Annotations Demo");
		
		Engineer e = new Engineer();
		
	}
	

}

@EngineerRequest(id = 0, synopsis = "")
class Engineer {
	
//	int    id;
//	String synopsis;
	
}



//public interface House {
//    @Deprecated
//    void open();
//    void openFrontDoor();
//    void openBackDoor();
//}

