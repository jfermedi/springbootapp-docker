package com.spring.docker.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/dockerdemo")
    public String getDemo(){
        return "SpringBoot app is Dockerized successfully";
    }
}
