package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Balls ball1 = new Balls("red");
        Balls ball2 = new Balls("blue");
        Balls ball3 = new Balls("green");

        Set<Balls> ballsSet = new HashSet<>();
        ballsSet.add(ball1);
        ballsSet.add(ball2);
        ballsSet.add(ball3);
        System.out.println(ballsSet.size());
        Iterator<Balls> ballsIterator = ballsSet.iterator();
        while (ballsIterator.hasNext())
            System.out.println(ballsIterator.next());
        ballsSet.remove(ball2);
        System.out.println(ballsSet.size());
    }
    static class Balls {
        private String color;

        public Balls(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Balls balls = (Balls) o;
            return Objects.equals(color, balls.color);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(color);
        }

        @Override
        public String toString() {
            return "Balls{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
