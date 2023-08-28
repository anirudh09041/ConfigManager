package com.client.myapp.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MyController {

    private String message;

    private String variable;

    public MyController(@Value("${message}") String message, @Value("${variable}") String variable) {
        this.message = message;
        this.variable = variable;
    }

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }

    @GetMapping("/value")
    public String getValue(){
        return variable;
    }
}
