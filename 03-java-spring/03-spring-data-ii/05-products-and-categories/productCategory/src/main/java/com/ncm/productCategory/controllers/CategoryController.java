package com.ncm.productCategory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncm.productCategory.models.Category;
import com.ncm.productCategory.models.Product;
import com.ncm.productCategory.services.CategoryService;
import com.ncm.productCategory.services.ProductService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired 
	private ProductService productService;
	
@GetMapping("/newCategory")
public String newCategory(@ModelAttribute("category") Category cateogry) {
	return "newCategory.jsp";
}

@PostMapping("/newCategory/create")
public String createCategory(@ModelAttribute("cateogry") Category category) {
	this.categoryService.createCategory(category);
	return "redirect:/newProduct";
}

@GetMapping("/category/{id}")
public String showCategory(@PathVariable("id") Long id, Model model) {
	Category category = this.categoryService.getCategory(id);
	model.addAttribute("notContainedInCategory", this.productService.findProductsNotInCateogry(category));
	model.addAttribute("category", category);
	return "category.jsp";
}

@PostMapping("/addProductToCategory/{id}")
public String addProdToCategory(@RequestParam("products") Long id, @PathVariable("id") Long categoryId) {
	Category categoryAddProdTo = this.categoryService.getCategory(categoryId);
	Product productAddCategoryTo = this.productService.getProduct(id);
	this.categoryService.addProdToCat(productAddCategoryTo, categoryAddProdTo);
	return "redirect:/category/{id}";
	
}

}
