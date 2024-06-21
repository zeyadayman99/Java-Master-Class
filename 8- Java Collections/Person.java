package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.Objects;

public class Person {
    private String f_name;
    private String s_name;
    private int age;

    public Person(String f_name, String s_name, int age) {
        this.f_name = f_name;
        this.s_name = s_name;
        this.age = age;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first name='" + f_name + '\'' +
                ", second name='" + s_name + '\'' +
                ", age=" + age +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(f_name, person.f_name) && Objects.equals(s_name, person.s_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(f_name, s_name, age);
    }
}
