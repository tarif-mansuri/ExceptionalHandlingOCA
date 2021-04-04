//$Id$
package com.oca.eh.exam6;
//Added in Test5
import java.io.IOException;

public class Test15 {
	private static void getException()throws IOException{
		try{
			throw new IOException();
		}catch(Exception e){
			e = new IOException();
			throw e;
		}
	}
	public static void main(String[] args){
		try{
			getException();
		}catch(IOException e){
			System.out.println("Got It!");
		}
	}
}
//what will be the output if compile and execute following code?

//ans=>method getException causes Compiler Error
//method main causes Compiler Error
//stack trace is printed on runtime ant program ends abruptly
//prints Got It!

//if you throw e from catch block without initialising it with e = new IOException(); it compiles and runs fine
//because compiler is certain that the object will be of IOException type only but if you initialise it in catch block
//compiler considers it as an object of Exception type and causes compiler error