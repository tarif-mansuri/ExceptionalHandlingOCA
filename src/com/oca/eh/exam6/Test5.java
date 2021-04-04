//$Id$
package com.oca.eh.exam6;

public class Test5 {
	public static void main(String[] args){
		try{
			System.out.println(args[0]);
		}catch(RuntimeException e){
			System.out.println("RuntimeException thrown");
		}catch(SQLException e){
			System.out.println("SQLException thrown");
		}
	}
}
//RuntimeException thrown
//SQLException thrown
//ans=>Compiler Error
//null

//what will be the output if compile and execute following code?

//Checked Exceptions can not be caught if never thrown from a try block, SQLException is checked exception
//hence compiler error will be thrown