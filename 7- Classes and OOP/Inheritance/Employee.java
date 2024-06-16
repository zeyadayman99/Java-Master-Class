package DiffExamples.ClassesAndObjects.inheritance;

import java.util.Objects;

public class Employee {
    protected String name;
    private String experience;
    private int age;
    private String address;

    //this is called all args constructor
    public Employee(String name,
                    String experience,
                    int age,
                    String address) {
        this.name = name;
        this.experience = experience;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", experience='" + experience + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(experience, employee.experience) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience, age, address);
    }
}
