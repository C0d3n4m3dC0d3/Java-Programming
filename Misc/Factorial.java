//WAP to list the factorials of the numbers from 1 to 10 (use while loop)
class Factorial
{
   public static void main(String args[])
   {
     int x, i, fact;
     i = 1;

     while(i<=10)
     {
	x = i;
	fact = 1;
	while( x >= 1)
	{
	  fact*=x;
	  x--;
	}
	System.out.println(i+"! = "+fact);
	i++;
     }
   }
}