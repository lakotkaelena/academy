package by.academy.homework5;

import by.academy.lesson14.classwork.HeavyBox;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    /*
    Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
     */
    public static void main(String[] args) {

        HeavyBox heavyBox1 = new HeavyBox(23, 3, 4, 5);
        HeavyBox heavyBox2 = new HeavyBox(15, 6, 4, 8);
        HeavyBox heavyBox3 = new HeavyBox(12, 6, 10, 7);
        HeavyBox heavyBox4 = heavyBox3;
        List<HeavyBox> list = new ArrayList<>(); //входной список с дупликатами
        list.add(heavyBox1);
        list.add(heavyBox2);
        list.add(heavyBox3);
        list.add(heavyBox4);
        for (HeavyBox list1 : list) {
            System.out.println(list1.toString());

        }

        Set<HeavyBox> set = new LinkedHashSet<>(list); //создаем множество из элементов списка
        List<HeavyBox> listWithoutDuplicated = new ArrayList<>(set);
        for (HeavyBox list1 : listWithoutDuplicated) {
            System.out.println(list1.toString());

        }


    }
}
