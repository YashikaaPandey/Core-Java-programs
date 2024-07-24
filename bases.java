abstract class bases
{
 final bases()
{
 System.out.println("base def call");
}
}
class child extends bases 
{
 child()
 {
 System.out.println("child def call");
}
public static void main(String arg[])
{
 child c=new child();
}}