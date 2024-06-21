package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        Stack<Person> personStack = new Stack<>();
        personStack.push(new Person("zack", "adam", 32));
        personStack.push(new Person("mariam", "zain", 18));
        personStack.push(new Person("david", "zackry", 22));
        personStack.push(new Person("mark", "walberg", 45));
        System.out.println(personStack.size());
        System.out.println(personStack.peek().toString());
        System.out.println(personStack.pop().toString());
        System.out.println(personStack.empty());
    }
}
