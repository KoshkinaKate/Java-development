package com.pluralsight.NorthwindTradersAPI3.controllers;



import com.pluralsight.NorthwindTradersAPI3.dao.interfaces.IProductDao;
import com.pluralsight.NorthwindTradersAPI3.models.Category;
import com.pluralsight.NorthwindTradersAPI3.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {
    private final IProductDao productDao;

    @Autowired
    public ProductsController(IProductDao productDao) {
        this.productDao = productDao;
    }

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return productDao.getAll();
    }

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable int productId) {
        return productDao.getById(productId);
    }
    @RequestMapping(path ="/products", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Product addProduct(@RequestBody Product product) {
        return productDao.insert(product);
    }

    @RequestMapping (path = "/products/{productId}", method = RequestMethod.PUT)
    public void updateProduct(@PathVariable int productId, @RequestBody Product product){
        productDao.update(productId, product);
    }

    @RequestMapping(path ="/products/{productId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable int productId){
        productDao.delete(productId);
    }
    
}
