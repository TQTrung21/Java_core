package Java_core;

import java.util.Scanner;

public class Input_Output {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Your name is: ");
		String name = scan.nextLine();
		System.out.println("Your age is: ");
		int age = scan.nextInt();
		System.out.println("My name is " + name + ", age = " + age);
		scan.close();
	}
}
