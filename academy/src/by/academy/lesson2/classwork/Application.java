package by.academy.lesson2.classwork;

public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.grow();
		cat1.grow();
		cat1.grow();

		Cat cat2 = new Cat("Tom");
		cat2.eat();
		cat2.sleep();
		cat2.walk();
		Cat cat3 = new Cat();
	}

}
