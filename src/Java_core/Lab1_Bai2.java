package Java_core;

import java.util.Scanner;

public class Lab1_Bai2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Chiều dài: ");
		int a = scan.nextInt();
		System.out.print("Chiều rộng: ");
		int b = scan.nextInt();
		int cv = (a + b) * 2;
		int dt = a * b;
		int canhMin = Math.min(a, b);
		System.out.println("Chu vi = " + cv);
		System.out.println("Diện tích = " + dt);
		System.out.println("Cạnh nhỏ nhất = " + canhMin);
		scan.close();
	}
}
