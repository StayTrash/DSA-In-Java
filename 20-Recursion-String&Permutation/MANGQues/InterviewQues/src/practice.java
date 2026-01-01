import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
        pad1("", "12");
        System.out.println();
        System.out.println(pad2("", "12"));
        System.out.println(padCount("", "12"));
    }

    static void pad1(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char)('a' + i);
            pad1(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> pad2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            list.addAll(pad2(p + ch, up.substring(1)));
        }

        return list;
    }

    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count = 0;

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char)('a' + i);

            count = count + padCount(p + ch, up.substring(1));
        }

        return count;
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(p + i, target - i);
        }
    }
}
