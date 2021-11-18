package com.example.tacolocos.controller;/*
 *@created 11/17/2021
 *@author Richard Fawaz
 */


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.tacolocos.data.TacoMenu;
import com.example.tacolocos.model.OrderTotalRequest;
import com.example.tacolocos.model.OrderTotalResponse;
import com.example.tacolocos.exceptions.DoesntExistException;
import com. example.tacolocos.exceptions.NegativeOrderException;




import java.util.Map;

@RestController

public class OrderController {
    @RequestMapping("/total")
    public OrderTotalResponse orderTotal(@RequestBody OrderTotalRequest request) {
        double total = 0;
        int totalQuantity = 0;
        for(Map.Entry<String, Integer> itemAndQuantity: request.getFoodOrder().entrySet()) {
            String item = itemAndQuantity.getKey();
            if(!TacoMenu.ITEMS.containsKey(item)) {
                throw new DoesntExistException();
            }
            int quantity = itemAndQuantity.getValue();
            if(quantity < 0) {
                throw new DoesntExistException();
            }
            totalQuantity += quantity;
            double pricePerItem = TacoMenu.ITEMS.get(item);
            double extPrice = quantity * pricePerItem;
            total += extPrice;
        }
        if(totalQuantity >= 4) {
            total *= 0.8;
        }
        return new OrderTotalResponse(request.getOrderID(), total);
    }
}


