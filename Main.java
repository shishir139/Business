package com.company.shishir;

public class Main {

    public static void main(String[] args) {
	// write your code here
Hamburger hamburger = new Hamburger("Basic", "Peproni", 4.10, "White");
double price = hamburger.itemizedHamburger();
hamburger.addHamburgerAddition1("Tomato", 1);
hamburger.addHamburgerAddition2("Lettuce", 0.67);
hamburger.addHamburgerAddition3("Cheese", 1.10);
        System.out.println("Total burger price is "+ hamburger.itemizedHamburger());

   HealthuBurger healthuBurger = new HealthuBurger("Chicken", 6.10);
   healthuBurger.addHealthAddition1("Egg", 5.20);
   healthuBurger.addHealthAddition2("Lentils", 2.76);
        System.out.println("Total healthy Burger Price is "+healthuBurger.itemizedHamburger());

        Delux delux = new Delux();
        //delux.addHamburgerAddition1("Cheeze",7.8);
        delux.itemizedHamburger();


    }
}
