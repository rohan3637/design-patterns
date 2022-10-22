package behavioral.CodeForIterator;

import java.io.IOException;
import java.util.Iterator;

public class Main {

    static class MyLinkedList implements Iterable<Integer> {

        static class Node {
            int data;
            Node next;
        }

        Node head;
        Node tail;
        int size;

        void addLast(int data){
            Node node = new Node();
            node.data = data;
            node.next = null;

            if(size == 0) head = tail = node;
            else{
                tail.next = node;
                tail = node;
            }
            size++;
        }

        int size(){
            return size;
        }

        public Iterator<Integer> iterator(){
            return new MyLinkedListIterator(head);
        }

        static class MyLinkedListIterator implements Iterator<Integer> {

            Node temp;

            public MyLinkedListIterator(Node temp){
                this.temp = temp;
            }        

            public Integer next(){
                int val = temp.data;
                temp = temp.next;
                return val;
            }

            public boolean hasNext(){
                if(temp != null) return true;
                return false;
            }
        }
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        MyLinkedList list = new MyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        for(int val : list){
            System.out.print(val + " -> ");
        }
        System.out.print("null");

        // above code is syntactical sugar for the following code
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext() == true){
            int val = itr.next();
            System.out.print(val + " -> ");
        } 
        System.out.print("null");
    }
}
