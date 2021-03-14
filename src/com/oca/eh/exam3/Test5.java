//$Id$
package com.oca.eh.exam3;

public class Test5 {
	public static void main(String[] args){
		Parent p = new Child();
		p.m();
	}
}
class Parent{
	public void m() throws UnknownError{
		System.out.println("Throws UnknownError");
	}
}
class Child extends Parent{
	public void m() throws VirtualMachineError{
		System.out.println("Throws VirtualMachineError");
	}
}

//what will be the output of following code if we try to compile and run?

//Compiler Error in Child class
//Compiler Error in Test class
//ans=>Throws VirtualMachineError
//Throws UnknownError

//it seems that Child class will throw Compiler Error because VirtualMachineError is not a sub type of UnknownError
//but it doesn't throw any compiler error, the reason is both the classes belong to Unchecked Exception category 
//for unchecked exception there are no rule for overriding

//hence program compiles fine and prints Throws VirtualMachineError because Child class has overridden the function 