//$Id$
package com.oca.eh.exam6;

public class Test12 {
	public static void main(String[] args){
		Student std = new JavaStudent();
		((JavaStudent)std).learn(); //Line1
	}
}
interface Student{
	default void learn() throws Exception{
		System.out.println("Learning");
	}
}
class JavaStudent implements Student{
	public void learn() { //Line2
		System.out.println("Learning Java");
	}
}
//what will be the output if compile and execute following code?

//Compiler Error in Line1
//Compiler Error in Line2
//ans=>Learning Java will be printed and program will and normally
//Learning Java will be printed and program will and abruptly

//overriding a method from super class that throws a checked exception are as follows

//overriding method 
//1.May not declare to throw any Exception
//2.May declare to throw the same Exception as overridden method from super class has declared
//3.May declare to throw the child type Exception of what overridden method from super class has declared
//4.Can not declare to throw the Super type Exception of what overridden method from super class has declared
//5.May declare to throw any unchecked Exception or Error
//6.Can not declare to throw unrelated checked Exceptions

//interface Student defines a default method that throws a checked exception of Exception type
//child class JavaStudent overrides the method and chooses not to declare any thrown exception that is valid(see rule 1)

//in main method since we have a reference variable of Student type therefore if we call learn() method on Student reference
//it will throw compiler Error because its method signature declare to throw a checked exception that needs to be either
//handled or declared by calling method main
//but if we type cast it to JavaStudent type it will not throw any compiler error and program will compile and run fine