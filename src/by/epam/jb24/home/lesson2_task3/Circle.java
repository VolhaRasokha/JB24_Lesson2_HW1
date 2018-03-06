package by.epam.jb24.home.lesson2_task3;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		double r = 0; // radius
		double d = 0; // length of circle
		double s = 0; // square of circle

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the circle");

		while ((r = sc.nextDouble()) < 0) {
			System.out.println("Radius should be > 0");
			System.out.println("Enter a valid value for the radius of the circle");
		}

		d = 2 * Math.PI * r;
		s = Math.PI * r * r;
		System.out.println("Length of circle = " + d);
		System.out.println("Square of circle = " + s);

	}

}
