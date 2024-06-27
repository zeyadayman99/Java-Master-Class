package DiffExamples.ClassesAndObjects.generics_and_wildCards.WildCards;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWIldCards {
    public static void main(String[] args) {
        //List<Double> list1 = Arrays.asList(1.4, 2.5, 4.8, 9.0, 1.7);
        //this won't work as Double is not a super class to Integer

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        //Number is super class of Integer
        List<Number> list3 = Arrays.asList(1.5, 2, 3, 4.12, 5);

        //print(list1);
        print(list2);
        print(list3);
    }

    //now this takes Number and anything that's super class to Number
    //(either the class or it's super class)
    //so this is allowed to use Integer, or it's Super class
    static void print(List<? super Integer> list) {
        for (Object n : list) {
            System.out.println(n);
        }
    }
}
