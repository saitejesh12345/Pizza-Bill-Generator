package org.example;

public class Pizza {

    private int price; //final price

    private Boolean isVeg;

    private String bill;

    private  int basePrice;

    private int cheesePrice = 80;

    private int VegToppingsPrice = 70;

    private int NonVegToppingsPrice = 120;

    private  int toppingsPrice ;

    private BillGenerator billGenerator;

    private int vegBasePrice = 300;

    private int nonVegBasePrice = 400;

    private int takeAwayPrice = 20;

    private Boolean isCheeseAdded;

    private Boolean isToppingsAdded;

    private Boolean isTakeAway;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        basePrice =getBasePrice();
       price = basePrice;
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAway = false;
        this.billGenerator = new BillGeneratorImpl();
    }

    public Pizza(Boolean isVeg,BillGenerator billGenerator) {
        this.isVeg = isVeg;
        basePrice =getBasePrice();
        price = basePrice;
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAway = false;
        this.billGenerator = new BillGeneratorImpl();
    }

//    public Pizza(Boolean isVeg,BillGenerator billGenerator) {
//        this.isVeg = isVeg;
//        basePrice =getBasePrice();
//        price = basePrice;
//        this.isCheeseAdded = false;
//        this.isToppingsAdded = false;
//        this.isTakeAway = false;
//        this.billGenerator = new BillGeneratorImpl2();
//    }
    public void addExtraCheese() {
        if (!isCheeseAdded) {
            isCheeseAdded = true;
            price += cheesePrice;
        }

    }

    public void addExtraToppings() {
        if (!isToppingsAdded) {
            isToppingsAdded = true;
            if (isVeg) {
                toppingsPrice = VegToppingsPrice;
                price += VegToppingsPrice;
            } else {
                toppingsPrice = NonVegToppingsPrice;
                price += NonVegToppingsPrice;
            }
        }
    }

    public void addTakeaway() {
        if (!isTakeAway) { // if it is not take away already then
            isTakeAway = true;
            price += takeAwayPrice;
        }
    }

    public int getBasePrice() {
        if (isVeg) {
            return vegBasePrice;

        } else {
             return  nonVegBasePrice;
        }
    }


    public int getPrice() {
        return price;
    }

    public String getBill() {
  String bill = billGenerator.getBill(this);
  this.bill = bill;
 return this.bill;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public int getCheesePrice() {
        return cheesePrice;
    }

    public int getVegToppingsPrice() {
        return VegToppingsPrice;
    }

    public int getNonVegToppingsPrice() {
        return NonVegToppingsPrice;
    }

    public int getToppingsPrice() {
        return toppingsPrice;
    }

    public int getVegBasePrice() {
        return vegBasePrice;
    }

    public int getNonVegBasePrice() {
        return nonVegBasePrice;
    }

    public int getTakeAwayPrice() {
        return takeAwayPrice;
    }

    public Boolean getCheeseAdded() {
        return isCheeseAdded;
    }

    public Boolean getToppingsAdded() {
        return isToppingsAdded;
    }

    public Boolean getTakeAway() {
        return isTakeAway;
    }
}
