package com.nepdroid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class MessageControllerTest {

	@Autowired
	 private TestRestTemplate restTemplate;

	 @Test
	 @DisplayName("test Message REST API ")
	 void testMessage() {
	  String message = this.restTemplate.getForObject("/hello", String.class);
	  assertEquals("Hello World  2", message);
	 }
	 
	 @Test
	 @DisplayName("Addition REST API ")
	 void addition() {
	 
	  Integer expected = 15;
	  Integer result = this.restTemplate.getForObject("/add", Integer.class);
	  assertEquals(expected, result);
	 }
	 
	 @Test
	 @DisplayName("Subtraction REST API ")
	 void subtraction() {
	 
	  Integer expected = 5;
	  Integer result = this.restTemplate.getForObject("/sub", Integer.class);
	  assertEquals(expected, result);
	 }
	 
	 @Test
	 @DisplayName("Multiplication REST API ")
	 void multiplication() {
	 
	  Integer expected = 50;
	  Integer result = this.restTemplate.getForObject("/mul", Integer.class);
	  assertEquals(expected, result);
	 }
	 
	 @Test
	 @DisplayName("Division REST API ")
	 void division() {
	 
	  Integer expected = 2;
	  Integer result = this.restTemplate.getForObject("/div", Integer.class);
	  assertEquals(expected, result);
	 }

}
