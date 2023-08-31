package com.postOffice.PostOfficeProject.service;

import com.postOffice.PostOfficeProject.model.PostOfficeResponseBean;

public interface IPostOffice {
	public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String city);
	
	public PostOfficeResponseBean fetchPostOfficeDetailsByPincode(String pincode);
}
