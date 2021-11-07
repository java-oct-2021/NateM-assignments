package com.ncm.productCategory.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ncm.productCategory.models.Category;
import com.ncm.productCategory.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
	
	
	List<Category> findByProductsNotContains(Product product);

}
