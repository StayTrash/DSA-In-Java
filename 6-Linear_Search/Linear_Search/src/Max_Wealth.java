public class Max_Wealth {
    public static void main(String[] args) {
        int [][] account = { {1,5}, {7,3}, {3, 5, 6} };

        System.out.println(maxWealth(account));
    }

    static int maxWealth(int[][] accounts){
        // person = row
        // account = col

        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col , take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall ans

//            if(sum > ans) {
//                ans = sum;
//            }

//            "OR"
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
