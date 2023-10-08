import java.util.Scanner;

/*Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.*/
public class Time1
{
	Scanner sc=new Scanner(System.in);
int day;
int month;
int year;
public Time1()
{
	this.day=0;
	this.month=0;
	this.year=0;
}
public Time1(int day,int month,int year)
{
	this.day=day;
	this.month=month;
	this.year=year;
}
public int getDay()
{
	return this.day;
}
void setday(int day)
{
	this.day=day;
}
public int getmonth()
{
	return this.day;
}
void setmonth(int month)
{
	this.month=month;
}
public int getyear()
{
	return this.year;
}
void setyear(int year)
{
	this.year=year;
}
void acceptTime()
{
	System.out.println("Day:"+this.day+"Month:"+this.month+"Enter Year"+this.year);
	day=sc.nextInt();
	
	month=sc.nextInt();
	
	year=sc.nextInt();
}
void displayTime()
{
	
	System.out.println(this.day+"/"+this.month+"/"+this.year);
}



}
