package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {

	@Test
	void shouldReturnBarWhenCallingFoo() {
		Example example = new Example();
		assertEquals("bar", example.foo());
	}
}
