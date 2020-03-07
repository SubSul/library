package com.cts.library.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @RequestMapping({"/hello"})
    public String firstPage() {
        return "Hello World";
    }
}
