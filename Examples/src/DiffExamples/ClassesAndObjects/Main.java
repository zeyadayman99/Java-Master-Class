package DiffExamples.ClassesAndObjects;

public class Main {
    public static int count = 0;
    public static void main(String[] args) {
        StaticBlock block = new StaticBlock();

        Cat cat = new Cat("joule", 2);
        System.out.println(cat);

        Cat cat2 = new Cat("joule", 2);
        System.out.println(cat2);

        System.out.println(cat == cat2);
        System.out.println(cat.equals(cat2));

        Cat[] cats = {cat, cat2};

        Person person = new Person("zeyad", "ayman", Gender.Male, cats);
        System.out.println(person);
    }
}
