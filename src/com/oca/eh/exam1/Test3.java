//$Id$
package com.oca.eh.exam1;


public class Test3 {
	public static void main(String[] args){
		fun(); //Line1
	}
	private static void fun()throws Throwable{ //Line2
		System.out.println("Function may throw an Exception"); //Line3
	}
}
//what will be the output of following code if we try to compile and run?

//ans=>Compiler Error at Line1
//Compiler Error at Line2
//Compiler Error at Line3
//Function may throw an Exception

//if a function calls a function that throws checked Exception, calling function should EITHER handle the Exception
//using try catch blocks OR it should declare the Exception(i.e. throw it back to its parent(calling) function)

//plz see the attached image and remember the checked Vs Unchecked Exception
/*Insert Pic*/