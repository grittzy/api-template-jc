package com.example.restservice;

import com.example.vo.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping("/check")
    public Person greeting(@RequestParam(value = "name", defaultValue = "Stefanie") String name) {
        Person person = new Person();
        person.setFirstName("Joed");
        person.setLastName("Cueto");
        if ("Stefanie".equalsIgnoreCase(name)) {
            person.setFirstName("Stefanie");
            person.setLastName("Jara");
        }
        return person;
    }
}
