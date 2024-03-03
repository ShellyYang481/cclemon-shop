package com.cclemon.cclemonshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/hello")
  public String hello() {
    return "hello"; // 返回模板文件的名稱，這裡假設模板名稱是 hello.html
  }
}
