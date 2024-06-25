package Java_core;

import java.util.Scanner;

public class Lab1_Bai1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Tên sinh viên: ");
		String a = scan.nextLine();
		System.out.print("Số điểm: ");
		float b = scan.nextFloat();
		System.out.printf("%s có điểm = %.2f", a, b);
		scan.close();
	}
}
