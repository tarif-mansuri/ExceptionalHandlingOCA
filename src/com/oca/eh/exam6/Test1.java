//$Id$
package com.oca.eh.exam6;
//Added in Test5
public class Test1 {
	public static void main(String[] args){
		try{
			try{
				throw new ArithmeticException();
			}catch(ArithmeticException e){
				System.out.println("Inner_Catch");
			}finally{
				System.out.println("Inner_Finally");
			}
		}catch(ArithmeticException e){
			System.out.println("Outer_Catch");
		}finally{
			System.out.println("Outer_Finally");
		}
	}
}
//what will be the output if compile and execute following code?

//ans=>
//Inner_Catch
//Inner_Finally
//Outer_Finally

//Inner_Catch
//Inner_Finally

//Inner_Catch
//Outer_Finally

//Outer_Catch
//Inner_Finally
//Outer_Finally

//Inner_Catch
//Outer_Catch
//Inner_Finally
//Outer_Finally

//When ArithmeticException is thrown from inner try block it will be caught by inner catch block and Inner_Catch will get printed
//since inner catch block is not re throwing it, it will not propagate to outer block and inner finally block then outer finally 
//block will be executed