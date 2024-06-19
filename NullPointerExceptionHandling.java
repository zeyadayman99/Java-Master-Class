package DiffExamples.ClassesAndObjects;

import java.util.Objects;
import java.util.Optional;

public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        String name = null;

        //1- use if statement to handle it
        if(name == null)
            System.out.println("name can't be null");
        else
            System.out.println(name.toUpperCase());

        //2- use try-catch block
        try {
            System.out.println(name.toUpperCase());
        } catch(NullPointerException e) {
            System.out.println("name can't be null");
        }

        //3- use a method to handle it
        //printName(name);

        //4- use Optional class to handle it
        //Optional has a better API to deal with NullPointerException
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(optionalName.isEmpty());
        optionalName.ifPresentOrElse(
                n -> System.out.println(n.toUpperCase()),
                () -> System.out.println("name is empty")
        );
        var result = optionalName.orElse("HELLO WORLD");
        System.out.println(result);
    }

    public static void printName(String input) {
        Objects.requireNonNull(input, "name can't be null");
        System.out.println(input.toUpperCase());
    }
}
