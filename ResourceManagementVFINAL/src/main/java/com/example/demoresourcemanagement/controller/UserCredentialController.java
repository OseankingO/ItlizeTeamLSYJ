package com.example.demoresourcemanagement.controller;

import com.example.demoresourcemanagement.entity.UserCredential;
import com.example.demoresourcemanagement.service.UserCredentialService;
import com.example.demoresourcemanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userCredential")
public class UserCredentialController {

    @Autowired
    private UserCredentialService userCredentialService;

    @Autowired
    private UserService userService;

    @PostMapping("")
    public void addUserCredential(@RequestBody UserCredential userCredential) {
        userCredentialService.addUserCredential(userCredential);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<UserCredential> getUserCredential(@PathVariable int id) {
        return userCredentialService.getUserCredential(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> setUserCredential(@PathVariable int id, @RequestBody UserCredential userCredential) {
        return userCredentialService.setUserCredential(id, userCredential);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserCredentialById(@PathVariable int id) {
        return userService.deleteUserById(id);
    }
}

