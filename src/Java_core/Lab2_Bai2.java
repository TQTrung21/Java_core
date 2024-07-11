package Java_core;

import java.util.Scanner;

public class Lab2_Bai2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, x, x1, x2;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if (a != 0) {
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("Nghiệm kép x = " + x);
			} else if (delta > 0) {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
		scan.close();
	}
}
