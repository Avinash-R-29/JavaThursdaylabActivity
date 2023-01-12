package com.springboot.pmgnt.service;

import com.springboot.pmgnt.entity.Product;

public interface ProductService 
{
	Product save(Product p);
	
	void deleteProduct (int pid);
	
	Product getProductById(int productId);

	void update(Product product,int productId);

}
