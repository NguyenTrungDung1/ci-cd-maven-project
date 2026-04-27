package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void testAdd() {
    Calculator calc = new Calculator();
    assertEquals(10, calc.add(2, 3));
  }
}
