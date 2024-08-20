package com.ashish.demo.Controller;

import com.ashish.demo.model.Products;
import com.ashish.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
@Autowired
    private ProductService service;
    @RequestMapping("/products")
    public List<Products> getPro(){
        return service.getProducts();
    }
}
