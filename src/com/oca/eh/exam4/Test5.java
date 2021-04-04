//$Id$
package com.oca.eh.exam4;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {
	public static void main(String[] args){
		try{
			new B().f1();
		}catch(FileNotFoundException e){
			System.out.print("A");
		}catch(EOFException e){
			System.out.print("B");
		}catch(IOException e){
			System.out.print("C");
		}finally{
			System.out.print("D");
		}
	}
}
abstract class A{
	public abstract void f1() throws IOException;
}
class B extends A{

	@Override
	public void f1() throws IOException {
		throw new EOFException();
	}	 
}
//what will be the output of following code?

//ans=>BD
//AD
//CD
//Compiler Error

//class A has a function that declares IOException

//class B extends class and overrides f1, it declares IOException and throws EOFException, since EOFException is sub type of IOException
//it will cause no trouble

//in test class we are handling in multi catch blocks. when using multi catch block we should make sure that a catch block should not hide
//any catch block coming after it,
//Insert image here