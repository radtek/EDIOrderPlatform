package com.edi.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController
{

	@RequestMapping(method =
	{ RequestMethod.POST, RequestMethod.GET })
	public ResponseEntity<String> savEntity()
	{

		return ResponseEntity.ok("OK");

	}

}
