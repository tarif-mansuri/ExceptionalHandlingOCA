//$Id$
package com.oca.eh.exam5;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test2 {
	private static void m1() throws SQLException{}
	private static void m2() throws FileNotFoundException{}
	public static void main(String[] args){
		/*Insert*/
	}
}

//ans
//try{
//m1();
//m2();
//}catch(Exception e){
//}


//ans
//try{
//m1();
//m2();
//}catch(SQLException |IOException e){}

//try{
//	m1();
//	m2();
//}catch(SQLException |EOFException e){}

//try{
//m1();
//m2();
//}catch(SQLException |RuntimeException e){}


//try{
//m1();
//m2();
//}catch(Error e){}

//an Exception can be caught either by itself or by its super class, plz try to remember following Exception hierarchy
/*insert image*/

