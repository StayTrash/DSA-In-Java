public class cllpract {
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    Node head;
    Node tail;

    public cllpract() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;

        do {
            System.out.println(node.value + " -> ");
            node = node.next;
        } while (node != null);
    }

    public void delete(int val) {
        Node node = head;

        if (node == null) {
            return;
        }

        if (node.value == val) {
            head = head.next;
            tail = node;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }
}
