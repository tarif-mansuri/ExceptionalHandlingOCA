//$Id$
package com.oca.eh.exam5;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Test9 {
	public static void main(String[] args) throws Exception {
		new B();
	}
}

class A {
	A() throws EOFException {
		System.out.print("A");
	}
}

class B extends A {
	B() throws Exception {
		System.out.print("B");
	}
}

//Compiler Error in class B	
//Compiler Error in class A and class B
//Compiler Error in Test class
//ans=>prints AB
//prints BA
//what will be output of following code if compiled and executed?

//Constructors can throw Exceptions therefore there is no Error with throws keyword

//Constructors do not get inherited therefore, rules related to method override with declaring Exceptions, do not
//follow here but since child class constructor calls super class constructor therefore child class constructor should
//declare the exception.

//if parent class constructor throws an exception child class constructor should declare it with either same type exception class or with
//Parent type exception class



