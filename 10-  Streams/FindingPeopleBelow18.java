package DiffExamples.ClassesAndObjects.streams;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindingPeopleBelow18 {

    @Test
    public void imperativeApproach() throws IOException {
        List<People> peopleList = MockData.getData();
        List<People> peopleListBelow_18 = new ArrayList<>();
        for (People people : peopleList) {
            if(people.getAge() <= 18)
                peopleListBelow_18.add(people);
        }
        int count = 10;
        for(People people : peopleListBelow_18) {
            if(count > 0) {
                System.out.println(people);
                --count;
            }
        }
    }
    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        //we start with a concrete class which in our case is the People Class
        List<People> peopleList = MockData.getData();
        //peopleList.stream() ----> from this point onward we can have as much
        //intermediate operators and then finally collect with a terminal operator
        List<People> peopleUnder_18_List = peopleList.stream().filter(p -> p.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());
        for (People people : peopleUnder_18_List) {
            System.out.println(people);
        }
    }
}
