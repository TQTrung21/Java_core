package Java_core;

import java.util.Scanner;

public class Lab3_Bai2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(a * i);
		}
		scan.close();
	}
}
