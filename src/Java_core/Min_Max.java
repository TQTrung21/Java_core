package Java_core;

import java.util.Scanner;

public class Min_Max {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = Math.max(a, b);
		int d = Math.min(a, b);
		System.out.println("Max = " + c);
		System.out.println("Min = " + d);
		scan.close();
	}
}
