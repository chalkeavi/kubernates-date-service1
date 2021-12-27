package com.kubernates.dateservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class InstanceVariable {
	
	private static final String HOST_NAME ="HOSTNAME";
	
	private static final String DEFAULT_HOST_NAME ="LOCAL";
	
	@Value("${"+HOST_NAME+":"+DEFAULT_HOST_NAME+"}")
	private String host;
	
	public String retrieveInstance() {
		return host+" V5 "+host.substring(host.length()-5);
	}

}
