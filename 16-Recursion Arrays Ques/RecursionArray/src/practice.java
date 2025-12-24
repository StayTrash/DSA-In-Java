import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
//        int[] num = {1,2,3,4,5,8,9};
//        System.out.println(sort(num, 0));

//        int[] arr = {1,34,56,23,67,1221};
//        System.out.println(search(arr, 1221, 0));

        int[] arr1 = {1,2,3,4,3,5,6,3,9};
        System.out.println(allIndexes(arr1, 3, 0));
    }

    static boolean sort(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        return arr[index] < arr[index  + 1] && sort(arr, index + 1);
    }

    static int search(int[] arr, int target, int index) {
        if (index == arr.length) return -1;

        if (arr[index] == target) return index;

        return search(arr, target, index + 1);
    }

    static ArrayList<Integer> allIndexes(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);

        ArrayList<Integer> ansFromBelowCalls = allIndexes(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
