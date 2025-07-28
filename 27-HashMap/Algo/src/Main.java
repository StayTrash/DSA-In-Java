import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        String name = "Kunal";
//        Integer a = 892324;
//
//        int code = name.hashCode();
//        int code2 = a.hashCode();
//
//        System.out.println(code);
//        System.out.println(code2);

        HashMap<String, Integer> map = new HashMap<>();
//        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Kunal", 89);
        map.put("Karan", 92);
        map.put("Rahul", 99);

        System.out.println(map.get("Karan"));
        System.out.println(map.getOrDefault("Aman", 67));
        System.out.println(map.containsKey("Karan"));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(23);
        set.add(89);
        set.add(56);
        set.add(12);
        set.add(45);
        System.out.println(set);  // no duplicate values



        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal", 89);
        map.put("Karan", 99);
        map.put("Rahul", 94);
        System.out.println(map.entrySet());
        map.put("Kunal", 50);

        System.out.println(map.get("Karan"));
        System.out.println(map.getOrDefault("Apoorv", 78));
        System.out.println(map.containsKey("Karan"));
        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

        HashSet<Integer> set1 = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);



    }
}