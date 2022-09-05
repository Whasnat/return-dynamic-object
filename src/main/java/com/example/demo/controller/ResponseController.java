package com.example.demo.controller;


import com.example.demo.repositories.ResponseRepository;
import com.example.demo.service.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class ResponseController {

    @Autowired
    private ResponseRepository responseRepository;


    @GetMapping("/get-res")
    public List<ResponseObject> getResponse(){return responseRepository.findAll();}


    @PostMapping("/post-response")
    public ResponseObject createResponse(ResponseObject responseObject) {
        return responseRepository.save(responseObject);
    }
}
