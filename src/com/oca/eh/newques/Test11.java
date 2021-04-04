//$Id$
package com.oca.eh.newques;

import java.io.IOException;

public class Test11 {
	private static void main() throws IOException{
		throw new IOException();
	}
	public static void main(String[] args)throws IOException{
		try{
			main();
		}finally{
			System.out.println("Finally found you!");
		}
	}
}
//ans=>Finally found you! gets printed then program ends abruptly
//Finally found you! gets printed then program ends normally
//prints nothing but program ends normally
//prints nothing and program ends abruptly
//Compiler Error

//main() method throws IOException that is a checked Exception, all checked Exceptions must be either declared by calling function OR
//must be handled in catch block. otherwise Compiler Error will be shown

//since calling method is also declaring the Exception, no compiler error will be shown
