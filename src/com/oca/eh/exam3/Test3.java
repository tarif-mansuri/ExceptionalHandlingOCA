//$Id$
package com.oca.eh.exam3;

public class Test3 {
	static Integer i;
	static int i1 = i.intValue();
	public static void main(String[] args){
		if(i==null){
			System.out.println("i is null");
		}
		else{
			System.out.println("i is not null");
		}
	}
}
//what will be the output of following code if we try to compile and run?

//i is null
//i is not null
//Compiler Error
//ans=>NullPointerException is thrown at runtime

//To invoke main method in the class, classloader loads the class in the memory and initialises all static fields
//since i has not been given any value to initialise, it gets initialises with default initial value null
//to initialise i1, intValue() is called on reference variable that is pointing to null hence NullPointerException
//is thrown at runtime