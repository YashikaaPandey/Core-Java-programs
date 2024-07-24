import java.io.*;
class Printwriter
{
public static void main(String arg[])throws Exception
{
//used to write data on console
PrintWriter wr=new PrintWriter(System.out);  //system.out is used to print on console
wr.write("java is good language");
wr.flush();
wr.close();
//data to write in file
PrintWriter wr1=null;
wr1=new PrintWriter(new File("abc4.txt"));
wr1.write("java is a good lang");
wr1.flush();

}}
