package com.example.deploy_exercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomSumController {

    @GetMapping("/sum")
    public Integer getRandomSum() {
        Random random = new Random();
        Integer a = random.nextInt(100);
        Integer b = random.nextInt(100);
        return a + b;
    }
}