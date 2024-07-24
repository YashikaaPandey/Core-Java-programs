class exce_try
{
 public static void main(String arg[])
{
 
 try 
{
 int x=10/5;
 int z[]=new int[arg.length];
 z[10]=100;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
}
