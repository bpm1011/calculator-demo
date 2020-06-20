package com.javacalculator.calculatordemo;

public interface Operation {
    long apply(long a, long b); // apply method with two long parameters for calculations

    boolean valid(char operator); //valid method that makes sure operator is character type

}
