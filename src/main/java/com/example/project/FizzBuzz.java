package com.example.project;

public class FizzBuzz {
    public String execute(int number) {
        StringBuilder result = new StringBuilder("");
        
        if(number % 3 == 0) {
			result.append("Fizz");
        }

        if(number % 5 == 0) {
            result.append("Buzz");
        }

		if(result.toString().isEmpty()) {
			return String.valueOf(number);
		}

        return result.toString();
    }
}