package Java_core;

import java.util.Scanner;

public class Lab3_Bai1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isPrime = true;
		int a = scan.nextInt();
		if (a < 2) {
			System.out.println("a không phải là số nguyên tố");
			System.exit(0);
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("a là số nguyên tố");
		} else {

			System.out.println("a không phải là số nguyên tố");
		}
		scan.close();
	}
}
