package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone nombre para retornar Hello nombre
   * @return frase completa con saludos
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
