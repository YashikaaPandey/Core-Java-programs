abstract class animal
{
 abstract void fly();
 void nonfly()
{
System.out.println("animal non fly call");
}
}
class bird extends animal
{
void fly()
{
 System.out.println("bird fly call");
}
void show()
{
 System.out.println("bird show call");
}
public static void main(String arg[])
{
bird b=new bird();
b.fly();
b.nonfly();
b.show();
}}