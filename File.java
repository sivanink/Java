import java.io.*;
class File
{
	public static void main(String args[])
	{
	try
	{
		
		FileReader f1=new FileReader ("numbers.txt");
		FileWriter f2=new FileWriter ("odd.txt");
		FileWriter f3=new FileWriter ("even.txt"); 
		int i;
		while((i=f1.read()!=-1)
		{
		if(i%2==0)
		{
		f2.write(i);
		}
		else
		{
		f3.write(i);
		}
		}
		f1.close();
		f2.close();
		f3.close();
		}
	catch(IOException e)
	{
		System.out.println(e);
	}
	}
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
