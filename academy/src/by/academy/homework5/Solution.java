package by.academy.homework5;

import java.io.IOException;

public class Solution {
    /*
    Дан указатель на последний элемент двусвязного списка(tail).
     Head/tail может быть null, это говорит о том, что список пуст, возвращаем null.
     Поменять порядок элементов в списке на обратный. Измените следующий(next) и предыдущий (prev) указатели всех узлов,
      чтобы направление списка изменилось.
     Вернуть список на последний элемент измененного(перевернутого) списка.
     */

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next; //указатель на следующий элемент
        public DoublyLinkedListNode prev; //указатель на предыдущий элемент

        public DoublyLinkedListNode(int nodeData) {  //пустой список? или с одним элементом nodeData?
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head; //первый элеемент списка
        public DoublyLinkedListNode tail;  //последний элемент списка

        public DoublyLinkedList() {  //пустой список?
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);
            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.print(String.valueOf(node.data));
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    public static DoublyLinkedList reverse(DoublyLinkedList list) {
        if (list.head == null) {
            return null;
        }

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        DoublyLinkedListNode listNode = list.tail;

        DoublyLinkedListNode node = new DoublyLinkedListNode(list.tail.data);
        doublyLinkedList.head = node;

        while (!(listNode == null)) {
            DoublyLinkedListNode next = null;
            if (listNode.prev != null) {
                next = new DoublyLinkedListNode(listNode.prev.data);
            }
            DoublyLinkedListNode prev = null;
            if (listNode.next != null) {
                prev = new DoublyLinkedListNode(listNode.next.data);
            }
            node.next = next;
            node.prev = prev;

            listNode = listNode.prev;
            if (node.next != null) {
                node = node.next;
            }
        }

        doublyLinkedList.tail = node;
        return doublyLinkedList;
    }
}
