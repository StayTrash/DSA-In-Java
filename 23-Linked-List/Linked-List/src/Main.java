import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(100, 3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(2));
//        list.insertRec(88, 2);
//        list.display();


//        DLL list = new DLL();
//
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.display();
//        list.insertLast(99);
//        list.display();
//        list.insert(99, 65);
//        list.display();

//        CLL list = new CLL();
//
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();

//        Q1:
//        LL dupList = new LL();
//
//        dupList.insertLast(1);
//        dupList.insertLast(1);
//        dupList.insertLast(1);
//        dupList.insertLast(2);
//        dupList.insertLast(4);
//        dupList.insertLast(4);
//
//        dupList.display();
//        dupList.duplicate();
//        dupList.display();

//        Q2:
        LL first = new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        LL second = new LL();
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
        ans.display();


    }
}