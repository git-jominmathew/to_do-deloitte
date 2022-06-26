package com.deloitte.todo.web;

import com.deloitte.todo.inputs.UserInput;
import com.deloitte.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveuser")
    public String saveUser(@RequestBody UserInput userInput){
        return userService.saveUser(userInput);
    }

    @GetMapping("/getuser/{name}")
    public Integer getUser(@PathVariable String name){
        return userService.getUser(name);
    }
}
