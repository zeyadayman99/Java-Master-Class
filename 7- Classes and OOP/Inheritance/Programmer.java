package DiffExamples.ClassesAndObjects.inheritance;

import java.util.Arrays;

public class Programmer extends Employee{
    private String[] prog_languages;
    public Programmer(String name,
                      String experience,
                      int age,
                      String address) {
        super(name, experience, age, address);
    }

    public Programmer(String name,
                      String experience,
                      int age,
                      String address,
                      String[] prog_languages) {
        super(name, experience, age, address);
        this.prog_languages = prog_languages;
    }

    public void writeSomeCode(){
        System.out.println(this.name + " writing some code");
    }

    @Override
    public String toString() {
        return
                super.toString() + " " + "Programmer{" +
                "prog_languages=" + Arrays.toString(prog_languages) +
                '}';
    }
}
