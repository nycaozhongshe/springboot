package com.example.demo2.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class GetUserByJson {

  @RequestMapping(value = "/getUserByJson", method = RequestMethod.POST)

  public String getUserByJson(@RequestBody String data) {

    return "json1" + data;
  }
}
