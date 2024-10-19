package com.yash.java8;
import java.util.*;
class Product{

    int id;

    String name;

    float price;

    public Product(int id, String name, float price) {

        this.id = id;

        this.name = name;

        this.price = price;

    }

}
public class Threddd {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();

        //Adding Products

        productsList.add(new Product(1,"shirt",1200f));

        productsList.add(new Product(2,"Jeans",1500f));

        productsList.add(new Product(3,"Earphone",2800f));

        productsList.add(new Product(4,"sony camera ",28000f));

        productsList.add(new Product(5,"Apple Laptop",90000f));



        float tp = productsList.stream()

                .map(product->product.price)

                .reduce(0.0f,Float::sum);

        System.out.println(tp);
    }}
