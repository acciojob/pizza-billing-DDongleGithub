package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    boolean isExtraCheese;
    boolean isExtraToppings;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheese = false;
        this.isExtraToppings = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;
        this.bill = "";
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza:" + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        /* your code goes here */
        if(!isExtraCheese){
            this.price = this.price + cheese;
            this.isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppings){
         this.price = this.price + toppings;
         isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price += 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isExtraCheese)
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            if(isExtraToppings)
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            if(isTakeAwayAdded)
                this.bill += "Paperbag Added: " + 20 + "\n";

            this.bill += "Total Price: " + this.price;
            isBillGenerated = true;
        }
        return this.bill;
    }
}
