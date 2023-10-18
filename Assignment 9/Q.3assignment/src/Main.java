import java.util.Arrays;
import java.util.Comparator;


public class Main {
	
	public static void main(String[] args) {
	student[] arr = new student[5];
	arr[0] = new student(3, "Nilesh", "pune",93);
	arr[1] = new student(1, "Sarang", "karad",94);
	arr[2] = new student(4, "Prashant","satara", 95);
	arr[3] = new student(5, "Prashant", "pune",96);
	arr[4] = new student(2, "Nitin", "kolhapur",98);
	
	System.out.println("Before Sort: ");
	for (student e : arr)
		System.out.println(e);
	
	Arrays.sort(arr);
	
	System.out.println("After Sort by Empno: ");
	for (student e : arr)
		System.out.println(e);
	
	class studentNameComparator implements Comparator<student>
	{
		@Override
		public int compare(student s1, student s2) {
			int diff = -s1.getCity().compareTo(s2.getCity());
			if(diff == 0)
			diff = - Double.compare(s1.getMarks(), s2.getMarks());
			if(diff == 0)
				diff =s1.getName().compareTo(s2.getName());
			return diff;
		} 
	
	}
	studentNameComparator nameComparator = new studentNameComparator();
	Arrays.sort(arr, nameComparator);
	System.out.println("After Sort by Name: ");
	for (student s : arr)
		System.out.println(s);	

	}
}

	
