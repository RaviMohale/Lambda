package com.ravi;

public class Car1 {

	void drive() {
		System.out.println("he i am driving,,");
	}

	public static void main(String[] args) {

		Engine1 eng = (int x) -> {
			System.out.println(2 * x);
			System.out.println("hello i am in lambda");

		};
		eng.start(10);
		eng.start1();

		Car1 ca = new Car1();

		ca.drive();
	}

}
