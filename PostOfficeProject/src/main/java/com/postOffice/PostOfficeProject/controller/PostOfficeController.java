 package com.postOffice.PostOfficeProject.controller;
 
//import java.util.logging.Logger;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.postOffice.PostOfficeProject.impl.PostofficeImpl;
import com.postOffice.PostOfficeProject.model.PostOfficeResponseBean;

@RestController
@RequestMapping("/postal")
public class PostOfficeController {
	
	//private static Logger logger = Logger.getLogger(PostOfficeController.class.getName());
	
	@Autowired
	PostofficeImpl postofficeImpl;
	
	@GetMapping(value = "/city", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PostOfficeResponseBean fetchPostOfficeDetailsByCity(@RequestParam String city)
	{		
		return postofficeImpl.fetchPostOfficeDetailsByCity(city);
	}
	
	@GetMapping(value = "/pincode", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PostOfficeResponseBean getPostOfficeByPincode(@RequestParam String pincode)
	{		
		return postofficeImpl.fetchPostOfficeDetailsByPincode(pincode);
	}

}
