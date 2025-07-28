import java.util.ArrayList;

public class Q4PrintASCII {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch + 0);
        System.out.println((char) (ch + 1));

        subSeqAscii("", "abc");

        System.out.println();
        System.out.println(subSeqAscii2("", "abc"));
    }

    static void subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

//        subSeq(p, up.substring(1));   // if put here , will print in opposite
        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
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

        first.addAll(second);
        first.addAll(third);

        return first;

    }
}
