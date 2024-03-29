package com.hui.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TextController {

    @RequestMapping("/hello")
    public Object helloWorld() {
        return "HelloWorld!";
    }
}
