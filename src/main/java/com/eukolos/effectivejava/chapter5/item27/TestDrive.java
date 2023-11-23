package com.eukolos.effectivejava.chapter5.item27;

import com.eukolos.datastructures.array.Array;

import java.util.HashSet;
import java.util.Set;

public class TestDrive {

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        Set<Lark> exaltation = new HashSet();
        exaltation.add(new Lark());
        exaltation.add(new Lark());
        exaltation.add(new Lark());
        System.out.println(exaltation.size());
    }

    /*
    // Adding local variable to reduce scope of @SuppressWarnings
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            // This cast is correct because the array we're creating
            // is of the same type as the one passed in, which is T[].
            @SuppressWarnings("unchecked") T[] result =
                (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }
    * */


}
