package com.designpattern.singleton;

public final class Singleton {
	private static Singleton inst;
	public String value;
	
	private Singleton(String val) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		this.value = val;
	}
	
	public static Singleton getInstance(String val) {
		// to avoid race condition if two threads are trying to access at the same time using syncronization
		
		synchronized(Singleton.class) {
			if(inst == null) {
				inst = new Singleton(val);
			}
			
			return inst;
		}
	}
	
}
