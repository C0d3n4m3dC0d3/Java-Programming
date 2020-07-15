/*
  14. Create a package 'student.fulltime.BCA' in your current working directory.
  a. Create a default class Student in the above package with the following
  attributes: name, age and sex.
  b. Have methods for storing as well as displaying.
*/
import java.util.Scanner;

default class Student
{
  int age;
  String name, sex;

  void getData()
  {
    Scanner ip = new Scanner(System.in);
    System.out.print("Enter name: ");
      name = ip.nextLine();
    System.out.print("Enter age: ");
      age = ip.nextInt();
    System.out.print("Enter gender: ");
      ip.nextLine();
      sex = ip.nextLine();
      ip.nextLine();
  }

  void display()
  {
    System.out.println("Student Details:");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + sex);
  }
}
