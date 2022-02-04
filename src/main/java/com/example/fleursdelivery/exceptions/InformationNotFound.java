package com.example.fleursdelivery.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class InformationNotFound  extends  RuntimeException{

    public InformationNotFound(String notFound){ super(notFound);}
}
