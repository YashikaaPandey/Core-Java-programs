class exce3_jugad
{
public static void main(String arg[])
{
try
{
try
{
int x[]=new int [5];
x[10]=1000;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
int x=10/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}