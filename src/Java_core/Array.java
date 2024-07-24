package Java_core;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] number = new int[n];
		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("Arrays: " + Arrays.toString(number));
		scan.close();
	}
}
