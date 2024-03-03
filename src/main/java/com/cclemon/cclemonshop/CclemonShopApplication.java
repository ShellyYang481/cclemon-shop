package com.cclemon.cclemonshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CclemonShopApplication {

  @Autowired
  private static ApplicationContext applicationContext;

  public static void main(String[] args) {
    SpringApplication.run(CclemonShopApplication.class, args);

  }

}
