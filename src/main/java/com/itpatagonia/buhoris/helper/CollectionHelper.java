package com.itpatagonia.buhoris.helper;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionHelper {
    public static <T> Set<T> toSet(Iterable<T> iterable) {
        if (iterable == null) {
            return Collections.emptySet();
        }

        Set<T> result = new HashSet<>();
        for (T item : iterable) {
            result.add(item);
        }

        return result;
    }
}
