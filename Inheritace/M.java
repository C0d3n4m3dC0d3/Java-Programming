interface A{
  void a();
  void b();
  void c();
  void d();
}

abstract class B implements A {
  public void c()
  {
    System.out.println("I am C");
  }
}

class M extends B
{
  public void a()
  {
    System.out.println("I am A");
  }
  public void b()
  {
    System.out.println("I am B");
  }
  public void d()
  {
    System.out.println("I am D");
  }
  public static void main(String[] args) {
    A m = new M();
    m.a();
    m.b();
    m.c();
    m.d();
  }
}
