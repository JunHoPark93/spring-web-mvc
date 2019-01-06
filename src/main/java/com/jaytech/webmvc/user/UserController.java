package com.jaytech.webmvc.user;

import org.springframework.web.bind.annotation.*;

/**
 * @author junho.park
 */
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }
}
