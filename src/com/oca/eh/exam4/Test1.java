//$Id$
package com.oca.eh.exam4;
//Added in 3rd test
import java.io.EOFException;

public class Test1 {
	public static void main(String[] args){ //Line1
		X xMen = new X();
		xMen.print();//Line2
	}
}
class X{
	public void print(){//Line3
		System.out.println("X-Men");
		throw new EOFException();//Line4
	}
}

//currently code is producing compiler error, select all that can enable following code to compile (consider all needed classes are already imported)
//ans=>replace Line1 with public static void main(String[] args) throws Exception{ and Line3 with public void print()throws IOException{

//ans=>replace Line4 with 
//try{
//throw new EOFException();
//}catch(Exception e){}

//replace Line2 with 
//try{
//xMen.print();
//}catch(Exception e){}

//ans
//repalce Line2 with 
//try{
//xMen.print();
//}catch(Exception e){}
//and 
//Line3 with public void print()throws Exception{


//Line3 with public void print()throws Exception{
//and replace Line2 with
//try{
//xMen.print();
//}catch(EOFException e){}
