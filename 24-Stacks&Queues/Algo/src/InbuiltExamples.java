import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
        // LIFO or FILO
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());  // will not give null, will giver error

//        Queue<Integer> queue = new LinkedList<>(); // no class as Queue , it works like linked list
//
//        // FIFO or LILO
//        queue.add(3);
//        queue.add(6);
//        queue.add(9);
//        queue.add(1);
//        queue.add(15);
//
////        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
////        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(65);
        deque.add(89);
        deque.addFirst(2);
        deque.addLast(9);
        deque.remove();
        deque.removeFirst();
        deque.removeLast();
//        etc etc

        System.out.println(deque);

    }
}