package com.example.restservice;

import com.example.vo.BtsConstants;
import com.example.vo.BtsResponse;
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
        if ("".equalsIgnoreCase(name)) {
            person.setFirstName("");
            person.setLastName("");
        }
        return person;
    }

    @GetMapping("/bts")
    public BtsResponse getBTS(@RequestParam(value = "name", defaultValue = "") String name) {
        BtsResponse response = new BtsResponse();
        boolean isBts = false;

        for (String bts : BtsConstants.BTS_NAMES) {
            if (bts.equalsIgnoreCase(name)) {
               isBts = true;
            }
        }
        if (isBts) {
            response.setMessage("You're an armmmyyyyy. Yay!!!");
        } else {
            response.setMessage("EPAL ka, hindi yan BTS!");
        }
        return response;
    }
}
