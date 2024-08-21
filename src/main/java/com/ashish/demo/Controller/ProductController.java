package com.ashish.demo.Controller;

import com.ashish.demo.model.Products;
import com.ashish.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
@Autowired
    private ProductService service;
    @GetMapping("/products")
    public List<Products> getPro(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Products getProductById(@PathVariable("prodId") int Id){
        return service.getProductById(Id);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Products prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProducts(@RequestBody Products prod){
        service.updateProducts(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
