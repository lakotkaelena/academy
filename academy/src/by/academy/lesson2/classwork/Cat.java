package by.academy.lesson2.classwork;

public class Cat {
	int age = 8;
	String nickname = "Tom";

	public void grow() {
		age++;
	}

	public void sleep() {
		System.out.println("Кот спит");
	}

	public void eat() {
		System.out.println("Кот ест");
	}

	public void walk() {
		System.out.println("Кот гуляет");
	}

	public Cat() {
		System.out.println("test");
	}

	public Cat(String nickname) {
		this.nickname = nickname;
	}
}
