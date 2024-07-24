import java.util.StringJoiner;
class String_joiner
{
public static void main(String arg[])
{
StringJoiner js=new StringJoiner(",","[","]");
js.add("umika");
js.add("youvansh");
js.add("pooja");
System.out.println(js);
}}