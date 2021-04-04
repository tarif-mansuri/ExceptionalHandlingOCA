//$Id$
package com.oca.eh.exam6;

import java.io.EOFException;
import java.io.IOException;

public class Test14 {
	public static void main(String[] args)throws Exception{
		new Derived();
	}
}
class Base{
	Base()throws IOException{
		System.out.print("B");
	}
}
class Derived extends Base{
	Derived()throws EOFException{
		System.out.print("D");
	}
}
//what will be the output if compile and execute following code?

//ans=>Compiler Error in Derived class
//Compiler Error in Test class
//BD
//DB

//Constructors can throw Exception but they do not get inherited therefore overriding rules do not apply in constructors
//since Derived class constructor will call Base class constructor and Base class constructor is throwing IOException
//therefore calling constructor should declare either its parent type or same Exception but its declaring EOFException 
//a child type of IOException hence compiler error will be thrown in Derived class


