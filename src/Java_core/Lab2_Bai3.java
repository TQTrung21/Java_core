package Java_core;

import java.util.Scanner;

public class Lab2_Bai3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int money;
		if (n <= 100) {
			money = n * 1000;
		} else {
			money = 100 * 1000 + (n - 100) * 1500;
		}
		System.out.println("Tiền điện cần đóng là: " + money);
		scan.close();
	}
}
