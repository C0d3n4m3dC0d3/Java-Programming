class Animal{
  Animal(){
    System.out.println("Animal created!");
  }
}

class Dog extends Animal{
  Dog(){
    System.out.println("A puppy is born!");
  }
}

class Super{
  public static void main(String args[]){
    Dog d = new Dog();
  }
}
