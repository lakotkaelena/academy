package by.academy.homework5;

public class Task6 {
    /*
    Попробовать добавить в массив int на 8 элементов 10 чисел.
Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
"Array is to small, expand the array".

     */
    public static void main(String[] args) {

        int[] arr = new int[8];
        int newLength = 10;
        try {
            for (int i = 0; i < newLength; i++) {
                arr[i] = (int) Math.random() * 100;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "\nArray is to small, expand the array");
        }
    }
}
