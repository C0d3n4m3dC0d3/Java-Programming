//Armstrong Number

import java.util.Scanner;

class Armstrong
{
	public static void main(String args[])
	{
		int arm;
		System.out.print("Enter no: ");
		Scanner ip = new Scanner(System.in);
		arm = ip.nextInt();
		
		if(check_Armstrong(arm))
			System.out.println(arm + " is an armstrong number.");
		else
			System.out.println(arm + " is  not an armstrong number.");
	}
	
	static boolean check_Armstrong(int n)
	{
		int sum = 0, arm = n, d;
		while(n!=0)
		{
			d = n%10;
			sum+=(d*d*d);
			n/=10;
		}
		return sum == arm? true: false;
	}
}
