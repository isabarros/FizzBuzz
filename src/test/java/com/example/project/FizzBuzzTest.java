package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {
	FizzBuzz fizzBuzz;

	@BeforeEach
	public void setUp(){
		fizzBuzz = new FizzBuzz();
	}

	@Test
	void shouldReturnFizzWhenMultipleOf3() throws NonPositiveNumberException {
		assertEquals("Fizz", fizzBuzz.execute(3));
	}

	@Test 
	void shouldReturnBuzzWhenMultipleOf5() throws NonPositiveNumberException {
		assertEquals("Buzz", fizzBuzz.execute(5));
	}

	@Test
	void shouldReturnFizzBuzzWhenMutipleBoth3and5() throws NonPositiveNumberException {
		assertEquals("FizzBuzz", fizzBuzz.execute(15));
	}

	@Test
	void shouldReturnNumberIfNotMultipleOfAny() throws NonPositiveNumberException {
		assertEquals("7", fizzBuzz.execute(7));
	}

	@Test
	void shouldNotAcceptNegativeNumbers() {
		assertThrows(NonPositiveNumberException.class, () -> {
			fizzBuzz.execute(-7);
		});
	}
}
