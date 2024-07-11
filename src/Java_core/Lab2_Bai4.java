package Java_core;

import java.util.Scanner;

public class Lab2_Bai4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		int tn = scan.nextInt();
		double a, b, c, x, x1, x2;
		switch (tn) {
		case 1:
			a = scan.nextDouble();
			b = scan.nextDouble();
			if (a == 0 && b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else if (a == 0 && b != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				x = -b / a;
				System.out.println("Nghiem cua phuong trinh la: " + x);
			}
			break;
		case 2:
			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (a == 0 && b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else if (a == 0 && b != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (a != 0) {
				if (delta < 0) {
					System.out.println("Phương trình vô nghiệm");
				} else if (delta == 0) {
					x = -b / (2 * a);
					System.out.println("Nghiệm kép x = " + x);
				} else if (delta > 0) {
					x1 = (-b + Math.sqrt(delta)) / (2 * a);
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.println("x1 = " + x1);
					System.out.println("x2 = " + x2);
				}
			}
			break;
		case 3:
			int n = scan.nextInt();
			int money;
			if (n <= 100) {
				money = n * 1000;
			} else {
				money = 100 * 1000 + (n - 100) * 1500;
			}
			System.out.println("Tiền điện cần đóng là: " + money);
			break;
		case 4:
			System.exit(0);
		}
		scan.close();
	}
}
