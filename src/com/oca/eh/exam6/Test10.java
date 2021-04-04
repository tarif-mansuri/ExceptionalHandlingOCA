//$Id$
package com.oca.eh.exam6;

public class Test10 {
	public static void throwsExceptions() throws ClassCastException, Exception, RuntimeException, ArithmeticException {
		throw new RuntimeException();
	}
	public static void main(String[] args){
		try{
			throwsExceptions(); //Line1
		}catch(ClassCastException e){ //Line2
			
		}
	}
}
//what will be the output if compile and execute following code?

//currently code has compiler error in Line1 which of the following can replace Line2 enabling the code to compile
//replace Line2 with }catch(RuntimeException e){
//ans=>replace Line2 with }catch(Exception e){
//replace Line2 with }catch(ClassCastException | Exception | RuntimeException | ArithmeticException e){
//replace Line2 with }catch(ArithmeticException e){

//Since Exception is Parent class of ClassCastException, RuntimeException, ArithmeticException therefore 
//handling Exception can handle all other Exceptions