class String_6
{
 public static void main(String arg[])
{
String s="india";
char[] c=s.toCharArray();
for(int i=0;i<c.length;i++)
c[i]-=32;
System.out.println(new String(c));
}}