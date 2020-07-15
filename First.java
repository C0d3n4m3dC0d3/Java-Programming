/*11.*/
/*Write a java program to create a Student class with following attributes:
Enorollment/Roll No,
Name,
Mark of Sub1, Sub2, Sub3 and Total Marks.
Total of the three marks must be calculated only when the student passes in all the three subjects.
The pass mark for each subject is 50. If the candidate fails in any of the subject his total marks must be declared as 0.
Using this condition, write a constructor of this class. Write separate functions for accepting and displaying student deatils.
In the main method, create 3 student objects and display the deatils.*/

import java.util.Scanner;
class Student
{
	int rno;
	String name;
	float m1, m2, m3, tm;
	final float psm = 50.0f;

	Student(String n, int r, float a, float b, float c)
	{
		name = n;
		rno = r;
		m1 = a;
		m2 = b;
		m3 = c;
		tm = m1 < psm || m2 < psm || m3 < psm ? 0.0f : m1+m2+m3;
	}

	Student getData()
	{
		int r;
		String n;
		float a, b, c;
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter Name: ");
			n = ip.nextLine();
		System.out.print("Enter Roll No: ");
			r = ip.nextInt();
		System.out.print("Enter Marks of Subject 1: ");
			a = ip.nextFloat();
		System.out.print("Enter Marks of Subject 2: ");
			b = ip.nextFloat();
		System.out.print("Enter Marks of Subject 3: ");
			c = ip.nextFloat();
			ip.nextLine();
		Student s = new Student(n, r, a, b, c);
		return s;
	}

	void display()
	{
		System.out.println("Roll No:: " + rno);
		System.out.println("Name :: " + name);
		System.out.println("Mark in Subject 1:: " + m1);
		System.out.println("Mark in Subject 2:: " + m2);
		System.out.println("Mark in Subject 3:: " + m3);
		System.out.println("Total Marks:: " + tm);
		System.out.println("\n");
	}

	public static void main(String args[])
	{
		int i;
		Student s[] = new Student[3];

		System.out.println("Enter details of 3 students\n");
		for(i = 0; i<3; i++)
		{
 		  s[i] = s[i].getData();
 		  System.out.println("\n");
 		}

		System.out.println("\nStudent Details\n");
	  for(i = 0; i<3; i++)
		{
			s[i].display();
		}
	}
}
