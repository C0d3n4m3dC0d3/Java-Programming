//Number Palindrome
import java.util.Scanner;

class NumPal
{
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter number : ");
		Scanner ip = new Scanner(System.in);
		num = ip.nextInt();
		
		if(check_nPalindrome(num))
			System.out.println(num + " is a palindrome!");
		else
			System.out.println(num + " is not a palindrome!");
	}
	
	static boolean check_nPalindrome(int num)
	{
		int n = num, pal = 0;
		while(n != 0)
		{
			pal = (pal*10)+ (n%10);
			n/=10;
		}
		return pal == num? true: false;
	}
}
