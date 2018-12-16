/**
 * 
 */
package com.jstVnyk.com.LambdaPractice;

/**
 * @author SHADOW
 *
 */




@FunctionalInterface
interface FunctionalInterface1{
	public void function1();
	}



public class LambdaPractice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		FunctionalInterface1 refernce = ()->{
			
			System.out.println("Implementing the One and only one function of functional interface");
		};
		
		
		refernce.function1();

	}

}
