package com.javacalculator.calculatordemo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Logger logger = LoggerFactory.getLogger(getClass()); //uses java logging API to log calculations

    private List<Operation> operations;

    public Calculator(List<Operation> operations) {
        this.operations = operations;
    }

    public void calculate(long a, long b, char operator) { //calculate method takes in two longs and a char operator

        for (Operation o : operations) { //runs through list of operations, if invalid operator throws argument exception
            if (o.valid(operator)) {

                long output = o.apply(a, b);
                logger.info(a + " " + operator + " " + b + " = " + output);
                return;
            }
        }
        throw new IllegalArgumentException("Illegal operation for operator : " + operator);
    }
}