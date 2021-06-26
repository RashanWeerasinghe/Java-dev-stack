package com.example.rest.controller;

import com.example.rest.model.RestModel;
import com.example.rest.services.RestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
public class RestController {
    @Autowired
    private RestServices restServices;
    @PostMapping("/add")
    public RestModel addOrUpdateRecord(@RequestBody RestModel restModel){
          return restServices.addBLMethod(restModel);
    }
    @GetMapping("/all")
    public void findAllRecord(){

    }
    @GetMapping("/find/{id}")
    public void findById(){

    }
    @DeleteMapping("/delete/{id}")
    public void removeById(){

    }
}
