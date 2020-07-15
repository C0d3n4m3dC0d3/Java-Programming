import java.util.Scanner;

class Evod
{
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter a number:: ");
		Scanner ip = new Scanner(System.in);
		num = ip.nextInt();
		if(num%2 == 0)
			System.out.println(num + " is an even number.");
		else
			System.out.println(num + " is an odd number.");
	}
}
