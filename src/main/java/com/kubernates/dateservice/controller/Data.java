package com.kubernates.dateservice.controller;

import java.util.Date;

public class Data {
	
	private Date date;
	private String dateServiceEnvironmentInfo;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public String getDateServiceEnvironmentInfo() {
		return dateServiceEnvironmentInfo;
	}
	public void setDateServiceEnvironmentInfo(String dateServiceEnvironmentInfo) {
		this.dateServiceEnvironmentInfo = dateServiceEnvironmentInfo;
	}
	public Data() {
		// TODO Auto-generated constructor stub
	}
	public Data(Date date, String dateServiceEnvironmentInfo) {
		super();
		this.date = date;
		this.dateServiceEnvironmentInfo = dateServiceEnvironmentInfo;
	}
	
	

}
