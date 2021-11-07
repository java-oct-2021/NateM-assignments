package com.ncm.productCategory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncm.productCategory.models.Category;
import com.ncm.productCategory.models.Product;
import com.ncm.productCategory.repositories.CategoryRepository;

@Service
public class CategoryService {

@Autowired
	
	private CategoryRepository categoryRepo;
	
	public List<Category> allCategories(){
		return categoryRepo.findAll();
	}
	public Category createCategory(Category newCategory) {
		return this.categoryRepo.save(newCategory);
	}
	public Category getCategory(Long id) {
		return this.categoryRepo.findById(id).orElse(null);
	}
	public List<Category> findCategoriesNotInProduct(Product product){
		return this.categoryRepo.findByProductsNotContains(product);
	}
	//add cat to product
	public void addProdToCat(Product product, Category category) {
		List<Product> existingProd = category.getProducts();
		existingProd.add(product);
		this.categoryRepo.save(category);
 	}
}

