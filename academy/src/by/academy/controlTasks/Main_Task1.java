package by.academy.controlTasks;

import java.util.Scanner;

public class Main_Task1 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String sourceString = scanner.nextLine();

        while (!Task1.validateString(sourceString)) {
            System.out.println("Строка должна состоять только из букв. Повторите ввод:  ");
            sourceString = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Исходная строка: " + sourceString);
        System.out.println("Сжатая строка: " + Task1.compressString(sourceString));


    }
}
