import java.io.*;
class bufferwriter

{
public static void main(String arg[])throws Exception
{
FileWriter fw=new FileWriter("abc2.txt");
BufferedWriter buff=new BufferedWriter(fw);
buff.write("welcome to java developer");
buff.close();
System.out.println("success");
}}