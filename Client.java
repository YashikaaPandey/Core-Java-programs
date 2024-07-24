import java.net.*;
import java.io.*;
class Client
{
public static void main(String arg[])throws Exception
{
//create a server socket with some port no
Socket s=new Socket("localhost",777);

//to read data from the server ,attach inputstream to the socket
InputStream obj=s.getInputStream();
BufferedReader br=new BufferedReader(new InputStreamReader(obj));

//recieve strings

String str;
while((str=br.readLine())!=null)
{
System.out.println("from server:"+ str);
}
br.close();
s.close();
}}