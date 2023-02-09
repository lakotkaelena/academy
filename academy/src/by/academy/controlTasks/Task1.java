package by.academy.controlTasks;

import java.util.regex.Pattern;

public class Task1 {
    /*
    1) Реализуйте метод для выполнения простейшего сжатия строк с использованием счетчика повторяющихся символов.
Например, строка ааbсссссааа превращается в а2b1с5а3.
Если сжатая строка не становится короче исходной,
то метод возвращает исходную строку. Предполагается, что строка состоит
только из букв верхнего и нижнего регистра (a-z).
     */
    private static final Pattern pattern = Pattern.compile("[A-Za-zА-Яа-я]+");

    private static StringBuilder resultString = new StringBuilder();  //сжатая строка

    public static boolean validateString(String sourceString) {
        if (pattern.matcher(sourceString).matches()) {
            return true;
        }
        return false;
    }

    public static String compressString(String sourceString) {
        int count = 1;
        char symbol = sourceString.charAt(0);
        for (int i = 1; i < sourceString.length(); i++) {
            if (sourceString.charAt(i) == symbol) {
                count++;
            } else {
                resultString.append(symbol);
                resultString.append(count);
                symbol = sourceString.charAt(i);
                count = 1;
            }
        }
        if (sourceString.length() < resultString.length()) {
            return sourceString;
        }
        resultString.append(symbol);
        resultString.append(count);
        return resultString.toString();

    }
}
