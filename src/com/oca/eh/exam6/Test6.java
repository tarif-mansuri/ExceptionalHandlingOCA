//$Id$
package com.oca.eh.exam6;
//start adding in Test5 from here
import java.io.IOException;

public class Test6 {
	public static void doReadWrite() throws IOException {
		try {
			throw new IOException();
		} catch (Exception e) {
			throw null; // Line1
		}
	}

	public static void main(String[] args) {
		try {
			doReadWrite();//Line2
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
//what will be the output if compile and execute following code?

//Compiler Error at Line1
//Compiler Error at Line2
//compiles fine, on execution prints null and program ends normally
//compiles fine, on execution prints stack trace and program ends normally
//ans=>compiles fine, on execution prints stack trace and program ends abruptly

//All the exception class are java classes only therefore we can assign null to any reference variable of exception classes 
//and no compiler error will cause at Line1 due to this

//main method is calling doReadWrite method and handles IOException properly hence no compiler error here either

//Remember whenever null is thrown from try or catch block, JVM will consider it as throwing an Object of NullPointerException
//NullPointerException is runtime(unchecked) exception and it can not be caught using IOException therefore main method will
//throw it back to JVM, stack trace will be printed and program will end abruptly

