class StringDemo

{
public static void main(String arg[])
{
char[] a={'A','B','C','D','E','F'};
byte b[]={65,66,67,68,69,70};
String s1=new String(a);
String s2=new String(a,2,3);
String s3=new String(b);
String s4=new String (b,0,3);
String s5=new String(s2);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
System.out.println(s1==s3);
System.out.println(s1==s5);
System.out.println(s2==s4);
}}
