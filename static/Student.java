class Student{
  int rno;
  String name;
  static String inst = "ASAS, Kochi";

  static void change(){
    inst = "Amrita Vishwa Vidyapeetham";
  }

  Student (String n, int r){
    rno = r;
    name = n;
  }

  void display(){
    System.out.println("Roll Number: " +rno);
    System.out.println("Name: " + name);
    System.out.println("Institution: " + inst);
  }

  public static void main(String[] args) {
    Student s1 = new Student("Abhirami", 001);
    Student s2 = new Student("Amrutha", 002);
    Student s3 = new Student("Anjana", 003);
    s1.display();
    s2.display();
    Student.change();
    s3.display();
  }
}
