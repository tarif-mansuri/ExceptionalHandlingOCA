//$Id$
package com.oca.eh.exam5;

import java.io.EOFException;
import java.io.IOException;

public class Test8 {
	public static void main(String[] args){
		try{
			try{
				throw new EOFException();
			}catch(IOException e){
				System.out.print("LogIN ");
				throw e;
			}finally{
				System.out.print("LogOut ");
			}
		}catch(Exception e){
			System.out.print("LogIN ");
		}finally{
			System.out.print("LogOut ");
		}
	}
}
//what will be output of following code if compiled and executed?

//ans=>LogIN LogOut LogIN LogOut
//LogIN LogIN LogOut LogOut
//LogOut LogIN LogOut
//LogIN LogIN LogOut
//Compiler Error

//in above code we have used nested try block that is allowed we can nest them upto any depth we wish, therefore no
//compiler error
//inner try block throws EOFException that is a subtype of IOException, therefore inner catch block will catch it print 
//LogInand then throw it to outer block but before execution comes to out block, it will execute internal final block and 
//will print LogOut

//Outer catch block is catching Exception type therefore EOFException will be caught here and LogIn will get printed again
//finally outer final block will be executed and it will print LogOut

