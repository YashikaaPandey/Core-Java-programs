class excep_finally
{
public static void main(String arg[])
{
try
{
int x=10/0;
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("last block");
}
}}
