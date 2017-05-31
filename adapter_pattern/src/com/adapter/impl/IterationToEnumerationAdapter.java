package com.adapter.impl;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Patrick on 5/21/2017.
 */
public class IterationToEnumerationAdapter implements Enumeration<Object> {

    Iterator iterator;

    public IterationToEnumerationAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

    public void remove() {
        iterator.remove();
    }
}
