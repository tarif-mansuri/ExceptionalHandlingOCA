//$Id$
package com.oca.eh.exam6;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args){
		IOException ex1 = new IOException();//Line1
		IOException ex2 = new IOException(new IOException());//Line2
		IOException ex3 = new IOException("Input Output Exception");//Line3
	}
}

//Compiler Error at Line1
//Compiler Error at Line2
//Compiler Error at Line3
//ans=>Compiles Successfully

//what will be the output if compile and execute following code?

//In Exception hierarchy Throwable is the root class, it provides 5 constructors among those 5 following three are
//mostly used constructors
//1.Throwable()
//Constructs a new throwable with null as its detail message.

//Throwable(String message)
//Constructs a new throwable with the specified detail message.

//Throwable(Throwable cause)
//Constructs a new throwable with the specified cause and a detail message of (cause==null ? null : cause.toString()) 
//(which typically contains the class and detail message of cause).

//Almost all Exception classes provide above constructors (Except FileNotFoundException and EOFException)

//since all three constructors are valid for IOException there will be no error
