package com.javacalculator.calculatordemo.operations;

import com.javacalculator.calculatordemo.Operation;
import org.springframework.stereotype.Component;

@Component
public class Modulo implements Operation {

    @Override
    public long apply(long a, long b) { return a % b; } //uses apply method defined in operation interface

    @Override
    public boolean valid(char operator) {
        return '%' == operator;
    } //uses valid method defined in Operation interface

}