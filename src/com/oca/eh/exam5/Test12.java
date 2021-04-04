//$Id$
package com.oca.eh.exam5;

import java.sql.SQLException;

public class Test12 {
	public static void main(String[] args){
		try{
			new DB().setData(100);//Line1
		}catch(SQLException e){
			System.out.println("Exception thrown");
		}
	}
}
class DB{
	public void setData(int data)throws SQLException{ //Line2
		try{
			throw new SQLException();
		}catch(Exception e){
			e = null; //Line3
			throw e;//Line4
		}
	}
}
//what will be output of following code if compiled and executed?

//Compiler Error in Line1
//Compiler Error in Line2
//Compiler Error in Line3
//ans=>Compiler Error in Line4
//Exception thrown will be printed


//since java 1.7 its allowed to throw an exception from catch block if its object is of child type or of same type that function has declared, even if it has been caught using a parent type

//remember if you assign it explicitly to a parent type then it will cause a compiler error

//for example if you remove Line4 it will work fine