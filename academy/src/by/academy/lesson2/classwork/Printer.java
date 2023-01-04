package by.academy.lesson2.classwork;

import org.jetbrains.annotations.NotNull;

public class Printer<T> {
    
    public String argToString(T t) {
        return t.toString();
    }
    
    public void print(@NotNull T t) {
        String str = argToString(t);
        System.out.println(str);
    }
    
    public void print(ToString<T> toString, T t) {
        System.out.println(toString.argToString(t));
    }
    
}
