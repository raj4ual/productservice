package com.myapp.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.productservice.model.Product;
import com.myapp.productservice.repos.ProductRepo;

@RestController
@RequestMapping("/productapi")
public class ProductController {

	@Autowired
	ProductRepo repo;
	
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public Product create (@RequestBody Product product) {
		
		return repo.save(product);
	}
}
