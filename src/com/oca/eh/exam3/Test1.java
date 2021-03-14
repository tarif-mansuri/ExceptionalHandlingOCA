//$Id$
package com.oca.eh.exam3;
//Added to fourth test
public class Test1 {
	public static void main(String[] args){
		StackOverflowError npe = new StackOverflowError();
		//boolean b1 = npe instanceof Exception; //Line1
		boolean b2 = npe instanceof Error; //Line2
		boolean b3 = npe instanceof VirtualMachineError; //Line3
		//boolean b4 = npe instanceof OutOfMemoryError; //Line4
		//boolean b5 = npe instanceof IOError; //Line5
		System.out.println(b1+":"+b2+":"+b3+":"+b4+":"+b5);//Line6
	}
}
//this question may have more than one answer, select all that is correct 
//false:true:true:false:false
//ans=>Compiler Error in Line1
//Compiler Error in Line2
//Compiler Error in Line3
//ans=>Compiler Error in Line4
//ans=>Compiler Error in Line5
//ans=>Compiler Error in Line6