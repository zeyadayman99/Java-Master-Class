package DiffExamples.ClassesAndObjects.streams;


import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {
    @Test
    void streams() {
        List<String> names = List.of("ahmed", "mohamed", "mariam");
        Stream<String> namesStream = names.stream();
        List<Object> collect = namesStream.limit(2)
                .map(null)
                .dropWhile(null)
                .sorted(null)
                .collect(Collectors.toUnmodifiableList());
        //limit(), map(), dropWhile(), sorted() are the intermediate operators
        //collect() is the Terminal operator
    }
}
