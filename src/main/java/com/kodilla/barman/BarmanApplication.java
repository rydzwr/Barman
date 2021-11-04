package com.kodilla.barman;

public class BarmanApplication
{

    public static void main(String[] args)
    {
        Drink drink = Barman.createDrink("Pineapple Juice", 100, "Malibu",
                50, "Coconut Milk", 100);
        Barman.printDrink(drink);
    }
}
