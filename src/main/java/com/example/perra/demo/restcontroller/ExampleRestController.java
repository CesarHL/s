package com.example.perra.demo.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("exampleRestController")
public class ExampleRestController {
	
	@RequestMapping("/xss")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

}
