package Assignment_01;
import java.util.Scanner;

public class Q1 {
    

	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Student obj = new Student(sc.nextLine(), sc.nextInt(), sc.next(), sc.nextInt());
		Student obj1 = new Student(sc.nextLine(), sc.nextInt(), sc.next(), sc.nextInt());
		Student obj2 = new Student(sc.nextLine(), sc.nextInt(), sc.next(), sc.nextInt());
		Student obj3 = new Student(sc.nextLine(), sc.nextInt(), sc.next(), sc.nextInt());
		Student obj4 = new Student(sc.nextLine(), sc.nextInt(), sc.next(), sc.nextInt());
		Student obj5 = new Student(sc.nextLine(), sc.nextInt(), sc.next(), sc.nextInt());
		//Getting the result 
		Student result = new Student();
		result.get_avg();
		

	}

}

class Student
{
	String name;
	int age;
	String Section;
	int percentage; //assuming percentage to be discrete value
	static int avg_per = 0;
	
	Student()
	{
		age = 0;
		percentage = 0;
	}
	Student(String s, int a, String sec, int per) // Constructor name should be equal to class name
	{
		name = s;
		age = a;
		Section = sec;
		percentage = per;
		avg_per += per;
	}
	
	void get_avg()
	{
		int average = avg_per/6;
		System.out.println("Average is "+average+"%"); 
	}
}