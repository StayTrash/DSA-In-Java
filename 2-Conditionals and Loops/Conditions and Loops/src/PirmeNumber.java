import java.util.Scanner;

public class PirmeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int T = in.nextInt();

//        for(int i=0; i<T; i++){
            int N = in.nextInt();
            int count = 0;

            for(int j=1; j<=N; j++){
                if(N%j==0){
                    count+=1;
                }
            }
            if(count==2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
//        }
    }
}
