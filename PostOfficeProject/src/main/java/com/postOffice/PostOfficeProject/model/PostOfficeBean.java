package com.postOffice.PostOfficeProject.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOfficeBean {
	
	@JsonProperty("Name")
	@JsonInclude(Include. NON_NULL)
	private String name;
	
	@JsonProperty("Description")
	@JsonInclude(Include. NON_NULL)
	private String description;
	
	@JsonProperty("BranchType")
	@JsonInclude(Include. NON_NULL)
	private String branchType;
	
	@JsonProperty("DeliveryStatus")
	@JsonInclude(Include. NON_NULL)
	private String deliveryStatus;
	
	@JsonProperty("Circle")
	@JsonInclude(Include. NON_NULL)
	private String circle;
	
	@JsonProperty("District")
	@JsonInclude(Include. NON_NULL)
	private String district;
	
	@JsonProperty("Division")
	@JsonInclude(Include. NON_NULL)
	private String division;
	
	@JsonProperty("Block")
	@JsonInclude(Include. NON_NULL)
	private String block;
	
	@JsonProperty("Region")
	@JsonInclude(Include. NON_NULL)
	private String region;
	
	@JsonProperty("State")
	@JsonInclude(Include. NON_NULL)
	private String state;
	
	@JsonProperty("Country")
	@JsonInclude(Include. NON_NULL)
	private String country;
	
	@JsonProperty("Pincode")
	@JsonInclude(Include. NON_NULL)
	private String pincode;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}
}