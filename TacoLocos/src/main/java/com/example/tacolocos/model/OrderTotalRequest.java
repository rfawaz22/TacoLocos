package com.example.tacolocos.model;/*
 *@created 11/17/2021
 *@author YZCYZJ
 */

import java.util.HashMap;

public class OrderTotalRequest {
    private final String orderID;
    // name of food: quantity
    private final HashMap<String, Integer> foodOrder;

    public OrderTotalRequest(String orderID, HashMap<String, Integer> foodOrder) {
        this.orderID = orderID;
        this.foodOrder = foodOrder;
    }

    public String getOrderID() {
        return orderID;
    }

    public HashMap<String, Integer> getFoodOrder() {
        return foodOrder;
    }
}
