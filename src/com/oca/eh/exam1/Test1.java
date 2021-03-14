//$Id$
package com.oca.eh.exam1;
//Added into second Exam Test2
public class Test1 {
	static private Object obj;
	static{
		System.out.println(obj.toString());
	}
	public static void main(String[] args){
		
	}
}

//what will be the output of following code if we try to compile and run?

//Compiler Error because variable object may have not been initialised
//Compiles and runs fine but no output on the console
//prints a random string with symbol @
//ans=>NullPointerException is thrown at runtime

//Static fields are initialised when the class is loaded by the class loader,and this happens in the order they appear in the class.
//therefore obj will get initialised with default value that is null for all non primitives(Object type variables). 

//since obj has been declared before the static block, it will get initialised first and then static block will be executed
//obj is referring to null therefore NullPointerException will be thrown at runtime