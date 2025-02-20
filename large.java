import java.util.*;
public class large
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Enter three Numbers:");
		Scanner op=new Scanner(System.in);
		a=op.nextInt();
		b=op.nextInt();
		c=op.nextInt();
		if(a>b && a>c)
		{
			System.out.println("Largest Number:"+a);
		}
		else if(b>c)
		{
			System.out.println("Largest Number:"+b);
		}
		else
		{
			System.out.println("Largest Number:"+c);
		}
	}
}	
