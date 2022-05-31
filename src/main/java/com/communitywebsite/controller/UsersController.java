package com.communitywebsite.controller;

import com.communitywebsite.dto.UserRegistrationDto;
import com.communitywebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity resgisterUser(@RequestBody UserRegistrationDto userRegistrationDto){

        var response=userService.resgisterUser(userRegistrationDto);

        return new ResponseEntity(response, HttpStatus.CREATED);
    }

   @GetMapping("/login")
    public ResponseEntity userLogin(@RequestParam String email, @RequestParam String password){
        var user=userService.userLogin(email,password);
        if(user==null)  return new ResponseEntity<>("User Doesn't Exist",HttpStatus.NOT_FOUND);
        return new ResponseEntity(user,HttpStatus.ACCEPTED);
    }
}