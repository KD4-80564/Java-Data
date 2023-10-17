package com.sunbeam;
import java.util.Arrays;
import java.util.Comparator;

class Main
{
	public static void main(String args[])
	{
Student[] arr=new Student[5];
arr[0]=new Student(100,"Shrinivas","Nagpur",88.88);
arr[1]=new Student(101,"Sahil","Nagpur",85.44);
arr[2]=new Student (102,"Shivansh","Delhi",89.87);
arr[3]=new Student (103,"Pratik","Wardha",88.55);
arr[4]= new Student(104,"Shrinivas","Banglore",88.77);
System.out.println("\nSize: " + arr.length);

class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student e1, Student e2) {
		int diff = -e1.getCity().compareTo(e2.getCity());
		if(diff == 0)
		diff=-Double.compare(e1.getMarks(),e2.getMarks());
		if(diff ==0)
	    diff = e1.getName().compareTo(e2.getName());
		return diff;
	}}
	StudentComparator comparator = new StudentComparator();
	Arrays.sort(arr, comparator);
	System.out.println("After Sort by marks Name and City: ");
	for (Student e : arr)		
		System.out.println(e);




}}
