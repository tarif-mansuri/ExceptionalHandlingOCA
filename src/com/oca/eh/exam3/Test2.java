//$Id$
package com.oca.eh.exam3;

public class Test2 {
	public void m() throws __________{
		throw new MyException();
	}
}

class MyException extends Throwable {
	public MyException() {
		super();
	}

	public MyException(String str) {
		super(str);
	}
}
//select all which can eliminate compiler error 
///MyException
//Exception
///Throwable
//RuntimeException
