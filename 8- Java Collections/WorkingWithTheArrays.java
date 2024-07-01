package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.Arrays;

public class WorkingWithTheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "green";
        colors[3] = "yellow";
        System.out.println(Arrays.toString(colors));
        for (int i = 0; i < colors.length; i++)
            System.out.print(colors[i] + ", ");

        System.out.println();

        for(String color : colors)
            System.out.print(color + ", ");

        System.out.println();

        //this is method reference using streams
        Arrays.stream(colors).forEach(System.out::println);
    }
}
