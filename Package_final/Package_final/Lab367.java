/*
 When you refer any static member which is available in same class as well as 
 imported by static members then priority will be given to same class member.
*/

package com.jlcindia.p2;
import static com.jlcindia.p1.Hello.*;

 public class Lab367{

 public static void main(String args[]){
 System.out.println("Executed");
 m1();
 m2();
 }
 
 static void m1(){
 System.out.println("Lab -> m1()");
 }
 
 static void m2(){
 System.out.println("Lab -> m2()");
 }

}