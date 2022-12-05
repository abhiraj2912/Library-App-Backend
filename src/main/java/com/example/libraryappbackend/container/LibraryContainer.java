package com.example.libraryappbackend.container;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryContainer {

    @PostMapping("")
    public String UserRegister()
    {
        return "User Registration";
    }

    @PostMapping("/add")
    public String AddBook()
    {
        return "Add Books";
    }

    @PostMapping("/search")
    public String SearchBook()
    {
        return "Search Book";
    }

    @PostMapping("/delete")
    public String DeleteBook()
    {
        return "Delete Book";
    }

    @PostMapping("/edit")
    public String EditBook()
    {
        return "Edit Book";
    }

    @GetMapping("/view")
    public String ViewBooks()
    {
        return "View Books";
    }

}
