package by.academy.lesson2.classwork;

public class CatPrinter extends Printer<Cat>{
    
    @Override
    public String argToString(Cat cat) {
        return cat.nickname + ":" + cat.age;
    }
    
}
