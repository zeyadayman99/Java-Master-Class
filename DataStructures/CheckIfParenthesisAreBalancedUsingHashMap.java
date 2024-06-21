package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class CheckIfParenthesisAreBalancedUsingHashMap {
    public static final Map<String, String> bracketPairs = new HashMap<>();
    static {
        bracketPairs.put("(", ")");
        bracketPairs.put(")", "(");
        bracketPairs.put("{", "}");
        bracketPairs.put("}", "{");
        bracketPairs.put("[", "]");
        bracketPairs.put("]", "[");
    }
    public static void main(String[] args) {
        String brackets = "[{{[(){}]}}[]{}{{(())}}]";
        System.out.println(isBalanced(brackets));
    }

    public static boolean isBalanced(String brackets) {
        String[] bracketsArray = brackets.split("");
        Map<String, Integer> parenthesisMap = new HashMap<>();
        int count = 0;
        for (String bracket : bracketsArray) {
            if(parenthesisMap.containsKey(bracket)) {
                int newValue = parenthesisMap.get(bracket) + 1;
                parenthesisMap.put(bracket, newValue);
            }
            else {
                count = 1;
                parenthesisMap.put(bracket, count);
            }
        }
        System.out.println(parenthesisMap);
        for (String key : parenthesisMap.keySet()) {
            String oppositeParenthesis = bracketPairs.get(key);
            if(parenthesisMap.get(key) != parenthesisMap.get(oppositeParenthesis)) {
                return false;
            }
            continue;
        }
        return true;
    }
}
