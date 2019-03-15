package com.cg.mpt.repository;

import java.util.List;
import com.cg.mpt.beans.Product;
import com.cg.mpt.exception.ProductIdDoesNotExist;

public interface ProductRepository {

	public Product createProduct(Product product)throws ProductIdDoesNotExist;
	public Product findProduct(String productid)throws ProductIdDoesNotExist;
	public Product updateProduct(Product product)throws ProductIdDoesNotExist;
	public List<Product> viewProduct()throws ProductIdDoesNotExist;
    public Product deleteProduct(String prodid)throws ProductIdDoesNotExist;
	
}
