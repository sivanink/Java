import java.util.*;
import java.io.*;
class file
{
public static void main(String args[])
{
try
{
FileWriter f1=new FileWriter("sample3.txt");
FileReader f2=new FileReader("sample3.txt");
int i;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the string:");
String s=sc.nextLine();
f1.write(s);
while((i=f2.read())!=-1)
{
System.out.println((char)i);
}
f1.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}
