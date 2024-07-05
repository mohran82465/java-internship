package com.mohran;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static List<Product> products = addDummyData();
    ;

    public static List<Product> addDummyData() {
        List<Product> products = new ArrayList<>();
        Collections.addAll(products,
                new Product(1, "omnis quod consequatur", "Games", 184.83),
                new Product(2, "vel libero suscipit", "Toys", 12.66),
                new Product(3, "non nemo iure", "Grocery", 498.02),
                new Product(4, "voluptatem voluptas aspernatur", "Toys", 536.80),
                new Product(5, "animi cum rem", "Games", 458.20),
                new Product(6, "dolorem porro debitis", "Toys", 146.52),
                new Product(7, "aspernatur rerum qui", "Books", 656.42),
                new Product(8, "deleniti earum et", "Baby", 41.46),
                new Product(9, "voluptas ut quidem", "Books", 697.57),
                new Product(10, "eos sed debitis", "Baby", 366.90),
                new Product(11, "laudantium sit nihil", "Toys", 95.50),
                new Product(12, "ut perferendis corporis", "Grocery", 302.19),
                new Product(13, "sint voluptatem ut", "Toys", 295.37),
                new Product(14, "quos sunt ipsam", "Grocery", 534.64),
                new Product(15, "qui illo error", "Baby", 623.58),
                new Product(16, "aut ex ducimus", "Books", 551.39),
                new Product(17, "accusamus repellendus minus", "Books", 240.58),
                new Product(18, "aut accusamus quia", "Baby", 881.38),
                new Product(19, "doloremque incidunt sed", "Games", 988.49),
                new Product(20, "libero omnis velit", "Baby", 177.61),
                new Product(21, "consectetur cupiditate sunt", "Toys", 95.46),
                new Product(22, "itaque ea qui", "Baby", 677.78),
                new Product(23, "non et nulla", "Grocery", 70.49),
                new Product(24, "veniam consequatur et", "Books", 893.44),
                new Product(25, "magnam adipisci voluptate", "Grocery", 366.13),
                new Product(26, "reiciendis consequuntur placeat", "Toys", 359.27),
                new Product(27, "dolores ipsum sit", "Toys", 786.99),
                new Product(28, "ut hic tempore", "Toys", 316.09),
                new Product(29, "quas quis deserunt", "Toys", 772.78),
                new Product(30, "excepturi nesciunt accusantium", "Toys", 911.46)
        );
        return products;
    }

    /* this we use simple java code */
//
//    public static Product withPrice (double price)
//    {
//        for(Product product : products)
//        {
//            if(product.getPrice()== price)
//            {
//                return product;
//            }
//        }
//        return   new Product(404 ,"the dummy product" , "dummy",404.404);
//    }

    /* this we use java 8 features */
    public static Product withPrice(double price) {
        return products.stream().filter(product -> product.getPrice() == price)
                .findFirst()
                .orElseGet(() -> new Product(404, "the dummy product", "dummy", 404.404));
//

    }

    public static void main(String[] args) {
        // just printing the list
//        products.forEach(System.out::println);
        // print the right actual value of price
//        System.out.println(withPrice(95.50));
        // print wrong or not found price in the list
//        System.out.println(withPrice(40.4));


        // =============================================================================================
        // Exercise one
//        List<Product> books = products.stream().filter(product -> product.getCategory().equalsIgnoreCase("Books"))
//                .collect(Collectors.toList());
//
//        System.out.println(
//                books
//        );

//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // Follow up of Exercise one
        // here i wanna make a list of each product classify by category
//        Map<String, List<Product>> productCategory = products.stream()
//                .collect(Collectors.groupingBy(Product::getCategory));
//        productCategory.forEach((cat, pro) -> {
//            System.out.println("Category : " + cat);
//            pro.forEach(product -> System.out.println("product = " + product));
//        });

        // =============================================================================================
        // exercise 2
//        List<Product> expensiveProduct = products.stream().filter(product -> product.getPrice() > 100 && product.getCategory().equalsIgnoreCase("books"))
//                .collect(Collectors.toList());
//        expensiveProduct.forEach(System.out::println);
        // =============================================================================================
        // exercise 3
//        List<Product> discountList = products.stream()
//                .filter(product -> product.getCategory().equalsIgnoreCase("toys"))
//                .map(product -> new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice()*0.90))
//                .collect(Collectors.toList());
//
//        List<Product> beforeDiscout = products.stream().filter(product -> product.getCategory().equalsIgnoreCase("toys")).collect(Collectors.toUnmodifiableList());
//        System.out.println("this price before the discount :-");
//        beforeDiscout.forEach(System.out::println);
//        System.out.println("this price after the discount :-");
//        discountList.forEach(System.out::println);
        // =============================================================================================
        // exercise 4
        Optional<Product> cheapest = products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("books"))
                .min(Comparator.comparingDouble(Product::getPrice));
        System.out.println(cheapest.get());

    }


}