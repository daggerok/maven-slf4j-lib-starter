package io.github.daggerok;

public class HelloService {
  public static String greet(String... names) {
    return names.length > 0 ? "Hello, %s!".formatted(names[0]) : greet("World");
  }
}
