package OOP;

import java.util.Scanner;

public class Sum_Int {
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		Sum_Int test = new Sum_Int();
		int c = test.sum(a, b);
		System.out.println("Sum = " + c);
		scan.close();
	}
}
