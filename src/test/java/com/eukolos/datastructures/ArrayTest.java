package com.eukolos.datastructures;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    public static void main(String[] args) {
        String dizi1[] = {"istanvul", "ankara", "izmir", "bursa", "adana"};
        String dizi2[] = Arrays.copyOf(dizi1, dizi1.length);

        for (String i: dizi2) {
            System.out.println(i);
        }
    }

}