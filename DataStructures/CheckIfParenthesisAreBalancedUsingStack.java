package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.Stack;

public class CheckIfParenthesisAreBalancedUsingStack {
    public static void main(String[] args) {
        String brackets = "[{{[(){}]}}[]{}{{(())}}]";
        System.out.println(isBalanced(brackets));
    }

    public static boolean isBalanced(String brackets) {
        Stack<Character> bracketsStack = new Stack<>();
        for (char bracket : brackets.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                bracketsStack.push(bracket);
            } else {
                if (bracketsStack.isEmpty())
                    return false;
                char top = bracketsStack.pop();
                if (
                        (bracket == ')' && top != '(') ||
                        (bracket == ']' && top != '[') ||
                        (bracket == '}' && top != '{')
                )
                    return false;
            }
        }
        return bracketsStack.isEmpty();
    }
}
