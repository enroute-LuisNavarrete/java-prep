package com.enroutesystems.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


class AtomicCountDemo {
	private AtomicInteger count = new AtomicInteger(0);
	
	private int noAtomicCounter;
	
	public int  increaseCount() {
	    return count.getAndIncrement();
    }
	 

	public AtomicInteger getCounter() {
	    return this.count;
    }
	
	public void increaseNoCount() {
		noAtomicCounter++;
    }
	 

	public int getNoCounter() {
	    return this.noAtomicCounter;
    }
	
}

public class AtomicDemo {

	public static void main(String[] args) {
		ExecutorService serviceCount = Executors.newFixedThreadPool(10);
		StringBuilder   response     = new StringBuilder();
		AtomicCountDemo acd = new AtomicCountDemo();

		Runnable counterTask1 = ()->{
			for(int i = 0; i < 2000;i++ ) {
				acd.increaseCount();
				acd.increaseNoCount();
			}
		};
		
		Runnable counterTask2 = ()->{
			for(int i = 0; i < 8000;i++ ) {
				acd.increaseCount();
				acd.increaseNoCount();
			}
		};
		
		serviceCount.submit(counterTask1);
		serviceCount.submit(counterTask2);
		try {
			serviceCount.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			if(serviceCount != null) {
				serviceCount.shutdown();
			}
		}

		System.out.println(response);
		System.out.println("final value of Atomic Counter " + acd.getCounter());
		System.out.println("final value of Non Atomic Counter " + acd.getNoCounter());
	}

}


