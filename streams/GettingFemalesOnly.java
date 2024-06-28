package DiffExamples.ClassesAndObjects.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GettingFemalesOnly {
    public static void main(String[] args) {
        //imperativeApproach();
        declarativeApproach();
    }
    public static void imperativeApproach() {
        List<People> people = MockData.getData();

        List<People> female = new ArrayList<>();

        people.forEach(person -> {
            var isGender = person.getGender().equals("FEMALE");
            if (isGender) {
                female.add(person);
            }
        });

        female.forEach(System.out::println);
    }
    public static void declarativeApproach() {
        List<People> people = MockData.getData();
        List<People> femalesList = people.stream()
                .filter(p -> p.getGender().equals("FEMALE"))
                .collect(Collectors.toList());
        for (People female : femalesList)
            System.out.println(female);
    }
}
