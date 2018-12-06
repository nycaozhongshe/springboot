package com.example.demo2.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class GetController {

  @RequestMapping(value = "/getUserByGet", method = RequestMethod.GET)

  public String getUserByGet(@RequestParam(value = "name") String name) {
    return "你好" + name;
  }
}
