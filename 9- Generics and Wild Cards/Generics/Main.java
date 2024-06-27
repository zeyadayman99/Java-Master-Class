package DiffExamples.ClassesAndObjects.generics_and_wildCards.Generics;

public class Main {
    public static void main(String[] args) {
        BoxGenericClass<Phone> boxGenericClass = new BoxGenericClass<>();
        boxGenericClass.setT(new Phone("iphone"));
        System.out.println(boxGenericClass.getT());

        BoxGenericClass<Letter> boxGenericClass2 = new BoxGenericClass<>();
        boxGenericClass2.setT(new Letter("mother"));
        System.out.println(boxGenericClass2.getT());

        String[] names = {"ahmed", "ali"};
        Character[] characters = {'A', 'B', 'C'};
        Integer[] numbers = {1, 2, 3, 4, 5};
        print(names);
        print(characters);
        print(numbers);
    }

    public static <T> void print(T[] array) {
        for (T t : array) {
            System.out.println(t.getClass() + " - " + t);
        }
    }
}
