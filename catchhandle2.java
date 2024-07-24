class catchhandle2
{
 public static void main(String arg[])
{
 try
{
 int x[]=new int[5];
 x[10]=1000;
}
catch(ArithmeticException e)
{
 System.out.println(e);
}}}