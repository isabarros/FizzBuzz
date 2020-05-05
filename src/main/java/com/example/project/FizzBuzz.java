package com.example.project;

public class FizzBuzz {
    public String execute(int number) throws NonPositiveNumberException {
        StringBuilder result = new StringBuilder("");

        if(isNegative(number)) {
            throw new NonPositiveNumberException();
        }
        
        if(isMultipleOf3(number)) {
			result.append("Fizz");
        }

        if(isMultipleOf5(number)) {
            result.append("Buzz");
        }

		if(result.toString().isEmpty()) {
			return String.valueOf(number);
		}

        return result.toString();
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isNegative(int number) {
        return number < 0;
    }
}