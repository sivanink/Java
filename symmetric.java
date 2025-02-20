import java.util.*;
public class symmetric
{
	public static void main(String args[])
	{
		int i,j,r,c;
		int a[][]=new int [20][20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter the matrix elements:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix is:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
			boolean isSym=true;
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					if(a[i][j]!=a[j][i])
					{
						isSym=false;
						break;
					}
				}
			if(!isSym)
			{
			break;
			}
			}
			if(isSym)
			{
				System.out.println("Is symmetric Matrix");
			}
			else
			{
				System.out.println("Is not symmetric Matrix");
			}
			sc.close();
		}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
