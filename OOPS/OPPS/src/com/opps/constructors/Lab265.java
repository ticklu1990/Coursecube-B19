package com.opps.constructors;

/* 
 * Constructors:
 * Constructors are the special methods whose name is same as class name.
 * Constructors do not have return type even void.
 * Constructors will be invoked by the JVM automatically at the time of object creation.
 * Constructors are mainly used to initialize instance variables of class with different set of values.
 *  
 */

class Student5{

	int cid;
	String cname;

void Student5(int id,String cn) {
		//The Constructor without any argument is called D.C//
		System.out.println("Method");
		cid = id;
		cname= cn;
	}
//You cannot specify the return type of the constructor.When you specify 
//the return type for the constructor then it will be treated as 
//normal method. 
	
    Student5() {
		//The Constructor without any argument is called D.C//
		System.out.println("Default Constructor");

	}


    void show() {
		System.out.println(cid +"\t"+cname);

	}
}

public class Lab265 {

	public static void main(String[] args){
		Student5 stu1 = new Student5();
		stu1.Student5(77,"SD");
		stu1.show();
	//	Student5 stu2 = new Student5(88,"MK");
	
	}

}
