import java.io.*;
class objSaver
{
public static void main(String arg[])
{
try
{
Student1 s1=new Student1("yashika","java",5100);
Student1 s2=new Student1("ika","java",5100);
s1.show();
s2.show();
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("std.obj"));
out.writeObject(s1);
out.writeObject(s2);
out.close();
System.out.println("successfully serialize");
}
catch(Exception e)
{
System.out.println(e);
}}}
