package com.eukolos.effectivejava.chapter3.item10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // Broken - violates symmetry!
    @Override public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(
                    ((CaseInsensitiveString) o).s);
        if (o instanceof String)  // One-way interoperability!
            return s.equalsIgnoreCase((String) o);
        return false;
    }

    // this version break transitivity and symmetry rules of equals


    public static void main(String[] args) {

        // break symmetry
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        System.out.println(cis.equals(s)); // true
        System.out.println(s.equals(cis)); // false

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        System.out.println(list.contains(s));// false
        System.out.println(list.get(0).equals(s)); // true
    }
}