package by.academy.lesson2.classwork;

public class Summator<T extends Number> {
    
    public int sumIntValue(T t1, T t2) {
        return t1.intValue() + t2.intValue();
    }
    
}