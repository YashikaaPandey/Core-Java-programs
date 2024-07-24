import java.io.*;
class file_excep
{
public static void main(String arg[])
{
try{
FileInputStream ps=new FileInputStream("yux.txt");
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
//System.out.println("file saved successfully");
}}