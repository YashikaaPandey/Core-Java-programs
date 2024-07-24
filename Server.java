import java.net.*;
import java.io.*;
class Server
{
public static void main(String arg[])throws Exception
{
//create a server socket with some port no
ServerSocket ss=new ServerSocket(777);

//let the server wait till a client accept connection
Socket s=ss.accept();
System.out.println("connection established");

//attach the output stream to the server socket
OutputStream obj=s.getOutputStream();

//attach the print stream to send data to the server socket
PrintStream ps=new PrintStream(obj);
String str="hello client";
ps.println(str);
ps.println("now server send data to client");
ps.println("bye");
ps.close();
ss.close();
s.close();
}}