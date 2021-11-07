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
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;



@GetMapping("/newProduct")
public String newProduct(@ModelAttribute("product") Product product) {
	return "newProduct.jsp";
}
@PostMapping("/newProduct/create")
public String createProduct(@ModelAttribute("product")Product product) {
	this.productService.createProduct(product);
	return "redirect:/newCategory";
}

@GetMapping("/product/{id}")
public String showProduct(@PathVariable("id") Long id, Model model) {
	Product product = this.productService.getProduct(id);
	model.addAttribute("notContainedInProduct", this.categoryService.findCategoriesNotInProduct(product));
	model.addAttribute("product", product);
	return "product.jsp";
}

@PostMapping("/addCategoryToProduct/{id}")
public String addCatToProd(@RequestParam("categories") Long id, @PathVariable("id") Long productId) {
	Product catAddToProduct = this.productService.getProduct(productId);
	Category productAddToCat = this.categoryService.getCategory(id);
	this.productService.addCatToProd(productAddToCat, catAddToProduct);
	return "redirect:/product/{id}";
}
}
