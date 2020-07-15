class Addition
{
   public static void main(String args[])
   {
     int num1 = 89, num2 = 98, sum;
     sum = add(num1, num2);
     System.out.println("num1 = " + num1 + "\n" + "num2 = " + num2);
     System.out.println("sum = " + sum); 
   }

   int add(int n1, int n2)
   {
      return n1+n2;
    }
}