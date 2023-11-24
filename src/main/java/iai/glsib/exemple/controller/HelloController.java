package iai.glsib.exemple.controller;

import iai.glsib.exemple.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {
    @Autowired
    private HelloService helloService;
    /*@GetMapping("/salut")
    public String hello(){
        return "Ceci est ma première API Rest";
    }*/
    @GetMapping("/salut")
    public String hello(){
        return helloService.Hello();
    }
}
