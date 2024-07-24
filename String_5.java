class String_4
{
public static String s1="hello india";
}
class String_5

{
static String s2="hello india";
public static void main(String arg[])
{
String s3="hello"+"india";
String s4=new String("hello india");
String s5=new String("hello")+"india";
System.out.println(String_4.s1==s2);
System.out.println(s2==s3);
System.out.println(s3==s4);
System.out.println(s4==s5);
System.out.println(String_4 .s1.equals(s5));
System.out.println(s4.equals(s2));
}}