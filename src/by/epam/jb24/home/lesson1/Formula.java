package by.epam.jb24.home.lesson1;

public class Formula {
	public static void main(String[] args) {
		double x = 0, y = 0, z;

		x = 4.5;
		y = 6.8;

		double temp;
		temp = Math.cos(x) - x / 3;
		if (temp != 0) {
			z = x * Math.log(x);
		} else {
			System.out.println("Знаменатель равен нулю.");
			z = Double.NaN;
		}
		System.out.println("z = " + z);
	}

}
