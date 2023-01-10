package by.academy.homework4;

import by.academy.lesson14.classwork.HeavyBox;

import java.util.ArrayList;

public class CustomListDemo {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.print();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");
        list.print();
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getLastIndex());
        System.out.println(list.length());
        System.out.println(list.remove(2));
        System.out.println(list.remove("Test4"));


    }
}
