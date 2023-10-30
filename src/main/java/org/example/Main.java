package org.example;

public class Main {
    public static void main(String[] args) {
        DeluxPizza dp = new DeluxPizza(true);
//        System.out.println("Base Price of Pizza: " + dp.getPrice());
        dp.addExtraCheese();
        dp.addExtraToppings();
        dp.addTakeaway();
        System.out.println(dp.getBill());

        Pizza p = new Pizza(true,new BillGeneratorImpl());
        p.addExtraCheese();
        p.addExtraToppings();
        p.addTakeaway();
        System.out.println(p.getBill());
    }
}
