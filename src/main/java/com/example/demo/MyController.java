package com.example.demo;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;

@RestController
public class MyController {

	@GetMapping("/date")
	public Date date(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
		return date;
	}
	
	@GetMapping("/secret")
	public String secret(@RequestParam("secret") @ApiParam(format="password") String secret) {
		return secret;
	}
}
