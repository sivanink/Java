import java.util.*;
public class matrix
{
	public static void main(String args[])
	{
		int a[][]=new int[20][20];
		int b[][]=new int[20][20];
		int c[][]=new int[20][20];
		int i,j,r1,r2,c1,c2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows of first matrix:");
		r1=sc.nextInt();
		System.out.println("Enter number of columns of first matrix:");
		c1=sc.nextInt();
		System.out.println("Enter elements of first matrix:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter number of rows of second matrix:");
		r2=sc.nextInt();
		System.out.println("Enter number of columns of second matrix:");
		c2=sc.nextInt();
		System.out.println("Enter elements of second matrix:");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of Matrices:");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
