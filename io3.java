import java.io.*;
class io3
{
public static void main(String arg[])throws Exception
{
FileOutputStream fout=new FileOutputStream("abc1.txt");
PrintStream pout=new PrintStream(fout);
pout.println("welcome");
pout.println("welcome java");
pout.println("welcome to my java");
pout.println(2024);
pout.close();
fout.close();
}}