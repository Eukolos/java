package com.eukolos.effectivejava.chapter4.item21;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;

import static java.util.Spliterators.iterator;

public interface Collections<E> {
    Iterator<E> iterator();


    // Default method added to the Collection interface in Java 8
    // Default methods are a powerful mechanism that allow you to add methods to existing interfaces
    // without breaking existing implementations of these interfaces.
    default boolean removeIf(Predicate<? super E> filter) {
        Objects.requireNonNull(filter);
        boolean result = false;
        for (Iterator<E> it = iterator(); it.hasNext(); ) {
            if (filter.test(it.next())) {
                it.remove();
                result = true;
            }
        }
        return result;
    }


}
