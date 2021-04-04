//$Id$
package com.oca.eh.exam5;
//Added in Test6
public class Test14 {
	private static void main(){
		try{
			throw new ArithmeticException();
		}catch(ArithmeticException e){
			Exception ex = new Exception(e);
			throw ex;
		}
	}
	public static void main(String[] args){
		try{
			main();
		}catch(Exception e){
			System.out.println("Finished");
		}
	}
}

//Finished is printed and program ends normally
//ans=>Compiler Error
//Finished is printed and program ends abnormally
//Finished is not printed and program ends abnormally

//in method main(), we are throwing checked Exception from catch block but we have not declared it therefore compiler
//error will be shown