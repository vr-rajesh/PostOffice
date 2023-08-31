package com.postOffice.PostOfficeProject.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostOfficeResponseBean {
	
	@JsonProperty("Message")
	@JsonInclude(Include. NON_NULL)
	private String message;
	
	@JsonProperty("Status")
	@JsonInclude(Include. NON_NULL)
	private String status;
	
	@JsonProperty("PostOffice")
	@JsonInclude(Include. NON_NULL)
	private List<PostOfficeBean> postOfficeBean;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PostOfficeBean> getPostOfficeBean() {
		return postOfficeBean;
	}

	public void setPostOfficeBean(List<PostOfficeBean> postOfficeBean) {
		this.postOfficeBean = postOfficeBean;
	}

}
