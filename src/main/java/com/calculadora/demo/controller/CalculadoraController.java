package com.calculadora.demo.controller;

import com.calculadora.demo.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

  @GetMapping("/suma")
  public Result suma(@RequestParam(name = "number1") float number1, @RequestParam(name = "number2") float number2) {
    float result = number1 + number2;
    return new Result("Suma", number1, number2, result);
  }

  @GetMapping("/resta")
  public Result resta(@RequestParam(name = "number1") float number1, @RequestParam(name = "number2") float number2) {
    float result = number1 - number2;
    return new Result("Resta", number1, number2, result);
  }

  @GetMapping("/multiplicacion")
  public Result multiplicacion(@RequestParam(name = "number1") float number1, @RequestParam(name = "number2") float number2) {
    float result = number1 * number2;
    return new Result("Resta", number1, number2, result);
  }

  @GetMapping("/division")
  public Result division(@RequestParam(name = "number1") float number1, @RequestParam(name = "number2") float number2) {
    float result = number1 / number2;
    return new Result("Resta", number1, number2, result);
  }

}
