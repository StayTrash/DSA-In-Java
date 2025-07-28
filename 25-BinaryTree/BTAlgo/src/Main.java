import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
//        tree.display();
        tree.prettyDisplay();

        tree.preOrder();
        tree.inOrder();
        tree.postOrder();

//        BST tree = new BST();
//        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
//        tree.populate(nums);
//        tree.display();
    }
}


//               15
//          6           9
//     8        14
//        10
