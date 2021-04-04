//$Id$
package com.oca.eh.exam5;

import java.sql.SQLException;

public class Test11 {
//start from here Adding into Test6
}
interface Adder{
	public int add(int... a) throws SQLException;
}
class Add implements Adder{

	@Override
	public int add(int... a) throws /*Insert*/ {
		int sum = 0;
		for(int x:a)
			sum+=x;
		return sum;
	}
	
}
//there is compiler Error in the code, select all which can replace /*Insert*/ and enable the code to compile
//(ignore import statements)

//Throwable
//Exception
//IOException
//ans=>Error
//ans=>NullPointerException
//ans=>RuntimeException
//ans=>SQLException

//In function overriding we can restrict the Exception thrown by function being overridden(function from super class/interface)
//Restrict means we can either declare the same exception as parents class method is declaring or any of its sub type, we are allowed
//to not declare any Exception at all and that will work fine 

//But we can not declare using super type, that will not work, Throwable and Exception are super types of SQLException therefore
//they will not remove compiler error, IOException is not related to SQLException therefore this is also not an answer

//Unchecked Exceptions are allowed to be declared even if they are never bing thrown at all therefore all unchecked Exceptions/Errors
//will work
//Insert image