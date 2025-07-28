import java.util.ArrayList;

public class Q3SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        subSeq("", s);   // it will also include an empty subseq

        System.out.println();

        System.out.println(subSeq2("", "abc"));  // it will also include an empty subseq
    }
    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

//        subSeq(p, up.substring(1));   // if put here , will print in opposite
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeq2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left =  subSeq2(p + ch, up.substring(1));
        ArrayList<String> right = subSeq2(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}
