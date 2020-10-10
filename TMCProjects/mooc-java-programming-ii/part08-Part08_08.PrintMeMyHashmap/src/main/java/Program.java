import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("f.e", "for example");
        hashMap.put("etc.", "and so on");
        hashMap.put("i.e.", "more precisely");

        printKeys(hashMap);
    }

    public static void printKeys(HashMap<String, String> hashMap) {
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String key : hashMap.keySet()) {
            if (!key.contains(text)) {
                continue;
            }
            System.out.println(key);
            System.out.println("test");
        }
    }

}
