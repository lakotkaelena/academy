package by.academy.lesson2.classwork;

import java.math.BigDecimal;

public class Application {
    
    public static void main(String[] args) {
        Printer<String> p1 = new Printer<>();
        System.out.println(p1.getClass());
        p1.print("we4rgf");
        
        try {
            p1.print(null);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        Printer<Double> p2 = new Printer<>();
        System.out.println(p2.getClass());
        p2.print(Double.valueOf(44));
        
        Printer<Cat> p3 = new CatPrinter();
        System.out.println(p3.getClass());
        Cat c1 = new Cat("Васька");
        
        p3.print(c1);
        p3.print(c1);
        p3.print(c1);
        c1 = new Cat();
        p3.print(c1);
        
        Printer<Cat> p4 = new Printer<>() {
            @Override
            public String argToString(Cat cat) {
                return cat.nickname;
            }
        };
        System.out.println(p4.getClass());
        p4.print(c1);
        
        Printer<Cat> p5 = new Printer<>() {
            @Override
            public String argToString(Cat cat) {
                return String.valueOf(cat.age);
            }
        };
        System.out.println(p5.getClass());
        p5.print(c1);
        
        Printer<Cat> p6 = new CatAgePrinter();
        System.out.println(p6.getClass());
        p6.print(c1);
        
        Printer<Cat> p7 = new Printer<>();
        
        ToString<Cat> toString = cat -> "nik=" + cat.nickname;
        
        System.out.println(toString.getClass());
        p7.print(toString, c1);
        
        p7.print((sdrgsedr) -> sdrgsedr.age + "," + sdrgsedr.nickname, c1);
        
    }
    
    static class CatAgePrinter extends Printer<Cat> {
        
        @Override
        public String argToString(Cat cat) {
            return String.valueOf(cat.age);
        }
        
    }
    
}
