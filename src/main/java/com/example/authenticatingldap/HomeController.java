package com.example.authenticatingldap;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.ldap.userdetails.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index(@AuthenticationPrincipal Person person) {
        return "Welcome to the home page! " + person.getUsername()
                + " " + person.getGivenName()
                + " " + person.getDn();
    }
}
