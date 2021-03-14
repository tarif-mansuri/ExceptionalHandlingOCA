//$Id$
package com.oca.eh.exam3;

public class Test6 {
	public static void main(String[] args){
		try{
			throw new ArithmeticException();
		}finally{
			System.out.println("OCA");
		}
	}
}

//what will be the output of following code if we try to compile and run?

//OCA is printed then stack trace is printed then program terminates abruptly
//Compiler Error
//OCA is printed then stack trace is printed then program terminates normally
//OCA is printed then program terminates normally

//Program doesn't handles ArithmeticException but it will not cause any compiler error because ArithmeticException is
//unchecked Exception
//since main method doesn't handles Exception it will throw that Exception back to jvm, but just before throwing 
//it will run finally block and will print OCA.
//jvm will print stack trace and program will end abruptly