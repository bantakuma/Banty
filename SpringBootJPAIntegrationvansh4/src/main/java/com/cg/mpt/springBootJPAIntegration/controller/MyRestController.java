package com.cg.mpt.springBootJPAIntegration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cg.mpt.beans.Product;
import com.cg.mpt.service.ProductService;



@RestController
public class MyRestController {
	
	 @Autowired
	ProductService service;
	
	
	public ProductService getService() {
		return service;
	}


	public void setService(ProductService service) {
		this.service = service;
	}


	@RequestMapping(value="/addProduct",consumes="application/json",
			method=RequestMethod.POST,produces="application/json")
	public Product addProduct(@RequestBody Product Product)
	{
		
		Product= service.createProduct(Product);
		return Product;
	}
	
	@RequestMapping(value="/findProduct/{ProductId}",produces="application/json")
	public Product findProduct(@PathVariable String ProductId)
	{
		Product Product=service.findProduct(ProductId);
		return Product;
	}

	@RequestMapping(value="/updateProduct/{ProductId}",consumes="application/json",
			method=RequestMethod.PUT,produces="application/json")
	public Product updateProduct(@RequestBody Product Product)
	{
		
		Product=service.updateProduct(Product);
		return Product;
	}
	
	
	@RequestMapping(value="/deleteProduct/{ProductId}",consumes="application/json",
			method=RequestMethod.POST,produces="application/json")
	public Product removeProduct(@PathVariable String ProductId)
	{
		Product Product=service.deleteProduct(ProductId);
		return Product;
	}
	
	@RequestMapping(value="getProductList",produces="application/json")
	public List<Product> getProductList()
	{
		List<Product> list =service.viewProduct();
		return list;
	}
	
	
	
	
	
}






