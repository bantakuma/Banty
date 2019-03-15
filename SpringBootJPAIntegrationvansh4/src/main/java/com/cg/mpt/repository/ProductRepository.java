package com.cg.mpt.repository;

import java.util.List;
import com.cg.mpt.beans.Product;

public interface ProductRepository {

	public Product createProduct(Product product);
	public Product findProduct(String productid);
	public Product updateProduct(Product product);
	public List<Product> viewProduct();
    public Product deleteProduct(String prodid);
	
}
