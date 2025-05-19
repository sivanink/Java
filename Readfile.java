import java.io.*;
class Readfile
{
public static void main(String args[])throws IOException
{
FileInputStream f=new FileInputStream("sample.txt");
FileOutputStream f2=new FileOutputStream("cp.txt");
int c;
while((c=f.read())!=-1)
{
f2.write(c);
System.out.print((char)c);
}
f.close();
f2.close();
}
}

