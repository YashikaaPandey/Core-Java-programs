class base
{
 int x=10; //overriddenn
}
class child1 extends base
{
 int x=20; //override
 void show()
{
 System.out.println(x);
 System.out.println(super.x);
}
public static void main(String arg[])
{
 child1 c=new child1();
 c.show();
}}
