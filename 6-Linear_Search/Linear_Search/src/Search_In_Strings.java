import java.util.Arrays;

public class Search_In_Strings {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';

        System.out.println(Search(name, target));
        System.out.println(Search2(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static Boolean Search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static Boolean Search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){   // for each loop
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
