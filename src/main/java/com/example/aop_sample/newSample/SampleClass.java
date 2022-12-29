package com.example.aop_sample.newSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class SampleClass {

    public void sampleMsg(String name) {
        System.out.println(name+ " is working");
    }
}
