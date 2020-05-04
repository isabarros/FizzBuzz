package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {
	FizzBuzz fizzBuzz;

	@BeforeEach
	public void setUp(){
		fizzBuzz = new FizzBuzz();
	}

	@Test
	void shouldReturnFizzWhenMultipleOf3() {
		assertEquals("Fizz", fizzBuzz.execute(3));
	}

	@Test 
	void shouldReturnBuzzWhenMultipleOf5() {
		assertEquals("Buzz", fizzBuzz.execute(5));
	}

	@Test
	void shouldReturnFizzBuzzWhenMutipleBoth3and5(){
		assertEquals("FizzBuzz", fizzBuzz.execute(15));
	}

	@Test
	void shouldReturnNumberIfNotMultipleOfAny() {
		assertEquals("7", fizzBuzz.execute(7));
	}
}
