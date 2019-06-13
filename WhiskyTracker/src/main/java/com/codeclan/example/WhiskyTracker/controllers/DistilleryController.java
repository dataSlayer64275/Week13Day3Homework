package com.codeclan.example.WhiskyTracker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping
    public List<Pirate> getAllDistilleries(){
        return distilleryRepository.findAll();
    }




}
