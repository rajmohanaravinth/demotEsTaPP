package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/home")
public class DemotEsTaPpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemotEsTaPpApplication.class, args);
	}
	
	
	
	
	 @RequestMapping(value = "/{id}",method = RequestMethod.GET)
	    String getIdByValue(@PathVariable("id") String personId) {
	        System.out.println("ID is " + personId);
	        return "Get ID from query string of URL with value element";
	    }
	    @RequestMapping(value = "/personId",method = RequestMethod.GET)
	    String getId(@RequestParam String personId) {
	        System.out.println("ID is " + personId);
	        return "Get ID from query string of URL without value element";
	    }
	    
	    @RequestMapping(value = "/name")
	    String getName(@RequestParam(value = "person", required = false) String personName) {
	    	System.out.println("name is " + personName);
	        return "Required element of request param";
	    }
}
