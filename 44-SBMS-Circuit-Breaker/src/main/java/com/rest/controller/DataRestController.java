package com.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataRestController {

	@GetMapping("/")
	public String getDataFromRedis() {
		System.out.println("Getting Data From redis method ");
		String msg = "*****Getting data from redis cache....******";
		// logic
		int i= 10 / 0;
		return msg;
	}

	public String getDataFromDB() {
		System.out.println("Getting Data From DB method ");
		String msg = "*****Getting data from DataBase ....******";
		// logic
		return msg;
	}
}
