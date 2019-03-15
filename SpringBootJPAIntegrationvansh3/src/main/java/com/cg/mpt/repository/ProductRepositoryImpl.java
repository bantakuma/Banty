package com.cg.mpt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.mpt.beans.Product;

@Repository("repo")
public class ProductRepositoryImpl implements ProductRepository{
	
	@PersistenceContext
	EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public Product createProduct(Product Product) {
		
		entityManager.persist(Product);
		entityManager.flush();
		return Product;
	}
	@Override
	public Product findProduct(String Productid) {
		Product Product= 
				entityManager.find(Product.class, Productid);
		if(Product==null)
			return null;
			Product.setProductId(Productid);
		return Product;
	}
	@Override
	public Product updateProduct(Product Product) {
		entityManager.merge(Product);
		entityManager.flush();
		return Product;
	}
	@Override
	public List<Product> viewProduct() {
		TypedQuery<Product> query=
	entityManager.createQuery
	("select Product from Product Product ", Product.class);
			
		List<Product> list= query.getResultList();
	return list;
	}
	@Override
	public Product deleteProduct(String prodid) {
		Product Product= entityManager.find(Product.class, prodid);
		entityManager.remove(Product);
		entityManager.flush();
		return Product;
	}
	
	
	

	
	
	
	
	
	
	
	
	


}
