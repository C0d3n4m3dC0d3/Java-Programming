//Parent Class
class Vehicle
{
  String vType;
  Vehicle(String v)
  {
    vType = v;
  }
  public void disp_V()
  {
    System.out.println("Vehicle Type: " + vType);
  }
}

//Child Class
class Car extends Vehicle
{
  String cBrand, cName, cType;
  Car(String c, String b, String n)
  {
    super("Car");
    cBrand = b;
    cName = n;
    cType = c;
  }

  public void disp_C()
  {
    disp_V();
    System.out.println("Type: " + cType);
    System.out.println("Brand: " + cBrand);
    System.out.println("Name: " + cName);
  }
}

//Main Class
class Simple
{
  public static void main(String args[])
  {
    Car c1 = new Car("Sports", "Renault", "KWID Climber");
    Car c2 = new Car( "SUV", "Toyota", "Qualis");
    System.out.println("Car Catalog");
    System.out.println("-----------");
    System.out.println();
    c1.disp_C();
    System.out.println();
    c2.disp_C();
    System.out.println();
  }
}
