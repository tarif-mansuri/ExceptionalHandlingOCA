//$Id$
package com.oca.eh.exam5;

public class Test5 {
	private static void fun(){
		throw new StringIndexOutOfBoundsException();
	}
	public static void main(String[] args){
		try{
			fun();
		}finally{
			System.out.println("Hello");
		}
	}
}
//what will be the output of following code?

//Hello printed, stack trace printed then program ends normally
//Compiler Error
//ans=>Hello printed, stack trace printed then program ends abruptly
//Hello printed then program ends normally

//since StringIndexOutOfBoundsException is an unchecked Exception therefore method need not to declare before throwing
//since we are not catching StringIndexOutOfBoundsException, Exception will propagate to JVM but before that finally 
//block will execute and will print Hello, then JVM will print stack trace and program will terminate abruptly