class excep_finally1
{
static int show()
{
try
{
System.out.println("inside try block");
int x=10/0;
}
catch(Exception e)
{

System.out.println(e);
return 3;
}
finally
{
System.out.println("inside finally block");
return 2;
}
}
public static void main(String arg[])
{
int result=show();
System.out.println("returned value "+result);
}
}
