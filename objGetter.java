import java.io.*;
class objGetter
{
public static void main(String arg[])
{
try
{
System.out.println("Deserizing following object");
ObjectInputStream in=new ObjectInputStream(new FileInputStream("std.obj"));
Student1 s1=(Student1)in.readObject();
Student1 s2=(Student1)in.readObject();
System.out.println("following object are serialized");
s1.show();
s2.show();
}
catch(Exception e)
{
System.out.println(e);
}}}