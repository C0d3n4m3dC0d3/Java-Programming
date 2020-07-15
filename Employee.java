/*
  13. Write a Java program to define a class called Employee with the name
  and date of appointment. Create 10 employee objects as an array and
  sort them as per their date of appointment, i.e, print them as per
  their seniority.
*/
import java.util.Scanner;
import java.util.Date;
class Employee  {
 String name;
 Date date;
 Employee (String n, Date d){
  name = n;
  date = d;
 }

 public static void main(String args []) {
   System.out.println("Enter details of 10 employees:");
   Employee e[] = new Employee[10];
   String n;
   int d, y, m, i;
   Scanner ip = new Scanner(System.in);
   for(i = 0; i<10; i++)
   {
     System.out.println("\nEmployee " + (i+1));
     System.out.print("Enter name: ");
      n = ip.nextLine();
     System.out.println("Enter appointment details:");
     System.out.print(" Date: ");
      d = ip.nextInt();
     System.out.print(" Month: ");
      m = ip.nextInt();
     System.out.print(" Year: ");
      y = ip.nextInt();
      ip.nextLine();
      Date date = new Date(y, m, d);
      e[i] = new Employee(n, date);
    }
  }
}
