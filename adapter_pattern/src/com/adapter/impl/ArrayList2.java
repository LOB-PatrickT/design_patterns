package com.adapter.impl;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Patrick on 5/21/2017.
 */
public class ArrayList2 extends ArrayList implements Enumeration<Object> {
    List list;

    public ArrayList2(List list) {
        this.list = list;
    }


    @Override
    public boolean hasMoreElements() {
        return false;
    }

    @Override
    public Object nextElement() {
        return null;
    }
}
