package com.example.libraryappbackend.container;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryContainer {

    @PostMapping
    public String UserRegister(){
        return "User Registration";
    }


}
