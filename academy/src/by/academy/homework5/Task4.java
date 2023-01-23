package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        /*
        Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.

         */
        int capacity = 10;
        ArrayList<Integer> arrayList = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            arrayList.add(i, (int) (Math.random() * 10 + 1));
            System.out.println(arrayList.get(i));
        }
        Iterator<Integer> iterator = arrayList.iterator();


        int max = 0;
        int value = 0;

        while (iterator.hasNext()) {
            if ((value = iterator.next()) > max) {
                max = value;
            }
        }

        System.out.println("Max. value: " + max);

    }

}








