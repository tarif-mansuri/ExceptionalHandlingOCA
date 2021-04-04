//$Id$
package com.oca.eh.exam6;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test4 {
	public static void main(String[] args){
		EOFException eofex = new EOFException(new FileNotFoundException());//Line1
		FileNotFoundException ioex = new FileNotFoundException(new SQLException());//Line2
		IOException ioEx = new IOException(new FileNotFoundException());//Line3
	}
}

//select all the correct options
//ans=>Compiler Error in Line1
//ans=>Compiler Error in Line2
//Compiler Error in Line3
//Compiles without Errors

//classes EOFException and FileNotFoundException have very similar constructor

//class EOFException has only two constructors
//1.EOFException() No argument constructor and
//2.EOFException(String s) with String argument
//no constructor has been defined to take its object

//Same way FileNotFoundException class also has only two constructors