package DiffExamples.ClassesAndObjects.inheritance;

public class Main {
    public static void main(String[] args) {
        String[] languages = {"java", "C++", "C", "Python"};
        Programmer programmer = new Programmer("zeyad ayman",
                "java developer",
                24,
                "Cairo",
                languages);
        programmer.writeSomeCode();
        System.out.println(programmer);
    }
}
