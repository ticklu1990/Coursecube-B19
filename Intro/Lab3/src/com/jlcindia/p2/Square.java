package com.jlcindia.p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

import org.apache.catalina.connector.Request;

public class Square extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		// How do we access that here?
		// Now offcourse we are not sending data in the request here.
		// Now we are sending data in the session.
		// So,the way you fetch the value is by saying,
	    // removing the below(Integer.parseInt(req.getParameter("k"));)
		// We say session.Oh we have not given the response for session.
		// We have not declared it here.
		// Http Session = req.getSession() 
		//Once we got hold on it.
		//Once we got hold on the session object.
		//Inside AddServlet we have said setAttribute,here we have to getAttribute		
		  HttpSession session = req.getSession();
		// Here I want know there is one issue,when you say attribute it would return you 
		// the object we dont want object we want is the int from it.
		  
		 //if you want to remove the session:
		  // you c
		  session.removeAttribute("k");
		  // You can fetch the value if you have the value.
		  // Normally we use session to maintain the login on your website.
		  
		  // If you want the user to go some other page.
		  // If you want to verify if the user is already logged in.
		  // You can maintain the data in the session.
		  
		  
		  
		  
		  
		 //So this will give you object and we have to convert that into int.
		 //So we will simply typecast it.
		   
		  //Again we can use IntegerParseInt we have to convert them as well.
		  //Convert into String but multiple steps.
		  //This is simple we can simply type cast it with int
		  int k = (int) session.getAttribute("k");   
		   
		  k = k+1;
		
	      PrintWriter out = res.getWriter();
		  out.println("The Result is"+":"+k);
		
	
		
		  System.out.println("sq-called");
		
	} 

}
