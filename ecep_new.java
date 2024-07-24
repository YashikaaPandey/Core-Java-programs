class ecep_new
{
public static void main(String arg[])
{
try
{
System.out.println("inside the block");
System.exit(0);
}
catch (Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("finally block");
}}}