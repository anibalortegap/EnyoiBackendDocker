package co.enyoi.enyoi_dockerspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AppController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello World";
    }

}
