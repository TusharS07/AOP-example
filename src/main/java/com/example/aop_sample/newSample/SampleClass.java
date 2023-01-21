package com.example.aop_sample.newSample;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Component
public class SampleClass {

    public void sampleMsg(String name) {
        System.out.println(name+ " is working");
    }
}
