package com.clbs.user.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserRestApiController {

  @GetMapping("/{value}")
  public String eurekaClient(@PathVariable("value") String value) {
    return value == null ? "NA" : value;
  }
}
