package com.cg.mpt.service;

import java.util.List;
import com.cg.mpt.beans.Product;

public interface ProductService {


	public Product createProduct(Product Product);
	public Product findProduct(String Productid);
	public Product updateProduct(Product Product);
	public List<Product> viewProduct();
	public Product deleteProduct(String prodid);
}
