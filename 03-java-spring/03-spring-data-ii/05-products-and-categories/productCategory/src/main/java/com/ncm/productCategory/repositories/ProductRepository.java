package com.ncm.productCategory.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ncm.productCategory.models.Category;
import com.ncm.productCategory.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
	
	List<Product> findByCategoriesNotContains(Category category);

}
