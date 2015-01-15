package com.isep.restfulClient;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class display
 */
@WebServlet("/display")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static private String JSPLOCATION="/WEB-INF/jsp/";
	RestClient RClient=new RestClient();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String message = null;
		int id= 0;
		
		 if (request.getParameter("button1") != null) {
	            message=RClient.getUser();
	        } else if (request.getParameter("button2") != null) {       	
	        	id = Integer.parseInt(request.getParameter("getTweets"));
	        	message=RClient.getTweet(id);
	        } else if (request.getParameter("button3") != null) {
	        	message=RClient.getAllTweet();
	        } else if(request.getParameter("button4") != null) {
	        	message=RClient.update();
	        } else{
	        
	        }
		 request.setAttribute("message", message);
		 request.getRequestDispatcher("/WEB-INF/jsp/result.jsp").forward(request, response);
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	


}
