//$Id$
package com.oca.eh.exam4;
//Added in Test3
public class Test7 {
	static double[] arr;
	public static void main(String[] args){
		if(arr!=null){
			System.out.println(arr.toString());
		}
		else{
			System.out.println(arr.length);
		}
	}

}
//ans=>NullPointerException
//No Output
//Compiler Error
//0

//to run main method class loader loads the class and initialises all static fields, arr will be initialised with null because
//initial value has not been provided
//if(arr!=null) we become false therefore else block will be executed
//since arr is refering to null, arr.length will throw NullPointerException
