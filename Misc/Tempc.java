//WAP to convert the given temperature in Fahrenheit to Celcius using the folloing conversion formula:
// C = F-32/1.8

class Tempc
{
    public static void main(String args[])
    {
      double f = 100.0, c;
      System.out.println("Degree in Fahrenheit = " + f);
      c = (f-32)/1.8;
      System.out.println("Degree in Celcius = " + c);
    }
}