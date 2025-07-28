public class practice {
    public static void main(String[] args) {
        skip("", "bahiwasahu");
        System.out.println();
        System.out.println(skip2("bahiwasahu"));

        System.out.println(skip3("ba gljl apple lnkfdln app le hjsdfjhapplesdf apple fef"));
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip2(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }

    static String skip3(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skip3(up.substring(3));
        } else {
            return up.charAt(0) + skip3(up.substring(1));
        }
    }
}
