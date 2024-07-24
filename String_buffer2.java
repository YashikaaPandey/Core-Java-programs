class String_buffer2
{
public static void main(String arg[])
{
StringBuilder stbu=new StringBuilder();
//intial object size
System.out.println(stbu.capacity());
StringBuffer stbr=new StringBuffer("umika");
System.out.println(stbr);
stbr.append("youvansh");
System.out.println(stbr);
stbr=new StringBuffer("sachin");
System.out.println(stbr);
}}