package Java_core;

import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
		int score;
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		if (score > 5) {
			System.out.println("Đủ điểm qua môn");
		} else {
			System.out.println("Trượt môn");
		}
		scan.close();
	}
}
