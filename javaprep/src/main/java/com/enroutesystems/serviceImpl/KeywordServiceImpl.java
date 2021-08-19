package com.enroutesystems.serviceImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.enroutesystems.keywords.KeywordsClass;
import com.enroutesystems.modifiers.dto.KeywordsDTO;

public class KeywordServiceImpl {
	
	public List<KeywordsDTO> getKeywordExample() {
		
		List<KeywordsDTO> response = new ArrayList<KeywordsDTO>();
		
		// TRANSIENT EXAMPLE
		response.add( testTransient()    );
		
		// synchronyze EXAMPLE
		response.add( testSynchronize() );
		
		return response;
	} 

	public KeywordsDTO testTransient() {
		KeywordsDTO    transientResponse = new KeywordsDTO();
		
		// Setting the name of test
		transientResponse.setName( "TRANSIENT EXAMPLE" );
		
		KeywordsClass test = new KeywordsClass();
    	
    	test.getList4TestTrasient();
		
		// line below will add the entire Test to Data Transfer Object
		transientResponse.setTest( test.getList4TestTrasient().stream().toString() );
		
    	return transientResponse;
    }
	
	
	public KeywordsDTO testSynchronize() {
		KeywordsDTO    synchronizeResponse = new KeywordsDTO();
		
		ExecutorService serviceCount = null;
		StringBuilder   response     = new StringBuilder();
		try {
			synchronizeResponse.setName("Synchornize Test");
			
			serviceCount = Executors.newFixedThreadPool(10);
			
			KeywordsClass kc = new KeywordsClass();
			for (int iterator =0; iterator < 10; iterator++) {
				Future<Integer> i = serviceCount.submit(() -> kc.countSynchronizedTests());
				response.append("Future Counter will be printed on console:: " + i );
			}
			
			synchronizeResponse.setTest("" + response);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if( serviceCount != null ) serviceCount.shutdown();
		}
		
		return synchronizeResponse;
		
	}
	
}
