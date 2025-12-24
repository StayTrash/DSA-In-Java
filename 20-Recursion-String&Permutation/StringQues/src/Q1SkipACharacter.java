public class Q1SkipACharacter {
    public static void main(String[] args) {
        skip("", "bcabcbiihaouhaaiwehaaop");
        System.out.println(skip2("bana"));
    }
    static void skip(String p, String up) {   // p--> processed , up--> unprocessed
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }


    // Important Concept
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
}