package Learnings;

public class Product {

    String name;
    float price;

    Product(String name, float price){

        this.name= name;
        this.price=price;

        System.out.println(name+ ": " + price);

    }
}
