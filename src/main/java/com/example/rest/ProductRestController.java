package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@GetMapping("/fetch/{code}")
	public String getOneProduct(@PathVariable String code)
	{
		return "Data is => " + code;
	}
	
	@GetMapping("/get/{id}/{code}")
	public String getDescProduct(@PathVariable Integer id, @PathVariable String code) {
		return "FIND => " + id + "-" + code;
	}

}
