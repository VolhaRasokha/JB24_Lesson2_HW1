package by.epam.jb24.home.lesson2_task2;

import java.util.Scanner;

public class Formula {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, rez = 0, temp = 0, rez2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		a = sc.nextDouble();
		System.out.println("Enter b");
		b = sc.nextDouble();
		System.out.println("Enter c");
		c = sc.nextDouble();

		if (a == 0) {
			System.out.println("Знаменатель равен нулю.");
			rez = Double.NaN;
		} else
			temp = (b * b + 4 * a * c);
		if (temp < 0) {
			System.out.println("Корень не может быть равен нулю.");
			rez = Double.NaN;
		} else
			rez = (b + Math.sqrt(temp)) / (2 * a) - a * a * a * c + b;
		System.out.println("Result = " + rez);
	}

}
