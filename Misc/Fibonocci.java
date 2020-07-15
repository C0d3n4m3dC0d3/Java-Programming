//Fibonocci Series
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, . . . . . . 
import java.util.Scanner;

class Fibonocci
{
	public static void main(String args[])
	{
		int n;
		System.out. print("Enter the no. of Fibonocci numbers to display:: ");
		Scanner ip = new Scanner(System.in);
		n = ip.nextInt();
		
		print_fibonocci(n);
	}
	
	static void print_fibonocci(int n)
	{
		int a = 0, b = 1, c, i;
		System.out.println("First " + n + " Fibonocci numbers");
		System.out.println("--------------------------");
		System.out.println(a + "\n" + b);
		for(i = 2; i<n; i++)
		{
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
