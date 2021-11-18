package com.myapp.productservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.productservice.model.Product;

public interface ProductRepo extends JpaRepository <Product,Long> {

}
