package org.example;

public class DeluxPizza extends  Pizza{

    public DeluxPizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
