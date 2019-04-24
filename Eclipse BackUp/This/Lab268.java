/*
 * this is a keyword which acts as a reference variable.
 * this reference variable contains address of current object.
 * this is an instance variable and cannot be accessed from static context.
 * ************************************************************************ 
 * this keyword can be used in three ways:
 * To access the instance variables:
 * this.a
 * To access the methods:
 * this.m1();
 * To access the overloaded constructor
 * this(parameters);
 * 
 */

class Hello3{
	
	int a=9;
	static int b=10;
	void show(){
	String a = "JLC";
	String b = "SD";
	System.out.println(a);
	System.out.println(b);
	System.out.println(this.a);
	System.out.println(this.b);
	//Static variables can be accessed using this keyword
	System.out.println(Hello3.b);
	//We can use Class name to access static variables in the same class once 
	//the object has been created.	
	//System.out.println(Hello3.a);
	// =>cannot make a static reference to the non-static field(Hello3.a)
	}
}
	
class Lab268{
           public static void main(String[] args){
    	System.out.println("Main Started");    
	Hello3 h = null;
           h= new Hello3();
	h.show();
	}
}
