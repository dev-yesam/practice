package java_learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Java251112 {

    // enum 자료형
    // 서로 연관된 상수 집합 정의할 때 사용
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }


    public static void main(String[] args) {
        // enum 사용
        System.out.println(CoffeeType.AMERICANO);
        for(CoffeeType type: CoffeeType.values()){
            System.out.println(type);
        }

        // Array
        int[] odds = { 1, 3, 5, 7, 9 };
        String[] weeks1 = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun" };

        // Set length of Array
        String[] weeks2 = new String[7];
        weeks2[0] = "Mon";

        System.out.println(weeks2[0]);
        System.out.println(weeks2);

        for (int i = 0; i < weeks1.length; i++) {
            System.out.println(weeks1[i]);
        }

        // ArrayIndexOutOfBoundsException
        System.out.println(weeks2[6]);
        // System.out.println(weeks2[7]);

        // List - ArrayList
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");
        System.out.println(pitches.get(1));

        System.out.println(pitches.size());
        System.out.println(pitches.contains("141"));
        System.out.println(pitches.indexOf("129"));
        System.out.println(pitches.remove(0));
        System.out.println(pitches.indexOf("129"));

        // List - Generics
        // 제네릭스는 타입 매개변수를 정해, 형 변환(casting) 오류를 줄인다.
        // 제네릭스를 사용하지 않으면 기본적으로 Object 자료형으로 인식됨
        ArrayList<String> pitches2 = new ArrayList<>();
        pitches2.add("130");
        pitches2.add("129");
        String one = pitches2.get(0); // 형변환 없음

        String[] data = { "138", "152", "161" };
        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList(data));

        System.out.println(pitches3);
        ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList("166", "162", "133"));
        System.out.println(pitches4);

        // String.join
        String result = String.join(", ", pitches4);
        System.out.println(result);
        String[] pitches5 = new String[] { "119", "192", "158", "199" };
        String result2 = String.join(", ", pitches5);
        System.out.println(result2);

        // List Sort
        ArrayList<String> pitches6 = new ArrayList<>(Arrays.asList(pitches5));
        pitches6.sort(Comparator.naturalOrder());
        System.out.println(pitches6);
        pitches6.sort(Comparator.reverseOrder());
        System.out.println(pitches6);

        // Map 자료형
        // Key 와 Value 값 쌍을 갖는 자료형
        // 크게 3종류 HashMap, LikedHasMap, TreeMap이 있다

        // HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));
        System.out.println(map.get("people2"));
        System.out.println(map.getOrDefault("people3", "기본값"));

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Animal", "동물");
        map2.put("Cat", "고양이");
        System.out.println(map2.containsKey("People"));
        System.out.println(map2.containsKey("Cat"));
        System.out.println(map2.remove("Animal"));
        System.out.println(map2.size());
        System.out.println(map.keySet());
        System.out.println(map.values());

        // 집합(Set) 자료형
        // HashSet, TreeSet, LinkedHashSet 등이 있음
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);
        HashSet<Integer> subtract = new HashSet<>(s1);
        subtract.removeAll(s2);
        System.out.println(subtract);

        HashSet<String> set2 = new HashSet<>();
        set2.add("Hello");
        set2.add("world!");
        System.out.println(set2);
        set2.addAll(Arrays.asList("Welcome", "to", "new", "world"));
        System.out.println(set2);
        set2.remove("world!");
        System.out.println(set2);

    }
}