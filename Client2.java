import java.net.*;
import java.io.*;
class Client2
{
public static void main(String arg[])throws Exception
{
//create a server socket with some port no
Socket s=new Socket("localhost",8888);
//to send data to server

DataOutputStream dos=new DataOutputStream(s.getOutputStream());

//to read data from keyboard
BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
String str, str1;
while(!(str=kb.readLine()).equals("exit"))
{
dos.writeBytes(str+"\n");
str1=br.readLine();
System.out.println(str1);
}
dos.close();
br.close();
kb.close();
s.close();
}}
