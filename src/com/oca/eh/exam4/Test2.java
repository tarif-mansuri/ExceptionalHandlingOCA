//$Id$
package com.oca.eh.exam4;

public class Test2 {
	private static Integer x;
	public static void main(String[] args){
		try{
			System.out.println(x.intValue());
		}catch(NullPointerException | ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}
//what will be the output of the following code
//ans=>null
//stackTrace will be printed
//Compiler Error
//0

//NullPointerException and ArithmeticException both extend RuntimeException hence they are siblings and not related 
//to each other in multi level inheritance (i.e. they are not vertically related) therefore multi catch syntax will
//not throw compiler error instead this is the way to handle in multi catch approach

//before calling to main method class loader loads all static fields and initialises them with default values,x will
//get assigned by null

//when we run program after compilation intValue() method will be invoked on Integer type reference that is pointing 
//to null hence NullPointerException will be thrown

//catch block will catch it and will try to print message from the object of NullPounterException, message field will
//be having value as null. hence null will get printed