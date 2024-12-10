package com.pluralsight.NorthwindTradersAPI3.dao.interfaces;

import com.pluralsight.NorthwindTradersAPI3.models.Product;

import java.util.List;

public interface IProductDao {
    Product insert(Product product);

    List<Product> getAllProducts();

    Product getProductById(int productId);

}