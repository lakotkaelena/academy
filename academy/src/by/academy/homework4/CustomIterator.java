package by.academy.homework4;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {
    private T[] array;
    private int index;
    private int count;

    public CustomIterator() {
        super();
    }

    public CustomIterator(T[] array, int size) {
        this.array = array;
        this.count = size;
    }

    @Override
    public boolean hasNext() {
        if (array == null || count <= index) {
            return false;
        }
        return true;
    }

    @Override
    public T next() {
        return array[index++];
    }

}
