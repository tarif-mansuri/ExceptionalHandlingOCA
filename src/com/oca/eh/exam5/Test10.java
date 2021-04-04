//$Id$
package com.oca.eh.exam5;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Test10 {
	public static void main(String[] args) throws Exception {
		new B();
	}
}

class Super {
	Super() throws Exception {
		System.out.print("A");
	}
}

class Child extends Super {
	Child() throws EOFException {
		System.out.print("B");
	}
}
//what will be output of following code if compiled and executed?

//ans=>Compiler Error in class Child
//Compiler Error in class Parent
//Compiler Error in class Parent and class Child
//Compiler Error in Test class
//prints AB
//prints BA

//Constructors can throw Exceptions therefore there is no Error with throws keyword

//Constructors do not get inherited therefore, rules related to method override with declaring Exceptions, do not
//follow here but since child class constructor calls super class constructor therefore child class constructor should
//declare the exception.

//if parent class constructor throws an exception child class constructor should declare it with either same type exception class or with
//Parent type exception class



