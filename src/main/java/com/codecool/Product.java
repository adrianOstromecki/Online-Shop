package com.codecool;

import java.util.List;
import java.util.ArrayList;

class Product{
    private String name;
    private Float defaultPrice;
    private ProductCategory productCategory;
    private Integer ID;
    private static List<Product> productList = new ArrayList<Product>();

    private final int MAX_NAME_WIDTH = 15;
    private final int MAX_PRICE_WIDTH = 6;

    public Product(String name, Float defaultPrice, ProductCatgory productCategory){
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
        ID = generateID();
        productList.add(this);
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(String.format("%-" + MAX_NAME_WIDTH + "s", name));
        sBuilder.append(String.format("|Price: %-" + MAX_PRICE_WIDTH + "%f", defaultPrice));
        sBuilder.append(String.format("|%s", productCategory.toString()));
        return sBuilder.toString();
    }

    public List<Product> getAllProducts(){
        return productList;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory){

    }

    private Integer generateID(){
        return productList.size();
    }
}