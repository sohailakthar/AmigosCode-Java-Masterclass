package com.sohail.CollectionsFramework;

import java.util.Iterator;

public class CustomCollection<T> implements Iterable {
    private int size;
    private T[] items;

    public CustomCollection() {
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }
    @Override
    public Iterator iterator() {
        return new CustomCollectionIterator(this);
    }

    private class CustomCollectionIterator implements Iterator<T> {

        private CustomCollection<T> list;
        private int index = 0;
        public CustomCollectionIterator(CustomCollection<T> list) {
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
