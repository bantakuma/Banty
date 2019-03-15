package com.cg.mpt.service;

import java.util.List;
import com.cg.mpt.beans.Product;
import com.cg.mpt.exception.ProductIdDoesNotExist;

public interface ProductService {


	public Product createProduct(Product Product)throws ProductIdDoesNotExist;
	public Product findProduct(String Productid)throws ProductIdDoesNotExist;
	public Product updateProduct(Product Product)throws ProductIdDoesNotExist;
	public List<Product> viewProduct()throws ProductIdDoesNotExist;
	public Product deleteProduct(String prodid)throws ProductIdDoesNotExist;
}
