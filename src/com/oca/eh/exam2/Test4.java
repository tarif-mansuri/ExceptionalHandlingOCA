//$Id$
package com.oca.eh.exam2;

import java.io.IOException;

public interface Test4 {
	public void fun() throws IOException;
}
//select all that implements above interface correctly, assume that all needed imports have been done

//class A implements Test{
//	@Override
//	public void fun() throws Exception {
//		
//	}
//}

//ans=>
//class A implements Test{
//	@Override
//	public void fun() throws FileNotFoundException {
//		
//	}
//}

//ans=>
//class A implements Test{
//	@Override
//	public void fun() throws EOFException {
//		
//	}
//}

//class A implements Test{
//	@Override
//	public void fun() throws Throwable {
//		
//	}
//}

//ans=>
//class A implements Test4{
//	@Override
//	public void fun() {}
//}

//while implementing an interface or extending a class that has a function declaring an exception, implementing class must follow
//these rules for declaring the exception
//1.declare the same exception as parent class function has declared
//2.declare child type exception of what parent class function has declared
//3.do not declare any
//we can say that it should be done in the way that is restrictive in nature
