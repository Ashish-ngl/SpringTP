package com.ashish.demo.service;

import com.ashish.demo.model.Products;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Products> products = Arrays.asList(new Products(101, "Iphone", 50000),
            new Products(102, "Canon Camera", 70000),
            new Products(103,"Shure Mic",10000));

    public List<Products> getProducts(){
        return products;
    }
}
