package com.example.springsecurityapplication.controllers;

import com.example.springsecurityapplication.models.Product;
import com.example.springsecurityapplication.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/admin")
public class AdminController {

  private final ProductService productService;

  @GetMapping("/products")
  public String admin(Model model) {
    model.addAttribute("products", productService.getAllProduct());
    return "admin";
  }

  @PostMapping("/product/add")
  public ResponseEntity<String> addProduct(@RequestBody Product product) {
    productService.saveProduct(product);
    return ResponseEntity.ok("Product is add");
  }



}
