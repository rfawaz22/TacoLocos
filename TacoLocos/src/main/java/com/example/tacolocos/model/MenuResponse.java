package com.example.tacolocos.model;/*
 *@created 11/17/2021
 *@author YZCYZJ
 */

import java.util.HashMap;

public class MenuResponse {
    private final HashMap<String, Double> menu;

    public MenuResponse(HashMap<String, Double> menu) {
        this.menu = menu;
    }

    public HashMap<String, Double> getMenu() {
        return menu;
    }
}
