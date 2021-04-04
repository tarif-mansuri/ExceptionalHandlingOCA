//$Id$
package com.oca.eh.exam5;

import java.io.IOException;

public class Test6 {
	private static void myMethod() throws IOException{
		throw null; //Line 1
	}
	public static void main(String[] args){
		try{
			myMethod();
		}catch(IOException e){
			System.out.println("Exception");
		}
	}
}
//what will be output of following code if compiled and executed?
//Compiler Error in Line1
//Compiles fine and prints Exception
//Compiles fine, on execution program ends normally but prints nothing
//ans=>Compiles fine, on execution program ends abruptly

//null can be assign to any reference variable therefore throwing null from a function that declares Exception is fine

//remember that if we throw null, JVM will create a NullPointerException object and throw it, since we are catching IO Exception
// and NullPointerException is not an IOException therefore it won't be caught