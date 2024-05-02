package com.wipro.categoryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.categoryapp.model.Categoryapp;
import com.wipro.categoryapp.service.CategoryService;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Categoryapp> findAllCategories() {
        return categoryService.findAllCategories();
    }

    @GetMapping("/categories/{id}")
    public Categoryapp findCategoryById(@PathVariable int id) {
        return categoryService.findCategoryById(id);
    }

    @PostMapping("/categories")
    public String saveCategory(@RequestBody Categoryapp category) {
        categoryService.saveCategory(category);
        return "Category Data Created";
    }

    @DeleteMapping("/categories/{id}")
    public ResponseEntity<String> deleteCategoryById(@PathVariable int id) {
        categoryService.deleteCategoryById(id);
        return ResponseEntity.ok("Category Data Deleted");
    }

    @PutMapping("/categories")
    public String updateCategory(@RequestBody Categoryapp category) {
        categoryService.saveCategory(category);
        return "Category Data Updated";
    }
}
