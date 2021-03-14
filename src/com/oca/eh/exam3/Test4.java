//$Id$
package com.oca.eh.exam3;

public class Test4 {
	static int numrator = 10;
	static int denominator = 5;
	public static void main(String[] args){
		try{
			System.out.println(numrator/denominator);
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}catch(EOFException e){
			System.out.println("EOFException");
		}catch(Exception e){
			System.out.println("Exception");
		}
	}
}

//what will be the output of following code if we try to compile and run?

//2
//2.0
//ArithmeticException
//EOFException
//Exception
//Compiler Error

//Compiler does not allow catching specific checked Exception if they are not thrown, for Unchecked Exception there
//is no restriction.
//although Exception is checked type but its parent of RuntimeException therefore it falls under the category of
//unspecific checked one therefore no compiler error here either
//EOFException is a specific checked Exception therefore compiler will not allow it and compiler error will be thrown
