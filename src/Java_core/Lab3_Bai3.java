package Java_core;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Bai3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] mang = new int[n];
		for (int i = 0; i < mang.length; i++) {
			mang[i] = scan.nextInt();
		}
		Arrays.sort(mang);
		System.out.print("Mảng đã sắp xếp: ");
		System.out.println(Arrays.toString(mang));
		int max = mang[0];
		int min = mang[0];
		for (int i = 0; i < mang.length; i++) {
			max = Math.max(max, mang[i]);
			min = Math.min(min, mang[i]);
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		scan.close();
	}
}
