package com.ashish.demo.service;

import com.ashish.demo.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Products> products = new ArrayList<>(Arrays.asList(new Products(101, "Iphone", 50000),
            new Products(102, "Canon Camera", 70000),
            new Products(103,"Shure Mic",10000)));

    public List<Products> getProducts(){
        return products;
    }

    public Products getProductById(int id) {
//        return products.stream().filter(p -> p.getId() == id).findFirst()
//                .orElse(new Products(100,"No Item",0));

            for(Products i: products) {
                if(i.getId() == id) {
                    return i;
                }
            }
            return new Products(100,"No Item",0);
    }
    public void addProduct(Products prod){
        products.add(prod);
    }
}
