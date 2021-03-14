//$Id$
package com.oca.eh.exam1;

import java.io.EOFException;
import java.io.IOException;

public class Test4 {
	public static void main(String[] args){
		A a = new A();
		try{
			a.f(); //Line1
		}catch(EOFException ex){ //Line2
			System.out.println("EOFException thrown");
		}finally{
			System.out.println("Finally ran");
		}
	}
}
class A{
	protected void f() throws IOException {
		throw new EOFException(); //Line3
	}	
}
//what will be the output of following code if we try to compile and run?

//ans=>Compiler Error at Line1

//Compiler Error at Line2

//Compiler Error at Line3

//EOFException thrown
//Finally ran

//function f() declares IOException that means function can throw either IOException or a sub type of IOException,
//just like covariant return type. hence no error in Line3

//if you don't catch proper type of Exception, the error will never be shown at catch block but at the line that may
//throw exception, hence no error at Line2

//At compile time compiler knows that function f() can throw either IOException or any of its sub type therefore catch block
//should be prepared to handle any type from IOException to all its children, that could be done by just handling the parent 
//type, that is here, IOException. since its not handling IOException, compiler error will be thrown at line1