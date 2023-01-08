package by.academy.homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CustomDate customDate = new CustomDate();
        do {
            System.out.println("Введите дату в формате ДД-ММ-ГГГГ: ");

        } while (customDate.validate() == null);

        System.out.println(customDate.year0.isLeapsYear());

        customDate.day0.dayOfWeek();
        customDate.day0.outputDay();
    }
}
