package com.dagli.graylog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @GetMapping("/welcome")
    public String controllerStatus() {
        log.info("Welcome to Graylog with Dagli");
        return "Welcome to Graylog";
    }

    @GetMapping("/welcome-no-log")
    public String controllerStatus2() {
        //log.info("Welcome to Graylog with Dagli");
        return "Welcome to Graylog";
    }

    @GetMapping("exception")
    public void exception() {
        try {
            throw new IllegalArgumentException("Test");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

}
