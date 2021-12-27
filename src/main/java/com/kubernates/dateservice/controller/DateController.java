package com.kubernates.dateservice.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

	@Autowired
	private InstanceVariable var;

	@GetMapping("/date-service1/date")
	public Data getDate() {
		System.out.println(var.retrieveInstance());
		return new Data(new Date(), var.retrieveInstance());
	}

	@GetMapping("/")
	public String getDate1() {

		return "{healthy:true}";
	}

}
