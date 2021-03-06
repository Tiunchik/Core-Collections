package ru.job4j.list;

import java.util.Iterator;

public interface CollectionsList<E> extends Iterable<E> {

    public void add(E value);

    public Iterator<E> iterator();
}
