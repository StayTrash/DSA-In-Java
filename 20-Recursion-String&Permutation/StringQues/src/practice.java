import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
//        skip1("", "banana");
//        System.out.println(skip2("banana"));;

//        System.out.println(skipStr1("adfadapplewerqw"));
//        System.out.println(skipStr2("adfadaappleadfappadfawer"));

//        subSeq("", "abc");
//        System.out.println(subSeq2("", "abc"));

//        subSeqAscii1("", "abc");
//        System.out.println();
//        System.out.println(subSeqAscii2("", "abc"));

//        permutations1("", "abc");
//        System.out.println();
//        System.out.println(permutations2("", "abc"));
        int count = permutationsCount("", "abcd");
        System.out.println(count);
//        System.out.println(permutationsCount("", "abcd"));
    }

    static void skip1(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip1(p, up.substring(1));
        } else {
            skip1(p + ch, up.substring(1));
        }
    }

    static String skip2(String up) {
        if (up.isEmpty()) return "";

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }

    static String skipStr1(String up) {
        if (up.isEmpty()) return "";

        char ans = up.charAt(0);

        if (up.startsWith("apple")) {
            return skipStr1(up.substring(5));
        } else {
            return ans + skipStr1(up.substring(1));
        }
    }

    static String skipStr2(String up) {
        if (up.isEmpty()) return "";

        char ans = up.charAt(0);

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipStr2(up.substring(5));
        } else {
            return ans + skipStr2(up.substring(1));
        }
    }

    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        subSeq(p + up.charAt(0), up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeq2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> left = subSeq2(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = subSeq2(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    static void subSeqAscii1(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p +  " ");
            return;
        }

        char ch = up.charAt(0);

        subSeqAscii1(p + ch, up.substring(1));
        subSeqAscii1(p, up.substring(1));
        subSeqAscii1(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subSeqAscii2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subSeqAscii2(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAscii2(p, up.substring(1));
        ArrayList<String> third = subSeqAscii2(p + (ch + 0), up.substring(1));

        second.addAll(third);
        first.addAll(second);

        return first;
    }

    static void permutations1(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutations1(first + ch + second, up.substring(1));
        }
    }

    static ArrayList<String> permutations2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutations2(first + ch + second, up.substring(1)));
        }

        return ans;
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
