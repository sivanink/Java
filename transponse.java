import java.util.*;
public class matrix
{
	public static void main(String args[])
	{
		int a[][]=new int[20][20];
		int b[][]=new int[20][20];
		int c[][]=new int[20][20];
		int d[][]=new int[20][20];
		int i,j,k,r1,r2,c1,c2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("----FIRST MATRIX----");
		System.out.println("Enter rows:");
		r1=sc.nextInt();
		System.out.println("Enter columns:");
		c1=sc.nextInt();
		System.out.println("Enter elements:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("----SECOND MATRIX----");
		System.out.println("Enter rows:");
		r2=sc.nextInt();
		System.out.println("Enter columns:");
		c2=sc.nextInt();
		System.out.println("Enter elements:");
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
		
		
		 for (i = 0; i < r1; i++) 
		 {
            for (j = 0; j < c2; j++)
            {
                for (k = 0; k < c1; k++) {
                    d[i][j]=a[i][k] *b[k][j];
                }
            }
        }
        
        System.out.println("Product Matrix:");
        for (i = 0; i < r1; i++)
        {
            for (j = 0; j < c2; j++)
            {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
		
		System.out.println("Transpose of Product Matrix:");
        for (i = 0; i < c2; i++)
        {
            for (j = 0; j < r1; j++)
            {
                System.out.print(d[j][i] + " ");
            }
            System.out.println();
        }

		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
