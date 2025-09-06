import java.util.*;

 class HashMapDemo {

    public static void main(String args[]) {
        
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Durgesh");
        map.put(2, "Nitesh");
        map.put(3, "amit");
        map.put(4, "Nand");

        String student = map.get(4);
        System.out.println(student);

        for (int i : map.keySet()) {
            System.out.print(" ," + map.get(i));
        }
        
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        
        for (Map.Entry<Integer, String> entrie : entries) {
            entrie.setValue(entrie.getValue().toUpperCase());
        }

        System.out.println(map);


    }
}
