//$Id$
package com.oca.eh.exam5;
//Added in Test6
public class Test1 {
	public static void main(String[] args){
		Greeter[] myGreeter = new Greeter[2];//Line1
		for(Greeter greeter : myGreeter){
			greeter.greet(); //Line2
		}
	}
}
interface Greeter{
	void greet();
}
//what will be the output of following code?
//ans=>Exception thrown at runtime
//Line1 causes Compiler Error
//Line2 causes Compiler Error
//Program executes without any error printing nothing on the console

//Greeter[] myGreeter = new Greeter[2]; creates an array of Greeter type, it can hold references of two Greeter type objects
//initially array will be referring to null, i.e. myGreeter[0]=null and myGreeter[1]=null
//hence invoking any function will throw NullPointerException at runtime.




