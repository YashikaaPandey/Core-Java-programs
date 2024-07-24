class exce2_try
{
 public static void main(String arg[])
{
 try
{
 String s="yashika";
 int i=Integer.parseInt(s);
}
catch(NumberFormatException e)
{
System.out.println(e);
}}}