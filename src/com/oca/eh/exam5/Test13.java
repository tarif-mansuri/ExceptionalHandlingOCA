//$Id$
package com.oca.eh.exam5;

public class Test13 {
	// start from 61
}

abstract class SuperHero {
	void fight(String powerName){
	}
}

abstract class MarvelHero extends SuperHero {
	/* Insert */
}
// select all that will not cause compiler error if it replaces /*Insert*/
// ans=>abstract void fight(String powerName);
// ans=>abstract void fight();
// ans=>abstract void fight(Object powerName);
//void fight(String p) throws java.io.IOException{}
//void fight(String p) throws Exception{}
//ans=>void fight(String p) throws RuntimeException{}
//ans=>void fight(Number p) throws java.io.IOException{}

//both classes are abstract classes, a class can have zero or more abstract methods therefore code will compile successfully
//if we do not replace /*Insert*/ at all. but as per question we have to replace insert, lets start one by one

//abstract void fight(String powerName); =>correct
//since MarvelHero class is abstract class, it can declare any class an abstract

//abstract void fight(); =>correct
//this is method overloading, now MarvelHero will have two functions 1. void fight(String powerName){} and 2. abstract void fight();

//abstract void fight(Object powerName); =>correct
//this is again method overloading, now MarvelHero will have two functions 1. void fight(String powerName){} and 2. abstract void fight(Object powerName);

//void fight(String p) throws java.io.IOException{}=> Incorrect
//here child class is overriding super class function and it should follow the rules of overriding with Exceptions, while overriding
//it can not declare any new checked Exception

//void fight(String p) throws Exception{}=> Incorrect
//here child class is overriding super class function and it should follow the rules of overriding with Exceptions, while overriding
//it can not declare any new checked Exception

//void fight(String p) throws RuntimeException{}=>Correct Runtime Exceptions are allowed to be declared even if it never been thrown
//or allowed to throw without declaring it

//void fight(Number p) throws java.io.IOException{}=> Correct
//this is not function overriding but function overloading, here you can declare any sort of Exception you like to.



