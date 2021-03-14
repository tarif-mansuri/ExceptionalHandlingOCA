//$Id$
package com.oca.eh.exam2;

public class Test3 {
	public static void main(String[] args){
		MyException exception = new MyException();
		try{
			exception.fun();
		}catch(Exception e){//Line1
			System.out.println("Exception is thrown");
		}catch(MyException me){//Line2
			System.out.println("MyException is thrown");
		}finally{
			System.out.println("finally ran");
		}
	}
}
class MyException extends Exception{
	public void fun() throws Exception{//Line3
		throw new MyException();
	}
}
//what will be the output of following code if we try to compile and run?

//Compiler Error at Line1

//=>Compiler Error at Line2

//Compiler Error at Line3

//Exception is thrown
//finally ran

//MyException is thrown
//finally ran

//we can create custom exceptions by extending Exception class also a function can either throw what it has declared 
//or its sub type therefore there is nothing wrong in MyException class

//at Line1 we are catching Exception, since we can catch an exception by its parent name, no compiler error in line1 either

//MyException is sub type of Exception therefore in Line1 MyException will also be catched by Exception and hence Line2 catch block
//becomes UnReachable catch block, Compiler error will be shown in Line2