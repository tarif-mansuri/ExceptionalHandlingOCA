//$Id$
package com.oca.eh.newques;

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
	B(){
		try{
			super();
		}catch(EOFException e){}
	}
}

//ans=>Compiler Error in class B
//Compiler Error in class A and class B
//Compiler Error in Test class
//prints AB
//prints BA

//Constructors can throw Exceptions therefore there is no Error with throws keyword

//child constructor should have either this() or super() as its first line but in class B we are putting it as second line
//hence compiler error will be thrown



