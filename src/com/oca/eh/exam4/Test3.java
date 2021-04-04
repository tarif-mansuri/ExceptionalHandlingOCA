//$Id$
package com.oca.eh.exam4;

public class Test3 {
	static Double d;
	int i = d.intValue();
	
	public static void main(String[] args){
		System.out.println("OCA");
	}
}

//ans=>OCA will be printed on the console No Exception is thrown
//OCA will be printed on the console and then Exception is thrown
//OCA will not be printed on the console also No Exception is thrown
//OCA will not be printed on the console but Exception is thrown

//when we run the code class loader will load the Test class and it will initialise static field d with null and call the mainmethod
//since main method does not creates any objects of Test class, its member variable won't be created and hence d.intValue(); will 
// never get triggered therefore it will simply print OCA and execution will terminate