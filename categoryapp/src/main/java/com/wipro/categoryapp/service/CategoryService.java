package com.wipro.categoryapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.categoryapp.model.Categoryapp;
import com.wipro.categoryapp.repository.CategoryappRepo;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryappRepo categoryappRepo;

    public List<Categoryapp> findAllCategories() {
        return categoryappRepo.findAll();
    }

    public Categoryapp findCategoryById(int id) {
        return categoryappRepo.findById(id).orElse(null);
    }

    public void saveCategory(Categoryapp category) {
        categoryappRepo.save(category);
    }

    public void deleteCategoryById(int id) {
        categoryappRepo.deleteById(id);
    }

}
