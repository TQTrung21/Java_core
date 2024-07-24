package OOP;

public class Constructor {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student("Trung", 20);
		System.out.println(st2.name + " " + st2.age);
	}
}
