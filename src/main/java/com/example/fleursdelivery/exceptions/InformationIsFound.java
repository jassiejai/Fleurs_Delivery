package com.example.fleursdelivery.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class InformationIsFound extends RuntimeException {

    public InformationIsFound(String isFound){ super(isFound);}
}
