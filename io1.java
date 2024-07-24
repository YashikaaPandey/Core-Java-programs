import java.io.*;
class io1
{
public static void main(String arg[])
{
try
{
FileWriter fw=new FileWriter("abc.txt");
fw.write("welcome");
fw.close();
}
catch(Exception e)
{
System.out.println(e);
}}}