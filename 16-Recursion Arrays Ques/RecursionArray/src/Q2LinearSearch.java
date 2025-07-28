import java.util.ArrayList;

public class Q2LinearSearch {
    public static void main(String[] args) {
//        int[] arr = {1,34,56,23,67,1221};
//        System.out.println(search(arr, 23, 0));
//        System.out.println(searchfromLast(arr, 9, arr.length - 1));

        int[] arr2 = {1,2,3,4,3,5,6,3,9};
//        allIndexes(arr2, 3, 0);
//        System.out.println(list);
        System.out.println(allIndexes2(arr2, 3, 0, list));
        System.out.println(allIndexes2(arr2, 3, 0, new ArrayList<>()));

        System.out.println(allIndexes3(arr2, 3, 0));
    }
    static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
//        if (index == arr.length) {  cannot put here after above "if" cuz index will be out of bound for above "if" case
//            return -1;
//        }
        return search(arr, target, index + 1);
    }
    static int searchfromLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return searchfromLast(arr, target, index - 1);
    }

    // for multiple occurrences
    static ArrayList<Integer> list = new ArrayList<>();
    static void allIndexes(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        allIndexes(arr, target, index + 1);
    }

    static ArrayList allIndexes2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return allIndexes2(arr, target, index + 1, list);
    }

    // "important concept": if you don't want to pass a new argument

    static ArrayList allIndexes3(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = allIndexes3(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);
//        list.addAll(0,ansFromBelowCalls);

        return list;
    }
}
