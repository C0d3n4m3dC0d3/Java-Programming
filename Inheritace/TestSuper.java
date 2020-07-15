class Animal
{
  Animal()
  {
    System.out.println("Animal object created!");
  }
}

class Dog extends Animal
{
  Dog()
  {
    System.out.println("Dog object created!");
  }
}

class TestSuper
{
  public static void main(String[] args) {
    Dog d = new Dog();
  }
}

/*
Output:
  Animal object created!
  Dog object created!
*/
