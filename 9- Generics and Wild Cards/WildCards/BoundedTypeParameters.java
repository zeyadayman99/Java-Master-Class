package DiffExamples.ClassesAndObjects.generics_and_wildCards.WildCards;

public class BoundedTypeParameters {
    public static void main(String[] args) {
        Integer[] numbers1 = {1, 2, 3, 4, 5};
        Double[] numbers2 = {1.2, 2.5, 3.1, 4.0, 5.7};
        System.out.println(countGreaterThan(numbers1, 4));
        System.out.println(countGreaterThan(numbers2, 2.1));
    }


    //whatever parameter that we pass here it has to extend the Comparable interface
    public static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T t : numbers)
            //if t.compareTo(number) ---> return 1
            //else ------> returns 0
            if (t.compareTo(number) > 0)
                count++;
        return count;
    }
}
