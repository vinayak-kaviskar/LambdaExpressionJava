/**
 * 
 */
package com.jstVnyk.com.LambdaPractice;

/**
 * @author SHADOW
 *
 */

// Example proves that lambda expression can be run only on functioanl interfaces.
// we cannot use normal interface with many functions.
// An interface without @FunctionalInterface Annotation is also a Functional Interface as proved in below example.

interface MyInterface2{
	void function1();
	// void function2();
}


public class LambdaWithoutAnnotationOfFunctionalInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyInterface2 reference = ()->{
			System.out.println("normal interface with only one 1 method can be used while implementing "
					+ "lambda exp even without @FunctionalInterface Annotation");
		};
		
		reference.function1();
	}

}
