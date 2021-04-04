//$Id$
package com.oca.eh.exam4;

public class Test6 {
	public static void main(String[] args){
		try{
			for(;;){
				StringBuilder sb = new StringBuilder();
				sb.append("Hello");
				System.out.println(sb);
			}
		}catch(Exception e){
			System.out.println("Exception Occurred");
		}
		System.out.println("Main Ended");
	}
}
//what will be the output of following code?

//ans=>prints Hello infinitely
//prints Exception Occurred and program ends normally
//prints Exception Occurred and program ends abruptly
//OutOfMemoryError is thrown and program ends abruptly

//for(;;) is infinite loop, 
//1st iteration=> it will create a reference variable sb and an object of StringBuilder type, assigns it to sb
//2nd iteration=> before start of second iteration sb variable will be destroyed and it will make the object sb eligible 
//for garbage collector.
//as we can see in each iteration we are making object eligible to garbage collector hence we will never run OutOfMemory
//each time it will print Hello.