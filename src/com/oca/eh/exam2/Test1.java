//$Id$
package com.oca.eh.exam2;
//Added to first test
import java.io.EOFException;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws EOFException{
		try{
			fun();
		}finally{
			System.out.print("Test");
		}
	}
	private static void fun()throws IOException{
		throw new IOException();
	}
}
//what will be the output of following code if we try to compile and run?
//ans=>Compiler Error
//Test will be printed on the console
//Test is printed then stack trace is printed on the console
//Program ends abruptly

//if a function say f1 call a function say f2 and f2 throws a checked Exception then function f1 should either declare
//or handle the exception, in both the cases (declaring and handling) f1 should use same or parent type class otherwise
//compiler error will be thrown

//in above code fun() throws IOException but main method is declaring EOFException that's why compiler error is thrown
//if main method declare either IOException or its parent like Exception or throwable then compiler error wont be thrown

/*Insert pic*/