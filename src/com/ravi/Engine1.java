package com.ravi;
@FunctionalInterface
public interface Engine1 {
	
	 void start(int x) ;
		
	 default void start1() {
		 System.out.println("car started");
	 }
}
