package com.example.aop_sample.controller;

import com.example.aop_sample.newSample.SampleClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AOPController {

    @Autowired
    SampleClass sampleClass;

    @GetMapping("/Studying1")
    public void studying1() {
        System.out.println("I am Studying");
        sampleClass.sampleMsg("Tushar");
    }


    @GetMapping("/playing/{name}")
    public void playing(@PathVariable String name) {
        System.out.println(name+" is playing");
    }

    @GetMapping("/Studying2")
    public void studying2() {
        System.out.println("i am studying");
    }


    @GetMapping("/Sum/{a}/{b}")
    public int sum(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }
}
