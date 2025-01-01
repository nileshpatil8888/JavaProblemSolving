package LeetCode.LinkedList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(20);
        list.add(2);
        list.add(11);
        list.add(1);
        list.insertLast(25);
        list.insert(50, 4);
        list.display();
        System.out.println("deleted element :" + list.deleteFirst());
        System.out.println("updated list after deleting first");
        list.display();
        System.out.println("deleted element :" + list.deleteLast());
        System.out.println("updated after deleting last");
        list.display();
        System.out.println("deleted element :" + list.deleteIndex(3));
        System.out.println("updated after deleting with help of index");
        list.display();
    }
}
