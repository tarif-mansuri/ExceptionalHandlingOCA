//$Id$
package com.oca.eh.exam6;

import java.io.IOException;

public class Test11 {
	private static void main() throws IOException{
		throw new IOException();
	}
	public static void main(String[] args){
		try{
			main();
		}finally{
			System.out.println("Finally found you!");
		}
	}
}
//what will be the output if compile and execute following code?

//Finally found you! gets printed then program ends abruptly
//Finally found you! gets printed then program ends normally
//prints nothing but program ends normally
//prints nothing and program ends abruptly
//ans=>Compiler Error

//main() method throws IOException that is a checked Exception, all checked Exceptions must be either declared by calling function OR
//must be handled in catch block. otherwise Compiler Error will be shown