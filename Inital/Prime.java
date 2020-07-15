//Prime Number

import java.util.Scanner;

class Prime
{
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter number : ");
		Scanner ip = new Scanner(System.in);
		num = ip.nextInt();
		
		if(check_Prime(num))
			System.out.println(num + " is a prime number!");
		else
			System.out.println(num + " is not a prime number!");
	}
	
	static boolean check_Prime(int n)
	{
		int fact = 0, i;
		for(i = 2; i<= n/2; i++)
		{
			if(n%i == 0)
			{
				fact = 1;
				break;
			}
		}
		return fact == 0? true: false;
	}
}
