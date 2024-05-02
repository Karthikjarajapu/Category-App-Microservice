package com.wipro.categoryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.categoryapp.model.Categoryapp;

@Repository
public interface CategoryappRepo extends JpaRepository<Categoryapp, Integer> {

}
