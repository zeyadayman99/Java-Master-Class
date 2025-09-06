package com.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("zeyad");
        System.out.println(name);
        System.out.println(name.get());
        System.out.println(name.isPresent());
        System.out.println(name.isEmpty());

        String anotherName = name
                .orElseThrow(IllegalStateException::new);

        String newName = name
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    // extra computations to retrieve the value
                    return "gamal";
                });

        System.out.println(newName);

        Optional<String> secondName = Optional.ofNullable("Ayman");

        secondName = secondName.map(
                word -> word.concat(newName)
        );
        System.out.println(secondName.get());
        //////////////////////////////////////////////////////////////////////////

        Person person = new Person("zeyad ayman", null);

//        String personName = person.getName();
//        Optional<String> personEmail = Optional.ofNullable(person.getEmail());

        System.out.println(person.getName());
        System.out.println(person.getEmail()
                .map(String::toUpperCase)
                .orElse("no email entered"));

        if (person.getEmail().isPresent())
            System.out.println("email exists");
        else
            System.out.println("no valid email");
    }
}

class Person {
    private final String name;
    private final String email;

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}