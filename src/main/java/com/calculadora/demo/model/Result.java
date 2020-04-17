package com.calculadora.demo.model;

public class Result {

  private String operation;
  private float number1;
  private float number2;
  private float result;

  public Result(String operation, float number1, float number2, float result) {
    this.operation = operation;
    this.number1 = number1;
    this.number2 = number2;
    this.result = result;
  }

  public String getOperation() {
    return operation;
  }

  public float getNumber1() {
    return number1;
  }

  public float getNumber2() {
    return number2;
  }

  public float getResult() {
    return result;
  }
}
