class exce1_try
{
 public static void main(String arg[])
{
 try
{
 String s=null;
 System.out.println(s.length());
}
catch(NullPointerException e)
{
 System.out.println(e);
}}}