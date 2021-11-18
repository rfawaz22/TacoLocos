package com.example.tacolocos.exceptions;/*
 *@created 11/17/2021
 *@author Richard Fawaz
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason= "Sorry, there was an item in your order that we do not have on the menu, please look at the menu again and reorder")

public class DoesntExistException extends RuntimeException {
    private static final long serialVersionUID = 1L;




}
