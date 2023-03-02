package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
private String name;
public void setName(String name) {
this.name=name;
}
@GetMapping("/")
public String getName() {
setName("Solomon");
return "Hi "+name;
}
}
