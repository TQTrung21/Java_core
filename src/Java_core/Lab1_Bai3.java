package Java_core;

import java.util.Scanner;

public class Lab1_Bai3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Cạnh hình lập phương: ");
		int a = scan.nextInt();
		double v = Math.pow(a, 3);
		System.out.printf("Thể tích của hình lập phương: %.0f", v);
		scan.close();
	}
}
