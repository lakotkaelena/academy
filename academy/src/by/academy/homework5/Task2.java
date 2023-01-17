package by.academy.homework5;


import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {
    /*Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
Замерьте время, которое потрачено на это.
Сравните результаты и предположите, почему они именно такие.
     */
    public static void main(String[] args) {
        int count = 1000000;
        int once = 100000;
        ArrayList<Double> arrayList = new ArrayList<>();
        long timeBeforeAdd = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            arrayList.add(Math.random() * 100);
        }
        long timeAfterAdd = System.currentTimeMillis();
        long millisecond = timeAfterAdd -timeBeforeAdd;

        System.out.println(" Время на заполнение 1000000 элементами arrayList, мс:" + millisecond);
        System.out.println("-----------------------------------");

        LinkedList<Double> linkedList = new LinkedList<>();
        long timeBeforeAdd1 = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            linkedList.add(Math.random() * 100);
        }
        long timeAfterAdd1 = System.currentTimeMillis();
        long millisecond1 = timeAfterAdd1 - timeBeforeAdd1;
        System.out.println(" Время на заполнение 1000000 элементами linkedList, мс:" + millisecond1);
        System.out.println("-----------------------------------");

        long timeBeforeGet = System.currentTimeMillis();
        for (int i = 0; i < once; i++) {
            arrayList.get((int) (Math.random() * count));
        }
        long timeAfterGet = System.currentTimeMillis();
        long millisecond2 = timeAfterGet - timeBeforeGet;
        System.out.println(" Выбор элемента из заполненного списка arrayList 100 000 раз, мс:" + millisecond2);
        System.out.println("-----------------------------------");

        long timeBeforeGet1 = System.currentTimeMillis();
        for (int i = 0; i < once; i++) {
            linkedList.get((int) (Math.random() * count));
        }
        long timeAfterGet1 = System.currentTimeMillis();
        long millisecond3 = timeAfterGet1 - timeBeforeGet1;
        System.out.println(" Выбор элемента из заполненного списка linkedList 100 000 раз, мс:" + millisecond3);
    }

}
