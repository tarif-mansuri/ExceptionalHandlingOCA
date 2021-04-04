//$Id$
package com.oca.eh.exam5;

public class Test7 {
	public static void main(String[] args){
		M obj = new N();
		((N)obj).print();//Line1
		((N)obj).print("Message");//Line2
	}
}
abstract class M{
	abstract public void print() throws ArithmeticException;
}
class N extends M{

	@Override
	public void print() {//Line3
		System.out.print("No arg");
	}
	public void print(String message) throws ArithmeticException {
		System.out.print(message);
	}
}
//what will be output of following code if compiled and executed?

//ans=>No argMessage
//Compiler Error in Line1
//Compiler Error in Line2
//Compiler Error in Line3

//while overriding a method Child class can declare a sub type or it can totally skip declaring an Exception therefore 
//there wont be a compiler error at Line3

//Since object is of N type it can call all methods available in class N after we explicitly type cast it to N type
//hence no error in Line2 or Line3, program compiles and executes fine and prints argMessage

