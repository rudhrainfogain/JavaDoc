package com.infogain.demo;

import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;


/**
 * An implemented type of List which can't be null
 *
 * @param <E> the type of elements in this list
 *
 * @author Superman
 * @see ArrayList
 * @see Collection
 * @see LinkedList
 * @see List
 * @see Set
 * @see Vector
 * @see Arrays#asList(Object[]) asList in array
 * @see Collections#nCopies(int, Object)
 * @see Collections#EMPTY_LIST
 * @see java.lang.String#chars()
 * @see java.lang
 * @since 1.2
 */
public interface MyList<E> extends List<E> {

    default boolean isEmpty() {
        return false;
    }
}
