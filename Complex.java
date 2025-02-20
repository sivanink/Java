import java.util.*;
class Complex
{
int r;
int i;
public Complex(int r,int i)
{
this.r=r;
this.i=i; 
}
public void sum(Complex c1,Complex c2)
{
int x=c1.r+c2.r;
int y=c1.i+c2.i;
System.out.println("sum of two complex number is:"+x+"+"+y+"i");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real part  for first complex number:");
int r=sc.nextInt();
System.out.println("Enter the imaginery  part for first complex number:");
int i=sc.nextInt();
System.out.println("Enter the real part for second complex number:");
int r1=sc.nextInt();
System.out.println("Enter the  imaginery  part for second complex number:");
int i1=sc.nextInt();
Complex c1=new Complex(r1,i1);
Complex c2=new Complex(r,i);
Complex c3=new Complex(0,0);
c3.sum(c1,c2);
}
}
