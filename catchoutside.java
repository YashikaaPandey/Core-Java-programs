class catchoutside
{
public static void main(String arg[])
{
try
{
int data=10/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("rest statements");
}}
