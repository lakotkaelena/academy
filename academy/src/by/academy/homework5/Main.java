package by.academy.homework5;

public class Main {
    public static void main(String[] args) {


        Integer[][] arr = {{2, 4, 6, 3}, {4, 56, 7, 9, 2, 4}};
        ArrayIterator iterator = new ArrayIterator(arr);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
