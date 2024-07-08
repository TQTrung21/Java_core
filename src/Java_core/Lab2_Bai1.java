package Java_core;

import java.util.Scanner;

public class Lab2_Bai1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b;
		double x;
		a = scan.nextDouble();
		b = scan.nextDouble2();
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			x = -b / a;
			System.out.println("Nghiem cua phuong trinh la: " + x);
		}
		scan.close();
	}
}
