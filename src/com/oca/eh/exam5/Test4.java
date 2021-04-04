//$Id$
package com.oca.eh.exam5;

import java.io.IOException;

public class Test4 {
	public static void f1()throws IOException{
		try{
			throw new IOException();//Line1
		}catch(Exception e){
			throw e;//Line2
		}
	}
	public static void main(String[] args){
		try{
			f1();
		}catch(IOException e){
			System.out.println("Exception Caught");
		}
	}
}
//what will be the output of following code?

//ans=>Exception Caught
//Compiler Error in method f1()
//Compiler Error in main method
//program ends abruptly

//it seems that method f1() will cause compiler error but since java 1.7 its allowed to throw an exception from catch block 
//if its object is of child type or of same type that function has declared, even if it has been caught using a parent type

//remember if you assign it explicitly to a parent type then it will cause a compiler error

//for example if you replace Line1 with the following lines it will cause compiler error

//Exception e = new IOException();
//throw e;

//or if you replace Line2 with the following lines it will cause compiler error
//Exception e1 = e;
//throw e1;

