package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("alex", "martin", 40), new Diamond("pearl"));
        //we have to override hashCode() in Person Class in order to not give null
        System.out.println(map.get(new Person("alex", "martin", 40)));
        System.out.println(new Person("alex", "martin", 40).hashCode());
        map();
    }

    private static void map() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("mark", "samuel", 34));
        map.put(2, new Person("mariam", "adam", 25));
        map.put(3, new Person("alex", "adams", 18));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);
        System.out.println(map.get(3));
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }
    record Diamond(String name){}
}
