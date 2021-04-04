//$Id$
package com.oca.eh.exam6;

import java.util.ArrayList;
import java.util.List;

public class Test8 {}
abstract class Super{
	abstract List<Object> getList() throws StringIndexOutOfBoundsException;
}
class Sub extends Super{
	/*Insert*/
}
//select all which can replace /*Insert*/ such that code compile fine

//ans=>List<Object> getList() throws UnknownError {return null;}
//List<String> getList() throws StringIndexOutOfBoundsException {return null;}
//ArrayList<String> getList() throws StringIndexOutOfBoundsException {return null;}
//ans=>ArrayList<Object> getList() throws RuntimeException {return null;}
//ans=>ArrayList<Object> getList() throws IndexOutOfBoundsException {return null;}
//ArrayList<Object> getList() throws EOFException {return null;}

//Rules for overriding method return type

//1. if return type of overridden method is primitive type then overriding method must use same return

//2. if return type of overridden method is non primitive type i.e. reference type then overriding method can use either same 
//return type or sub type of overridden method's return type (also known as co varient return type)

//3. for generic return type remember than even if String is sup type of Object but List<String> is not a subtype of List<Object>
//so dont get confused with generic return type

//For example ArrayList<Object> is sub type of List<Object> but ArrayList<String> is not a sub type of List<Object>

//if overridden method is declaring runtime exception then overriding method may declare any runtime exception or may not
//declare at all but it can not declare checked exceptions

//Let us understand each option one by one



//List<Object> getList() throws UnknownError {return null;} => Correct
//overridden method declares StringIndexOutOfBoundsException which is RuntimeException, that means overriding method can declare any
//RuntimeException/Error or it can also not provide any declaration.
//Return type is same as overridden method hence no Compiler Error


//List<String> getList() throws StringIndexOutOfBoundsException {return null;} => InCorrect
//List<String> is not a sub type of List<Object> even if String is sub type of Object


//ArrayList<String> getList() throws StringIndexOutOfBoundsException {return null;} => InCorrect
//ArrayList<String> is not a sub type of List<Object> even if ArrayList is sub type of List


//ArrayList<Object> getList() throws RuntimeException {return null;} => Correct
//ArrayList<Object> is a sub type of List<Object> also there is no restriction on declaring RuntimeException

//ArrayList<Object> getList() throws IndexOutOfBoundsException {return null;} => Correct
//ArrayList<Object> is a sub type of List<Object> also IndexOutOfBoundsException is RuntimeException

//ArrayList<Object> getList() throws EOFException {return null;} => InCorrect
//return type is sub type of List<Object> but overriding function can not declare any checked Exception that is not being thrown
//EOFException is a checked Exception
