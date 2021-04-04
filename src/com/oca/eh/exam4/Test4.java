//$Id$
package com.oca.eh.exam4;

import java.io.IOException;

public class Test4 {
	public static String throwsCheckedException() throws IOException{//Line1
		return "Not Throwing Exception";
	}
	public static void main(String[] args){
		private String message = throwsCheckedException(); //Line2
		System.out.println(message);
	}
}
//what will be the output of following code?
//Compiler Error at Line1
//=>Compiler Error at Line2
//runs fine and prints Not Throwing Exception
//Exception thrown at runtime

//if a function declares an Exception, its not mandatory that it should throw that Exception therefore no error in Line1

//local variables (variables declared inside a function) can't not be declared as private, or to be more precise final is
//the  only keyword allowed for local variables, therefore a compiler error will be shown at Line2