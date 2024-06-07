package DiffExamples.ClassesAndObjects;

import java.util.Objects;

public class Cat {
    private String catName;
    private int catAge;

    Cat(){}
    Cat(String catName, int catAge){
        this.catName = catName;
        this.catAge = catAge;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    @Override
    public String toString(){
        return getCatName() + " " + getCatAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return catAge == cat.catAge && Objects.equals(catName, cat.catName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catName, catAge);
    }
}
