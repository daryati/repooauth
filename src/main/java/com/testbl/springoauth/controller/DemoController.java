package com.testbl.springoauth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





import com.testbl.springoauth.classes.commonResponse;
import com.testbl.springoauth.model.User;
import com.testbl.springoauth.service.UserService;

@RestController
public class DemoController {
	
	@Autowired
	private UserService userService;
	
	 @GetMapping(value = "/")
	    public String index(){
	        return "Hello world";
	    }

	    @GetMapping(value = "/demo")
	    public String privateArea(){
	        return "Welcome To OAuth Demo";
	    }
	    
	    @GetMapping(value = "/userActiveList")
	    public commonResponse getuserActive(){
	    	commonResponse response = new commonResponse();
	    	List<User> result = userService.getActiveUser();
	    	response.setCode("200");
	    	response.setMessage("Success");
	    	response.setData(result);
			return response;
	    	
	    }

}
