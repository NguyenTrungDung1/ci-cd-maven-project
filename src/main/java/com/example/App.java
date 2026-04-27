package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public int add(int a, int b) {
    int result = a + b;
    logger.info("Adding {} + {} = {}", a, b, result);
    return result;
  }

  public int multiply(int a, int b) {
    int result = a * b;
    logger.info("Multiplying {} * {} = {}", a, b, result);
    return result;
  }
}
