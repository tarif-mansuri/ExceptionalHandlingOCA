//$Id$
package com.oca.eh.exam6;

import java.io.IOException;

public class Test2 {
	public static void main(String[] args){
		try{
			new B();
		}catch(Exception e){
			System.out.print("E");
		}
	}
}

class A {
	public A() throws Error {
		System.out.print("A");
	}
}

class B extends A {
	public B() throws IOException {
		System.out.print("B");
	}
}
//Compiler error in class A
//Compiler error in class B
//Compiler error in class A and class B
//ans=>AB
//BA
//ABE

//what will be the output if compile and execute following code?

//Constructors can throw Exceptions therefore declaring Exception does not create any trouble, also constructors are not inherited
//therefore overriding rules does not apply here i.e. there is no bound on child class constructor to throw or not to throw any
//exception
//when we create an object of class B it will call constructor of class A and hence first A then B will get printed
