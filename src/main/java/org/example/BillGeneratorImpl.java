package org.example;

public class BillGeneratorImpl implements BillGenerator {
    @Override
    public String getBill(Pizza pizza) {
        String var ="";
        var += "Base Price of Pizza " + pizza.getBasePrice() +"\n";
        if(pizza.getCheeseAdded()){
            var +="Extra Cheese Added " + pizza.getCheesePrice() +"\n";
        }
        if(pizza.getToppingsAdded()){
            var +="Extra Toppings Added " + pizza.getToppingsPrice() + "\n";
        }
        if(pizza.getTakeAway()){
            var+= "Extra paper bag Price: " + pizza.getTakeAwayPrice() +"\n";
        }

        var+= "Total Price: "+ pizza.getPrice() + "\n";

       return var;
    }
}
