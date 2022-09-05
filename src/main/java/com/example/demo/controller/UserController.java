package com.example.demo.controller;

import com.example.demo.exceptions.NotFoundException;
import com.example.demo.model.UserModel;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get-res")
    public List<UserModel> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/new-res")
    public UserModel createUser(@Valid @RequestBody UserModel user) {
        return userRepository.save(user);
    }


    @GetMapping("/get-res/{id}")
    public ResponseEntity<UserModel> getUserByID(@PathVariable(value = "id") String id) throws NotFoundException {
        UserModel user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("User Not Found"));
        return ResponseEntity.ok().body(user);
    }

    @PutMapping("/update-user/{id}")
    public ResponseEntity<UserModel> updateUser(@PathVariable(value = "id") String id,
                                           @RequestBody UserModel userDetails) throws NotFoundException {
        UserModel user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("User Not Found"));
        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setDob(userDetails.getDob());

        userRepository.save(user);
        return ResponseEntity.ok().body(user);
    }



}
