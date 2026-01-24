import java.util.ArrayList;
import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
//        skip1("", "banana");
//        System.out.println(skip2("", "banana"));
//
//        skip3("", "adfasdfapple adf  ad apple adfa");
//        System.out.println(skip4("", "adfasdfapple adf  ad apple adfa"));
//
//        subSeq1("", "abc");
//        System.out.println();
//        System.out.println(subSeq2("", "abc"));

        per("", "abc");
        System.out.println();
        System.out.println(perCount("", "abc"));
        System.out.println(perRet("", "abc"));
    }

    static ArrayList<String> perRet(String p,String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            list.addAll(perRet(f + ch + s, up.substring(1)));
        }

        return list;
    }

    static int perCount(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count += perCount(f + ch + s, up.substring(1));
        }

        return count;
    }

    static void per(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            per(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> subSeq2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

//        ArrayList<String> list = new ArrayList<>();

        ArrayList<String> left = subSeq2(p + ch, up.substring(1));
        ArrayList<String> right = subSeq2(p, up.substring(1));

        left.addAll(right);

//        list.addAll(left);

        return left;
    }

    static void subSeq1(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        subSeq1(p + ch, up.substring(1));
        subSeq1(p, up.substring(1));
    }

    static void skip3(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        if (up.startsWith("apple")) {
            skip3(p, up.substring(5));
        } else {
            skip3(p + up.charAt(0), up.substring(1));
        }
    }
    static String skip4(String p, String up) {
        if (up.isEmpty()) {
//            System.out.println(p);
            return "";
        }

        if (up.startsWith("apple")) {
            return skip4(p, up.substring(5));
        } else {
            return up.charAt(0) + skip4(p + up.charAt(0), up.substring(1));
        }
    }

    static void skip1(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        if (up.charAt(0) == 'a') {
            skip1(p, up.substring(1));
        } else {
            skip1(p + up.charAt(0), up.substring(1));
        }
    }

    static String skip2(String p, String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(p, up.substring(1));
        } else {
            return ch + skip2(p + ch, up.substring(1));
        }
    }
}
