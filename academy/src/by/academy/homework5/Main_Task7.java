package by.academy.homework5;

import java.io.IOException;
import java.util.Scanner;

import static by.academy.homework5.Solution.reverse;

public class Main_Task7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Solution.DoublyLinkedList list = new Solution.DoublyLinkedList();
        int listCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < listCount; i++) {
            int listItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            list.insertNode(listItem);
        }
        Solution.DoublyLinkedList list1 = reverse(list);
        Solution.DoublyLinkedListNode listNode = list1.head;
        while (listNode != null) {
            System.out.print(listNode.data + "  ");
            listNode = listNode.next;
        }

    }
}
