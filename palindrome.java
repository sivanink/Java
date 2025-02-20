import java.util.*;
public class palindrome
{
	public static void main(String args[])
	{
		int r,temp,n,sum=0;
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is Not Palindrome");
		}
	}
}
