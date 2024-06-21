package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.HashMap;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        String i = "1, 1, 1, 1, 3, 4, 5, 6, 7, 7, 7, 8, 8, 8, 8, 8, 8";
        String[] input = i.split(", ");
        HashMap<String, Integer> occurrencesMap = numOfOccurrence(input);
        System.out.println(occurrencesMap);
        System.out.println("most occurred element is " + mostOccurred(occurrencesMap));

    }

    public static HashMap<String, Integer> numOfOccurrence(String[] input){
        HashMap<String, Integer> occurrences = new HashMap<>();
        int count = 0;
        for(int i = 0; i < input.length; i++){
            if(occurrences.containsKey(input[i])){
                count++;
                occurrences.put(input[i], count);
            }
            else {
                count = 1;
                occurrences.put(input[i], count);
            }
        }
        return occurrences;
    }
    public static String mostOccurred(HashMap<String, Integer> numbersMap) {
        int maxValue = 0;
        String maxKey = "";
        for (String key : numbersMap.keySet()) {
            if(numbersMap.get(key) > maxValue) {
                maxValue = numbersMap.get(key);
                maxKey = key;
            }
            else
                continue;
        }
        return maxKey;
    }
}
