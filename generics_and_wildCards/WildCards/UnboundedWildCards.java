package DiffExamples.ClassesAndObjects.generics_and_wildCards.WildCards;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UnboundedWildCards {
    public static void main(String[] args) {
        List<Object> list1 = Arrays.asList("113", 2, 5.6, new Date());
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        List<String> list3 = Arrays.asList("1" , "2", "3");
        print(list1);
        print(list2);
        print(list3);
    }
    static void print (List<?> list) {
        list.forEach(System.out::println);
    }
}
