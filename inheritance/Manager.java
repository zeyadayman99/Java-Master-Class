package DiffExamples.ClassesAndObjects.inheritance;

public class Manager extends Employee{
    private int teamSize;
    public Manager(String name,
                   String experience,
                   int age,
                   String address) {
        super(name, experience, age, address);
    }

    public Manager(String name,
                   String experience,
                   int age,
                   String address,
                   int teamSize) {
        super(name, experience, age, address);
        this.teamSize = teamSize;
    }

    public void writingReports(){
        System.out.println("manager writing team reports");
    }
}
