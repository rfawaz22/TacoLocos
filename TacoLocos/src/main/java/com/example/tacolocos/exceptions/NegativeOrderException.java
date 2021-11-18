package com.example.tacolocos.exceptions;/*
 *@created 11/17/2021
 *@author Richard Fawaz
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "The order number you entered is incorrect, please reorder")
public class NegativeOrderException {
    private static final long serialVersionUID = 1l;

}
