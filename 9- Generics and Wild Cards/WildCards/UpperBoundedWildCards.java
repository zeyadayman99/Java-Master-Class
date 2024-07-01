package DiffExamples.ClassesAndObjects.generics_and_wildCards.WildCards;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCards {
    public static void main(String[] args) {
        List<Double> list1 = Arrays.asList(1.4, 2.5, 4.8, 9.0, 1.7);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Number> list3 = Arrays.asList(1.5, 2, 3, 4.12, 5);
        print(list1);
        print(list2);
        print(list3);
    }

    //now this can only take anything that is a Number
    //now this takes Number and anything that extends Number
    //(either the class or it's sub-classes)
    static void print(List<? extends Number> list) {
        list.forEach(e -> System.out.println(e));
    }
}
