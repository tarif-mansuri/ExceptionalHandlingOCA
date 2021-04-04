//$Id$
package com.oca.eh.exam6;

public class Test7 {
	private static void run() throws RuntimeException{
		try{
			throw new ArithmeticException();
		}catch(ArithmeticException e){
			RuntimeException e1 = (RuntimeException)e;
			throw e1;
		}
	}
	public static void main(String[] args){
		try{
			run();
		}catch(ArithmeticException e){
			System.out.println("AE Object");
		}catch(RuntimeException e){
			System.out.println("RE Object");
		}
	}
}
//what will be the output if compile and execute following code?

//Compiler Error
//ans=>prints AE Object and program ends normally
//prints AE Object and program ends abruptly
//prints RE Object and program ends normally
//prints RE Object and program ends abruptly



//A function can throw runtime exceptions without declaring them also RuntimeException is parent type of Arithmetic Exception
//therefore no compiler Error will be thrown

//even though we have type casted the object of ArithmeticException and assigned it to a reference variable of RuntimeException
//but still the object is of ArithmeticException and which will be caught in main method and AE Object will be printed


