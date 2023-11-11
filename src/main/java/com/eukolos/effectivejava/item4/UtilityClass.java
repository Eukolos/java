package com.eukolos.effectivejava.item4;

public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }
    // dont let them instantiate this class
    // this class is only for static methods
    // but u can involuntarily instantiate it with static methods

    public static UtilityClass createUtilityClass() {
        return new UtilityClass();
    }
}
