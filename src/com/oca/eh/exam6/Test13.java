//$Id$
package com.oca.eh.exam6;

public class Test13 {
	public static void main(String[] args){
		try{
			eat();
			return; //Line1
		}catch(Exception e){
			System.out.println(e.getMessage());
			return; //Line2
		}finally{
			System.out.println("Still Hungry");
			//return; //Line3
		}
		System.out.println("Feeling Hungry"); //Line4
	}

	private static void eat()throws Exception{
		throw new Exception("Ate");
	}
}
//Currently program is not compiling, select all options that will remove the compiler error
//Comment Line3
//Comment Line2
//Comment Line1
//ans=>comment Line2 and Line3
//ans=>comment Line1 and Line3
//ans=>comment Line1, Line2 and Line3


//finally block will execute before Line4 for sure, so putting return in finally block will make Line4 as unreachable code
//therefore Line3 must be commented

//both try and catch blocks are having return statement which means either of the return statement will definitely get executed that 
//will also make Line4 as unreachable code therefore at least one of them should be commented

//conclusion is Line3 and either Line1 or Line2 must be commented 
