//$Id$
package com.oca.eh.exam5;

import java.io.FileNotFoundException;

public class Test3 {
	public static void main(String[] args){
		File files = new File();
		try{
			if(files.searchFile("WonderWomen.txt")){
				System.out.println("Mached");
			}else{
				System.out.println("Not Mached");
			}
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException");
		}
	}
}
class File{
	private static String[] myFiles = new String[]{"IronMan.txt","Thor.txt","AntMan.txt"};
	public boolean searchFile(String fileName)throws FileNotFoundException{
		for(int i=0;i<=3;i++){
			if(myFiles[i].equalsIgnoreCase(fileName))
				return true;
		}
		throw new FileNotFoundException();
	}
}

//Mached
//Not Mached
//FileNotFoundException
//ans=>none of these

//array length is 3 but for loops tries to access String at 4th place that throws ArrayIndexOutOfBoundException

