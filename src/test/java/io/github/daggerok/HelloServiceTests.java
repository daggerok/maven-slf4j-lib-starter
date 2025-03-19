package io.github.daggerok;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@DisplayName("HelloService tests")
@SuppressWarnings("LoggingSimilarMessage")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class HelloServiceTests {

  @Test
  void should_greet() {
    // when
    var greeting = HelloService.greet();
    log.info("greeting: {}", greeting);

    // then
    assertThat(greeting).isEqualTo("Hello, World!");
  }

  @Test
  void should_greet_Max() {
    // when
    var greeting = HelloService.greet("Max");
    log.info("greeting: {}", greeting);

    // then
    assertThat(greeting).isEqualTo("Hello, Max!");
  }
}
