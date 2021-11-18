package com.example.tacolocos.data;
import java.util.HashMap;


/*
 *@created 11/17/2021
 *@author Richard Fawaz
 */

/* TODO
*   Convert all JSON data to lower so that doesnt cause errors  */

public class TacoMenu {
    public static final HashMap<String, Double> ITEMS = new HashMap<>();
//intilaizng all the menu items into a table so they can be called via key
    static {
        ITEMS.put("Veggie Taco", 2.50);
        ITEMS.put("Chicken Taco", 3.00);
        ITEMS.put("Beef Taco", 3.00);
        ITEMS.put("Chorizo Taco", 3.50);

    }

}
