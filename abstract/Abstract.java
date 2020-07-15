abstract class Bike
{
  Bike()
  {
    System.out.println("Bike created!");
  }

  abstract void run();
  abstract void stop();
  void gearChange(int g)
  {
    System.out.println("The gear is changed to " + g + ".");
  }
}

class Honda
{
  void run()
  {
    System.out.println("Honda is running!");
  }

  void stop()
  {
    gearChange(1);
    System.out.println("Honda has stopped running!");
  }
}

class Pulsar
{
  void run()
  {
    System.out.println("Pulsar is running!");
  }
  void stop()
  {
    gearChange(1);
    System.out.println("Pulsar has stopped running!");
  }
}

class Abstract
{
  public static void main(String[] args){
    Bike obj;
    obj = new Honda();
      obj.run();
      obj.gearChange(4);
      obj.run();
    obj = new Pulsar();
        obj.run();
        obj.gearChange(3);
        obj.run();
        obj.stop();
  }
}
