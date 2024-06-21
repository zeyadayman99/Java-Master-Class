package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(colors);
        System.out.println(colors.contains("red"));
        System.out.println(colors.contains("brown"));
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + ", ");
        }
        System.out.println();
        for (String color : colors)
            System.out.print(color + ", ");
        System.out.println();
        colors.forEach(System.out::print);

        List<String> namesUnModifiable = List.of(
                "ahmed",
                "mohamed"
        );
        //this will give an error because the list is immutable
        namesUnModifiable.add("maged");
    }
}
