package com.ncm.productCategory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncm.productCategory.models.Category;
import com.ncm.productCategory.models.Product;
import com.ncm.productCategory.repositories.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	
	private ProductRepository productRepo;
	
	//list all
	public List<Product> allProducts(){
		return productRepo.findAll();
	}
	//create
	public Product createProduct(Product newProduct) {
		return this.productRepo.save(newProduct);
	}
	//get one
	public Product getProduct(Long id) {
		return this.productRepo.findById(id).orElse(null);
	}
	//list all not containing
	public List<Product> findProductsNotInCateogry(Category category){
		return productRepo.findByCategoriesNotContains(category);
	}
	//add product to category
	public void addCatToProd(Category category, Product product) {
		List<Category> existingCat = product.getCategories();
		existingCat.add(category);
		this.productRepo.save(product);
	}
}
