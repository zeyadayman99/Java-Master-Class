package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        LinkedList<Person> personLinkedList = new LinkedList<>();
        personLinkedList.add(new Person("alex", "martin", 34));
        personLinkedList.add(new Person("john", "mayer", 27));
        ListIterator<Person> listIterator = personLinkedList.listIterator();
        while (listIterator.hasNext())
            System.out.println(listIterator.next());
        workingWithQueue();
    }

    private static void workingWithQueue() {
        Queue<Person> personQueue = new LinkedList<>();
        personQueue.add(new Person("zack", "adam", 32));
        personQueue.add(new Person("mariam", "zain", 18));
        personQueue.add(new Person("david", "zackry", 22));
        personQueue.add(new Person("mark", "walberg", 45));
        System.out.println(personQueue.peek());
        System.out.println(personQueue.size());
        System.out.println(personQueue.poll());
        System.out.println(personQueue.size());
        System.out.println(personQueue.remove());
        System.out.println(personQueue.size());
    }
}
;
