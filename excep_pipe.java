class excep_pipe
{
public static void main(String arg[])
{
try
{
int x[]=new int[5];
x[1]=100;
int y=10/0;
}
catch(ArrayIndexOutOfBoundsException|ArithmeticException e)
{
System.out.println(e);
}
}
}