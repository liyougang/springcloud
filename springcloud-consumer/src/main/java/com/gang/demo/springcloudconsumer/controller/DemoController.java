package com.gang.demo.springcloudconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/user/{id}")
    public int findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://localhost:8080/" + id, Integer.class);
    }
}
