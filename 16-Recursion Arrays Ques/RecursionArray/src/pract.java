import java.util.ArrayList;

public class pract {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,8,9};
        System.out.println(sorted(num, 0));

        System.out.println(ls(num, 4, 0));
        System.out.println(lsLast(num, 3, num.length - 1));

        int[] arr2 = {1,2,3,4,3,5,6,3,9};

        allIndices(arr2, 3, 0);
        System.out.println(list);

        System.out.println(allIndices2(arr2, 3, 0, new ArrayList<>()));

        System.out.println(allIndices3(arr2, 3, 0));

        int[] num2 = {5,6,7,8,9,1,2,3};
        System.out.println(rbs(num2, 1, 0, num2.length - 1));

    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    static int ls(int[] arr, int target, int index) {
        if (index == arr.length) {
            return  -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return ls(arr, target, index + 1);
    }

    static int lsLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }

        return lsLast(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void allIndices(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        allIndices(arr, target, index + 1);
    }

    static ArrayList<Integer> allIndices2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        return allIndices2(arr, target, index + 1, list);
    }

    static ArrayList<Integer> allIndices3(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ans = allIndices3(arr, target, index + 1);

        list.addAll(ans);

        return list;
    }

    static int rbs(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return rbs(arr, target, s, m - 1);
            }
            return rbs(arr, target, m + 1, e);
        }

        if (target >= arr[m] && target <= arr[e]) {
            return rbs(arr, target, m + 1, e);
        }
        return rbs(arr, target, s, m - 1);
    }
}
