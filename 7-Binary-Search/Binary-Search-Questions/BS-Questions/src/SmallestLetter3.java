//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter3 {
    public static void main(String[] args) {
        char[] letters = {'c','d','f','j'};
        char target = 'e';

        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }

    // Q : Find the smallest letter greater than the target
    // and if not found return first char in letters
    static char nextGreatestLetter (char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < letters[mid]){
                end = mid - 1;
            } else {              // (target >= letters[mid])
                start = mid + 1;
            }
        }

        // now start > end ---> start = end + 1
        return letters[start % letters.length];
    }
}
