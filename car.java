abstract class car
{
 static {
{
 System.out.println("1");
}
public car(String name)
{
super();
System.out.println("2");
}
{
System.out.println("3");
}}
class bluecar extends car
{
 System.out.println("4");
}
public bluecar()
{
super("blue");
System.out.println("5");
}
public static void main(String arg[])
{
new bluecar();
}}