class Animal{
  void eat(){
    System.out.println("I eat food!");}
  void walk(){
    System.out.println("I walk!");}
}

class Cat extends Animal{
  void eat() {
    System.out.println("Cat eats ghatia!");}
  void c_walk() {
    System.out.println("I walk too!");}
}

class Monkey extends Animal{
  void eat(){
    System.out.println("Monkeys eat bananas!"); }
}

class Elephant extends Animal{
  void eat(){
    System.out.println("Elephants eat salt mangoes!");}
}

class Overload{
  public static void main(String[] args) {
    Animal a = new Animal(); // pure Parent class object

    Animal c = new Cat(); // Parent object referring Child class
    //This object can only access all parent class methods as well as the overridden child class method.
    //It cannot access any other child class method.
    /*
      Demo here!
      c.walk(); //Calling parent class methods
      c.c_walk(); //Calling child class method - Not overridden - Gives error: variable c of type Animal
    */

    //Monkey m = new Animal(); // Child object referring Parent class  -- Cannot do this! Compile-time error!

    Elephant e = new Elephant(); //pure Child class object

    //Calling the eat() method
    System.out.print("pure_parent.eat() =>");
    a.eat();  //Calls parent.eat();
    System.out.print("parent->child.eat() =>");
    c.eat(); // Calls child.eat();
    System.out.print("pure_child.eat() =>");
    e.eat();  //Calls child.eat();
  }
}

/*
OUTPUT:
pure_parent.eat() =>I eat food!
parent->child.eat() =>Cat eats ghatia!
pure_child.eat() =>Elephants eat salt mangoes!
*/
