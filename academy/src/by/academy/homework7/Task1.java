package by.academy.homework7;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        /*
        Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100.
        Каждое число умножить на PI и отнять 20. Отфильтровать, оставив числа меньшие 100. Отсортировать по возрастанию.
         Пропустив первые 3 числа произвести следующие операции:
Преобразовать лист чисел в Map (операция collect), где ключем является само число а значением строка: ("Number: " + value).

         */
        Stream.generate(() -> new Random().nextInt(100)*Math.PI - 20)
                .limit(100)
                .filter(intValue -> intValue < 100)
                .sorted()
                .skip(3)
                .collect(Collectors.toMap(e-> e,s->"Number: " + s))
                .forEach((e , t) ->  System.out.print(e + " "));
        System.out.println();
//        System.out.println(count);
    }
}
