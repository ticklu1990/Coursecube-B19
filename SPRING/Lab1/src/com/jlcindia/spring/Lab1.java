package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {

/*	
	
    // Without IOC
	public static void main(String[] args) {
     A aobj = new A();
     aobj.setA(99);
     aobj.setMsg("HelloGuys");
     B bobj = new B(88,"Hai Guys");
     Hello hello = new Hello(bobj);
     hello.setAobj(aobj);
   }
         
}  

*/	
	
	
	public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("jlcindia.xml");
    System.out.println("Spring Container is ready");
    System.out.println("----------------");
    Hello h = (Hello)ctx.getBean("hello");
    h.show();    
    
    
    
	}
    
     
}  
   
	
