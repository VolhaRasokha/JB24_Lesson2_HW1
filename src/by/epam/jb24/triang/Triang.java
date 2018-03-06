package by.epam.jb24.triang;

public class Triang {
	public static void main(String[] args) {
		double a, b;
		double c;

		double p;
		double s;

		a = 10;
		b = 20;

		c = Math.sqrt(a * a + b * b);

		p = a + b + c;
		s = 0.5 * a * b;

		System.out.println("Периметр = " + p + ", Площадь = " + s);
		System.out.printf("Периметр = %.2f, площадь = %.2f", p, s);
	}

}
