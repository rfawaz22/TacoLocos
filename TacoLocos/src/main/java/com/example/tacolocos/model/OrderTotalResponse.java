package com.example.tacolocos.model;/*
 *@created 11/17/2021
 *@author YZCYZJ
 */

public class OrderTotalResponse {
    private final String orderID;
    private final double total;

    public OrderTotalResponse(String ID, double total) {
        this.orderID = ID;
        this.total = total;
    }

    public String getOrderID() {
        return orderID;
    }

    public double getTotal() {
        return total;
    }
}
