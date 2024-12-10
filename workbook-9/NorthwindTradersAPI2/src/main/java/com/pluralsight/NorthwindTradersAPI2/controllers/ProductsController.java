package com.pluralsight.NorthwindTradersAPI2.controllers;

import com.pluralsight.NorthwindTradersAPI2.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
    private List<Product> products;

    public ProductsController(){
        products = new ArrayList<>();

        products.add(new Product(1,"Tomato",1,5));
        products.add(new Product(2,"Potato",1,4));
        products.add(new Product(3,"Coca-Cola",2,12));
        products.add(new Product(4,"Fish",3,10));

    }
    @RequestMapping(path ="/products", method = RequestMethod.GET)
    public List<Product> getAllProducts(){
        return products;
    }

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable int productId){
        for (Product product : products) {
            if (product.getProductId() == productId){
                return product;
            }
        }
        return null;
    }
}
