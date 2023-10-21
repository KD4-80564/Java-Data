import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.*;
import java.util.Objects;
import java.util.Scanner;

 class Student {
	private int roll;
	private String name;
	private int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter roll number ");
		this.roll = sc.nextInt();
		System.out.print("Enter Student Name ");
		this.name = sc.next();
		System.out.print("Enter Student Age = ");
		this.age = sc.nextInt();
	}

//	public int hashCode() {
//		int hash = Objects.hash(this.roll);
//		return hash;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null)
//			return false;
//		if (this == obj)
//			return true;
//		if (obj instanceof Student) {
//			Student s = (Student) obj;
//			if (this.roll == s.roll) {
//				return true;
//			}
//		}
//		return false;
//	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}

}
public class LinHashMapStudent {
	public static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Insert in a Map");
		System.out.println("2. Find in a Map");
		System.out.println("Enter your choice ");
		int choice = new Scanner(System.in).nextInt();
		return choice;

	}

	public static void main(String[] args) {

		LinkedHashMap<Integer, Student> map = new LinkedHashMap<>();

		int choice;

		do {
			choice = menu();
			switch (choice) {
			case 1://
			{
				Student s = new Student();
				s.acceptData();

				map.put(s.getRoll(), s);
				System.out.println("Added Successfully");
			}
				break;

			case 2: {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter key to find");
				Integer roll = sc.nextInt();
				Student s1 = map.get(roll);
				System.out.println(s1);

			}
				break;
			case 3: { // print all entries
				Set<Entry<Integer, Student>> entries = map.entrySet();

				for (Entry<Integer, Student> e : entries) {
					System.out.println(e.getKey() + "," + e.getValue());
				}
			}
				break;
			}
		} while (choice != 0);
	}

}