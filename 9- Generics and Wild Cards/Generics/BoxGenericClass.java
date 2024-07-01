package DiffExamples.ClassesAndObjects.generics_and_wildCards.Generics;

public class BoxGenericClass<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
