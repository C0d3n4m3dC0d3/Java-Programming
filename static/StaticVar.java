class Student
{
  int rollno;
  String name;
  static String college = "ASAS, Kochi";

  Student(int r, String n)
  {
    rollno = r;
    name = n;
  }

  void display()
  {
    System.out.println("Roll Number: " +rollno);
    System.out.println("Name: " + name);
    System.out.println("Institution: " + college);
  }
}

class StaticVar
{
  public static void main(String[] args) {
    Student s = new Student (1, "Abhirami A");
    Student s1 = new Student (2, "Amrutha Prasad");
    Student s2 = new Student (3, "Anjana M Nair");

    s.display();
    System.out.println();
    s1.display();
    System.out.println();
    s2.display();
    System.out.println();
    
  }
}
