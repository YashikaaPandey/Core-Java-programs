import java.io.*;
class io2
{
public static void main(String arg[])throws Exception
{
FileReader fr=new FileReader("abc.txt");
int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);

}
fr.close();
}}
