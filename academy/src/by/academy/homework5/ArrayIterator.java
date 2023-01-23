package by.academy.homework5;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer> {
    /*
    Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
Протестировать в main.

     */

    private int i = 0;
    private int j = 0;
    private Integer[][] array;

    public ArrayIterator(Integer[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (i < array.length && j < array[i].length) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        Integer n = array[i][j++];
        if (j >= array[i].length) {
            i++;
            j = 0;
        }
        return n;
    }
}

