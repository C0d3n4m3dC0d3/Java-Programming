//Parent Class
class Vehicle
{
  String vType, name, brand, type;
  float speed;
  Vehicle(String v, String n, String b, float s, String t)
  {
    vType = v;
    name = n;
    brand = b;
    speed = s;
    type = t;
  }
  public void disp_V()
  {
    System.out.println("Vehicle: " + type + " " + vType);
    System.out.println("Brand: " + brand);
    System.out.println("Name: " + name);
    System.out.println("Speed: " + speed + "kmph");
  }
}

//Child Class #1
class Tw extends Vehicle
{
  Tw(String n, String b, String t, int s, String tp)
  {
    super(t, n, b, s, tp);
  }

  public void disp()
  {
    System.out.println("Hey! I'm a two wheeler!");
    disp_V();
  }
}

//Child Class #2
class Fw extends Vehicle
{
  int nseats;

  Fw(String n, String b, String t, float s, int ns, String tp)
  {
    super(t, n, b, s, tp);
    nseats = ns;
  }

  public void disp()
  {
    System.out.println("Hey! I'm a four wheeler!");
    System.out.println("And, I have " + nseats + " seats!\n#get_comfy!!");
    disp_V();
  }
}

//Main Class
class Heirarchy
{
  public static void main(String args[])
  {
    Tw t1 = new Tw("Ryder", "Honda", "Bike", 60, "Sports");
    Tw t2 = new Tw("Scooty Pept", "Honda", "Scooter", 40, "");
    Fw f1 = new Fw("KWID", "Renault", "Car", 60, 5, "Sports");
    Fw f2 = new Fw("WagonR", "Maruti Suzuki", "Car", 55, 4, "Family");

    nl();
    System.out.println("Vehicle Catalog just for you ;) !!");nl();
    t1.disp();nl();
    t2.disp();nl();
    f1.disp();nl();
    f2.disp();nl();
  }
  static void nl()
  {
    System.out.println();
  }
}
