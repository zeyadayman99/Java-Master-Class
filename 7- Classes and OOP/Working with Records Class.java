package DiffExamples.ClassesAndObjects;

public class WorkingWithRecords {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(3,4);
        System.out.println(point1.x());
        System.out.println(point1.y());

        System.out.println(point1);
        System.out.println(point2);

        System.out.println(point1.equals(point2));

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }

    public record Point(int x, int y){}
}
