import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {9};

        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        int arr[] = new int [digits.length+1];
        arr[0]=1;
        return arr;
    }
}