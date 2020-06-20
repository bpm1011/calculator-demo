package com.javacalculator.calculatordemo;

import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorDemoApplication.class, args);

	}

	public Calculator calculator(List operations) {

		return new Calculator(operations);
	}

	@Bean
	public ApplicationRunner applicationRunner(Calculator calculator) {

		return args -> {  //where the user enters their calculation
			System.out.println("--------------------------------------Calculations--------------------------------------");
			calculator.calculate(10, 20, '+'); //addition example
			calculator.calculate(100, 20, '/'); //division example
			calculator.calculate(10, 3, '*'); //multiplication example
			calculator.calculate(10, 3, '-'); //subtraction example
			calculator.calculate(10,3,'%'); //modulo "remainder" example
		};

	}

}