// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexInMountainArray6 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 7, 5, 4, 2, 1, 0};
//        int[] arr = {7,6,3,1,6,8,9};
        int ans = PeakIndexInMountainArray(arr);
        System.out.println(ans);

    }

//    Q: Find peak index in Mountain Array
    static int PeakIndexInMountainArray (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                // you are in the decreasing part of the array
                // this may be the ans , but look at left
                // this is why end != mid - 1

                end = mid;
            } else {
                // you are in the increasing part of the array

                start = mid + 1;  // because we know that element[mid+1] > element[mid]
            }
        }
        // in the end, start == end & pointing to the largest number because of the 2 checks above
        // start & end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start & end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer

        return  start; // or return end as in the end , both are equal
    }
}
