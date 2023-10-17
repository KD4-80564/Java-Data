
/*public class Demo1 
{
	
		public static void printObjectArray(Object[] arr) {
			System.out.println("Object array:");
			for (Object ele : arr) {
				System.out.println(ele);
			}
		}
		
		public static <T> void printGenericArray(T[] arr) {
			System.out.println("Generic array:");
			for (T ele : arr) {
				System.out.println(ele);
			}
		}
		
		public static void main(String[] args) {
			Object[] arr1 = { 11, 22, 33 };
			printObjectArray(arr1);
			Object[] arr2 = { 1.1, 2.2, 3.3 };
			printObjectArray(arr2);
			Object[] arr3 = { "One", "Two", "Three" };
			printObjectArray(arr3);

			Integer[] arr4 = { 11, 22, 33 };
			printGenericArray(arr4);
			Double[] arr5 = { 1.1, 2.2, 3.3 };
			printGenericArray(arr5);
			String[] arr6 = { "One", "Two", "Three" };
			printGenericArray(arr6);
			
		}
	}


*/








/*public class Demo1{
	public static <T> void swap(T a, T b) {
		T t = a;
		a = b;
		b = t;
		System.out.println("In swap(): a = " + a + ", b = " + b);
	}
	
	public static void main(String[] args) {
		/* In yesterda1y's Box class demo --
		 * Box<Integer> b1 = new Box<>();
		 * b1.set(22);
		 * Box<Double> b2 = new Box<>();
		 * b2.set(2.2);
		 * 
		
		Integer i1 = 10, i2 = 20;
		System.out.println("Before swap(): i1 = " + i1 + ", i2 = " + i2);
		Demo1.swap(i1, i2); // T=Integer --> Demo02Main.swap(Integer, Integer);
		
		Double d1 = 1.1, d2 = 2.2;
		System.out.println("Before swap(): d1 = " + d1 + ", d2 = " + d2);
		Demo1.swap(d1, d2); // T=Double --> Demo02Main.swap(Double, Double);
	
		System.out.println("Before swap(): i1 = " + i1 + ", d2 = " + d2);
		Demo1.swap(i1, d2); // T=Number --> Demo02Main.swap(Number, Number);
	
		//Demo02Main.<Integer>swap(i1, d2); // T=Integer --> Demo02Main.swap(Integer, Integer);
					// compiler error: cannot convert Double to Integer

		Integer i = 1;
		String s = "One";
		System.out.println("Before swap(): i = " + i + ", s = " + s);
		Demo1.swap(i, s); // T=Object --> Demo02Main.swap(Object, Object);
	}
}
*/





import java.util.Arrays;

class Employee implements Comparable<Employee> {
	private int empno;
	private String name;
	private double salary;
	public Employee() 
	{
	}
	public Employee(int empno, String name, double salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee other) {
		int diff = this.empno - other.empno;
		//int diff = this.name.compareTo(other.name);
		//int diff = Double.compare(this.salary, other.salary);
		return diff;
	}
}





public class Demo1 extends Employee {
	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		
		
		arr[0] = new Employee(3, "Nilesh", 50000.0);
		arr[1] = new Employee(1, "Sarang", 70000.0);
		arr[2] = new Employee(4, "Vishal", 60000.0);
		arr[3] = new Employee(5, "Prashant", 30000.0);
		arr[4] = new Employee(2, "Nitin", 40000.0);

		System.out.println("Before Sort: ");
		for (Employee e : arr)
			System.out.println(e);

		Arrays.sort(arr);
	
		System.out.println("After Sort: ");
		for (Employee e : arr)
			System.out.println(e);
	}
}

