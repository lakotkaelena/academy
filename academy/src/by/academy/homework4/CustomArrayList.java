package by.academy.homework4;

import java.util.Arrays;

public class CustomArrayList<T> {
    private static final int DEFAULT_CAPASITY = 16;
    private T[] array;
    private int index = 0;

    public CustomArrayList() {
        super();
        this.array = (T[]) new Object[DEFAULT_CAPASITY];
    }

    public CustomArrayList(int count) {
        super();
        this.array = (T[]) new Object[count];
    }

    public void add(T element) {
        if (index >= array.length) {
            grow();
        }
        array[index++] = element;
    }

    private void grow() {
        T[] newArray = (T[]) new Object[array.length * 2 + 1];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        array = newArray;
    }

    public void print() {
        T[] temp = (T[]) new Object[index];
        System.arraycopy(array, 0, temp, 0, index);
        System.out.println(Arrays.toString(array));
    }

    public T getLast() {
        if (index >= array.length) {
            return null;
        }
        return (T) array[index - 1];
    }

    public T getFirst() {
        return (T) array[0];
    }

    public T get(int i) {
        T t = null;
        if (i >= 0 && i < index) {
            t = (T) array[i];
        }
        return t;
    }

    public int length() {
        return array.length;
    }

    public int getLastIndex() {
        return index - 1;
    }

    public T remove(int i) {
        T temp = array[i];
        System.arraycopy(array, i + 1, array, i, index - 1);
        array[array.length - 1] = null;
        index--;
        return temp;
    }

    public T remove(T obj) {
        int tempIndex = -1;
        for (int i = 0; i < index; i++) {
            if (array[i].equals(obj)) {
                return remove(i);
            }
        }
        return null;
    }
}
