package com.example.Studentdata.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class resourcenotfound extends RuntimeException{

    private static final long serialUid = 1L;

    public resourcenotfound(String message){
        super(message);
    }

}
