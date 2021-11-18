package com.example.tacolocos.controller;/*
 *@created 11/17/2021
 *@author Richard Fawaz
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.tacolocos.data.TacoMenu;
import com.example.tacolocos.model.MenuResponse;

@RestController
 // defining how to call this on the api /menu is the endpoint for calling the menu
public class MenuController {
    @RequestMapping("/menu")
    public MenuResponse items() {return new MenuResponse(TacoMenu.ITEMS);}




}
