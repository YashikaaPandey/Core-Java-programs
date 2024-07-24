class a_s_count
{
 public static void main(String arg[])
{
 String str="this is my java batch";
 int count=0;
//counts each character
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)!=' ')
{
count++;
}}
System.out.println("Total no of characters in a string:" +count);
}}