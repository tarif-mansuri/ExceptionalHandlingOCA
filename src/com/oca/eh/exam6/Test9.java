//$Id$
package com.oca.eh.exam6;

public class Test9 {
	public static void main(String[] args){
		AA a = new BB();
		a.print();
	}
}
class AA{
	public void print() throws NullPointerException{
		System.out.println("A:Class");
	}
}
class BB extends AA{
	public void print() throws RuntimeException{
		System.out.println("B:Class");
	}
}
//what will be the output if compile and execute following code?


//Compiler Error in class B
//Compiler Error in Test class
//ans=>B:Class
//A:Class

//NullPointerException is unchecked(RuntimeException) hence overriding method may declare to throw any unchecked Exception or may not 
//declare any Exception

//reference variable is of A type but it holds reference of B type object hence at runtime B class version method will be executed
//and it will print B:Class