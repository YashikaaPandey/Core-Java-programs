class catchhandle
{
public static void main(String arg[])
{
 try
{
 int data=10/0;
}
catch(ArithmeticException e)
{

String s=null;
System.out.println(s.length());
System.out.println(e);
}}}