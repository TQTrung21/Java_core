package OOP;

public class Student {

	String name;
	int age;

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "Trung";
		st1.age = 20;
		System.out.println("Name: " + st1.name + " and age: " + st1.age);
	}
}
