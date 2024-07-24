import java.net.*;
import java.io.*;
class Server2
{
public static void main(String arg[])throws Exception
{
//create a server socket with some port no
ServerSocket ss=new ServerSocket(8888);
//connect it to cleint socket
Socket s=ss.accept();
System.out.println("connection established");

//to send data to the cleint

PrintStream ps=new PrintStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

//to read data comming from the cleient

BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
String str, str1;
while((str=br.readLine())!=null)
{
System.out.println(str);
str1=kb.readLine();
ps.println(str1);
}
ps.close();
br.close();
kb.close();
ss.close();
s.close();
System.exit(0);
}}}

