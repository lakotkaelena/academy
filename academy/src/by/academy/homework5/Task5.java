package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    /*
    Имеется текст. Следует составить для него частотный словарь:
Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.

     */
    public static String text = "I want to break free! I want to break free! I want to break free from your lies." +
            " You're so self satisfied I don't need you. I've got to break free...God knows, God knows I want to break free." +
            "I've fallen in love. I've fallen in love for the first time. And this time I know it's for real. I've fallen in love, yeah." +
            "God knows, God knows I've fallen in love.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int textIndex = 0; textIndex < text.length(); textIndex++) {
            if (map.containsKey(text.charAt(textIndex))) {
                int count = map.get(text.charAt(textIndex));
                count++;
                map.put(text.charAt(textIndex), count);

            } else {
                map.put(text.charAt(textIndex), 1);
            }
        }
        System.out.println(map);
    }
}
