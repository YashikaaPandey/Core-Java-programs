class throws2
{
static void show()throws
ArithmeticException,NullPointerException
{
int x=10/5;
String str=null;
System.out.println(str.length());
}
public static void main(String args[])
{
try
{
show();
}
catch(Exception e)
{
System.out.println(e);
}
}
}