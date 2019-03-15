package com.cg.mpt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mpt.beans.Product;
import com.cg.mpt.exception.ProductIdDoesNotExist;
import com.cg.mpt.repository.ProductRepository;

@Transactional
@Service("service")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository repo;	
	public ProductRepository getRepo() {
		return repo;
	}
	public void setRepo(ProductRepository repo) {
		this.repo = repo;
	}
	@Override
	public Product createProduct(Product Product)throws ProductIdDoesNotExist {
		return repo.createProduct(Product);
	}
	@Override
	public Product findProduct(String Productid)throws ProductIdDoesNotExist {
		return repo.findProduct(Productid);
	}
	@Override
	public Product updateProduct(Product Product)throws ProductIdDoesNotExist {
		// TODO Auto-generated method stub
		return repo.updateProduct(Product);
	}
	@Override
	public List<Product> viewProduct()throws ProductIdDoesNotExist {
		return repo.viewProduct();
	}
	@Override
	public Product deleteProduct(String prodid)throws ProductIdDoesNotExist {
		// TODO Auto-generated method stub
		return repo.deleteProduct(prodid);
		
	}
}
