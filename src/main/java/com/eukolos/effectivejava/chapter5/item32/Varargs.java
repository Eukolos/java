package com.eukolos.effectivejava.chapter5.item32;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Varargs {
    static void dangerous(List<String>... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList;             // Heap pollution
        String s = stringLists[0].get(0); // ClassCastException
    }
    // varargs method with a non-reifiable varargs parameter like List<String>... is dangerous.

    // This method is not, in and of itself, dangerous and would not generate a warning except that it invokes the toArray method, which has a generic varargs parameter.
    @SafeVarargs // dont use this annotation if you dont sure that your method is safe
    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> List<T> pickTwo(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return List.of(a, b);
            case 1: return List.of(a, c);
            case 2: return List.of(b, c);
        }
        throw new AssertionError();
    }

    // Safe method with a generic varargs parameter
    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists)
            result.addAll(list);
        return result;
    }

    public static void main(String[] args) {
        // dangerous(List.of("There be dragons!")); // ClassCastException at runtime and heap pollution
        // String[] attributes = pickTwo("Good", "Fast", "Cheap"); // ClassCastException at runtime
        flatten(List.of("Good", "Fast"), List.of("Cheap", "Fast", "Good"));
    }
}
