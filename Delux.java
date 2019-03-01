package com.company.shishir;

public class Delux extends Hamburger {
    public Delux() {
        super("Delux", "Chicken and Bacon", 16.23, "White");
        super.addHamburgerAddition1("Chips", 2.45);
        super.addHamburgerAddition2("Drink", 1.20);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add any additional items");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add any additional items");    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add any additional items");    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add any additional items");    }
}
