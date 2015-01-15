package com.isep.restfulClient;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class RestClient {
	ClientConfig config = new ClientConfig();  
    Client client = ClientBuilder.newClient(config);  
    WebTarget target = client.target(getBaseURI()); 
    String message=null;
    
	
	public String getUser() {
	    message=target.path("REST").path("WebService").path("GetUser")
	    		.request()
	    		.accept(MediaType.APPLICATION_JSON)
	    		.get(String.class);
	    System.out.println(message);
	    return message;
	}
	
	public String getTweet(int id) {
	    message=target.path("REST").path("WebService").path("GetTweet").path(String.valueOf(id))
	    		.request()
	    		.accept(MediaType.APPLICATION_JSON)
	    		.get(String.class);
	    System.out.println(message);
	    return message;
	}
	
	public String getAllTweet() {
		message=target.path("REST").path("WebService").path("GetAllTweet")
	    		.request()
	    		.accept(MediaType.APPLICATION_JSON)
	    		.get(String.class);
		System.out.println(message);
	    return message;
	}
	
	public String update() {
		target.path("REST").path("WebService").path("UpdateData")
		.request()
		.accept(MediaType.APPLICATION_JSON)
		.get(String.class);
		message="Update the data successful!";
		System.out.println(message);
	    return message;
	}
	private static URI getBaseURI() {
		
		return UriBuilder.fromUri("http://localhost:8080/RESTfulProject/").build();
	
	}
	
}
