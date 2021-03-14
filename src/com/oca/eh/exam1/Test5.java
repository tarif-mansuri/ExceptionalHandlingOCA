//$Id$
package com.oca.eh.exam1;
//Complete the explanation then proceed
public class Test5 {
	public static void main(String[] str){
		try{
			main(str);
			System.out.println("Hi");
		}catch(Exception e){
			System.out.println("Got Exception!");
		}
	}
}
//what will be the output of following code if we try to compile and run?

//Compiler Error
//Got Exception!
//Compiles fine, System.out.println("Hi"); gets executed more than once
//ans=>Compiles fine, System.out.println("Hi"); will never get Executed

//we are catching Exception therefore every Exception and its sub type will be caught if thrown. main method is recursively calling itself 
//and StackOverflowError will be thrown. Since StackOverflowError is not a sub type of Exception, it will not be caught

//if you try to catch a specific checked exception that in never thrown compiler error will be shown but you can catch any unchecked Exception
//Exception no matter if it will be thrown or not

//Exception is super type of RuntimeException, and RuntimeException is unchecked Exception that means Exception can be used to catch
//RuntimeException, thats why catching Exception does not show any compiler error

